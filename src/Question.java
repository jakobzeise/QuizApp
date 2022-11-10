public class Question {
    private String question;
    private String correctAnswer;
    private String[] possibleAnswers;

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getCorrectAnswer() {
        return correctAnswer;
    }

    public void setCorrectAnswer(String correctAnswer) {
        this.correctAnswer = correctAnswer;
    }

    public String[] getPossibleAnswers() {
        return possibleAnswers;
    }

    public String getPossibleAnswerByIndex(int index) {
        return possibleAnswers[index];
    }

    public void setPossibleAnswers(String[] possibleAnswers) {
        this.possibleAnswers = possibleAnswers;
    }

    public Question(String question, String correctAnswer, String[] possibleAnswers) {
        this.question = question;
        this.correctAnswer = correctAnswer;
        this.possibleAnswers = possibleAnswers;
    }
}
