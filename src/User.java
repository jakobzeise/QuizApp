import java.util.ArrayList;

public class User {

    private String userName;
    private String password;

    ArrayList<Integer> quizStats;

    public ArrayList<Integer> getQuizStats() {
        return quizStats;
    }

    public void addScoreToStats(int score) {
        quizStats.add(score);
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName.toLowerCase();
        System.out.println("Username successfully changed");
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
        System.out.println("password successfully changed");
    }

    public User(String userName, String password) {
        this.userName = userName.toLowerCase();
        this.password = password;
        this.quizStats = new ArrayList<>();
    }
}
