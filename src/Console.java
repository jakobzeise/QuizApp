import java.util.Random;
import java.util.Scanner;

public class Console {

    static Scanner scanner = new Scanner(System.in);

    static User showHomeScreen() throws InterruptedException {
        System.out.println("Select One of the following Options:");
        System.out.println("1. Login");
        System.out.println("2. Signup\n");
        Thread.sleep(500);
        System.out.print("Type 1 or 2 into the console");
        int selection = 0;
        try {
            System.out.println();

            selection = scanner.nextInt();
            scanner.reset();
        } catch (Exception e) {
            Console.showErrorMessage("Please insert a valid input");
            showHomeScreen();
        }
        Thread.sleep(1000);


        if (selection == 1) {
            showLoginScreen();
        } else if (selection == 2) {
            showSignUpScreen();
        } else {
            Console.showErrorMessage("Invalid Input");
            return null;
        }

        return null;
    }

    private static void showSignUpScreen() throws InterruptedException {

        System.out.println("\nCreating new Account");
        System.out.println("---------------------\n");
        System.out.println("Create a username:");
        String username = scanner.next();
        System.out.println("Create a password:");
        String password = scanner.next();

        if (Helper.containsUsername(username)) {
            Console.showErrorMessage("User does already exist");
        } else Quiz.users.add(new User(username, password));

        showHomeScreen();
    }

    private static void showLoginScreen() throws InterruptedException {
        System.out.println("\nLog into Account:");
        System.out.println("---------------------\n");

        System.out.println("What is your username?");
        String userName = scanner.next();
        if (!Helper.containsUsername(userName)) {
            Console.showErrorMessage("User with username: " + userName + " " +
                    "does not exist");
            showHomeScreen();
        } else {
            System.out.println("What is your password?");
            String password = scanner.next();
            Thread.sleep(500);
            if (!Helper.checkPassword(userName, password)) {
                Console.showErrorMessage("Your password does not match");
                showHomeScreen();
            } else {
                System.out.println("\nYou are successfully logged in\n\n");
                Thread.sleep(500);
                showMainScreen(Helper.getUserByUserName(userName));
            }
        }
    }

    static void showErrorMessage(String errorMessage) {
        System.err.println("\n------------ Warning ------------");
        System.err.println(errorMessage);
        System.err.println("------------ Warning ------------\n");
    }

    public static void showMainScreen(User user) throws InterruptedException {
        System.out.println("Select One of the following Options:\n");
        Thread.sleep(500);
        System.out.println("1. Logout");
        System.out.println("2. Change Password");
        System.out.println("3. Change Username");
        System.out.println("4. Show Stats");
        System.out.println("5. Take Quiz\n");
        Thread.sleep(500);
        System.out.print("Type 1 or 5 into the console\n");

        int selection = scanner.nextInt();

        switch (selection) {
            case 1 -> showHomeScreen();
            case 2 -> changePassword(user);
            case 3 -> changeUserName(user);
            case 4 -> showStats(user);
            case 5 -> takeQuiz(user);
        }
    }

    private static void takeQuiz(User user) throws InterruptedException {
        int score = 0;
        int counter = 1;

        while (counter <= 5) {
            Random random = new Random();
            Question question = Data.getQuestions().get(random.nextInt(10));
            System.out.println(counter + ". " + question.getQuestion());
            System.out.println();
            System.out.println("1. " + question.getPossibleAnswerByIndex(0));
            System.out.println("2. " + question.getPossibleAnswerByIndex(1));
            System.out.println("3. " + question.getPossibleAnswerByIndex(2));
            System.out.println("4. " + question.getPossibleAnswerByIndex(3));
            int userAnswer = scanner.nextInt();
            if (question.getPossibleAnswerByIndex(userAnswer - 1).equals(question.getCorrectAnswer())) {
                score++;
            }
            System.out.println();
            counter++;

        }
        user.addScoreToStats(score);
        showMainScreen(user);

    }

    private static void showStats(User user) throws InterruptedException {
        if (user.getQuizStats() == null) {
            showErrorMessage("No quiz taken so far");
            showMainScreen(user);
        } else {
            showErrorMessage("these are the Quiz sessions:");
            showMainScreen(user);
            for (int i : user.getQuizStats()) {
                System.out.println(i + "/10 points\n");
            }
        }

    }

    private static void changeUserName(User user) {
        System.out.println("What is your current password?");
        if (user.getPassword().equals(scanner.next())) {
            System.out.println("Please type in your new username");
            user.setUserName(scanner.next());
        } else {
            showErrorMessage("Password does not match");
        }
    }

    private static void changePassword(User user) {
        System.out.println("What is your current password?");
        if (user.getPassword().equals(scanner.next())) {
            System.out.println("Please type in your new Password");
            user.setPassword(scanner.next());
        } else {
            showErrorMessage("Password does not match");
        }
    }


}
