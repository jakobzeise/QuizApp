public class Helper {


    static User getUserByUserName(String userName) {
        for (User user : Quiz.users) {
            if (user.getUserName().equals(userName)) {
                return user;
            }
        }
        Console.showErrorMessage("User does not exist");
        return null;
    }

    static boolean checkPassword(String userName, String password) {
        for (User user : Quiz.users) {
            if (user.getUserName().equals(userName) && user.getPassword().equals(password))
                return true;
        }
        return false;
    }

    public static boolean containsUsername(String testingName) {
        for (User user : Quiz.users) {
            if (user.getUserName().equals(testingName)) return true;
        }
        return false;
    }
}
