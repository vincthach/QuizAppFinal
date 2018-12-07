package nghedev.demoapp.quizapp;

public class Question {
    private int id;
    private String question;
    private String optA;
    private String optB;
    private String optC;
    private String optD;
    private QuestionHelper.QuestionValue answer;
    public Question() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getOptA() {
        return optA;
    }

    public void setOptA(String optA) {
        this.optA = optA;
    }

    public String getOptB() {
        return optB;
    }

    public void setOptB(String optB) {
        this.optB = optB;
    }

    public String getOptC() {
        return optC;
    }

    public void setOptC(String optC) {
        this.optC = optC;
    }

    public String getOptD() {
        return optD;
    }

    public void setOptD(String optD) {
        this.optD = optD;
    }

    public QuestionHelper.QuestionValue getAnswer() {
        return answer;
    }

    public void setAnswer(QuestionHelper.QuestionValue answer) {
        this.answer = answer;
    }
}
