package nghedev.demoapp.quizapp;

import java.util.ArrayList;
import java.util.List;

public class QuestionHelper {

    public static enum QuestionValue { A, B, C , D}

    public static List<Question> getQuestions() {
        List<Question> questions = new ArrayList<>();
        Question question = new Question();
        question.setQuestion("2 con vịt đi trước 2 con vịt, 2 con vịt đi sau 2 con vịt, 2 con vịt đi giữa 2 con vịt. Hỏi có mấy con vịt?");
        question.setOptA("1 con vịt");
        question.setOptB("2 con vịt");
        question.setOptC("3 con vịt");
        question.setOptD("4 con vịt");
        question.setAnswer(QuestionValue.D);

        Question question2 = new Question();
        question2.setQuestion("Có 1 bà kia không biết bơi, xuống nước là bả chết. Một hôm bà đi tàu, bỗng nhiên tàu chìm, nhưng bà không chết.Tại sao (không ai cứu hết)?");
        question2.setOptA("Có người cứu bà");
        question2.setOptB("Bà đi tàu ngầm");
        question2.setOptC("Tại vì bà có phao");
        question2.setOptD("Chịu thua");
        question2.setAnswer(QuestionValue.B);

        Question question3 = new Question();
        question3.setQuestion("Cái gì đen khi bạn mua nó, đỏ khi dùng nó và xám xịt khi vứt nó đi?");
        question3.setOptA("Đôi dép");
        question3.setOptB("Cục Than");
        question3.setOptC("Cây bút");
        question3.setOptD("Bó tay câu hỏi quá khó");
        question3.setAnswer(QuestionValue.B);

        Question question4 = new Question();
        question4.setQuestion("Lịch nào dài nhất?");
        question4.setOptA("Lịch để bàn");
        question4.setOptB("Lịch điện tử");
        question4.setOptC("Lịch vạn niên");
        question4.setOptD("Lịch sử");
        question4.setAnswer(QuestionValue.D);

        Question question5 = new Question();
        question5.setQuestion("Nắng ba năm ta chưa hề bỏ bạn?");
        question5.setOptA("Cái bóng");
        question5.setOptB("Người đòi nợ");
        question5.setOptC("Khó quá không biết");
        question5.setOptD("Hội người yêu cũ");
        question5.setAnswer(QuestionValue.A);

        questions.add(question);
        questions.add(question2);
        questions.add(question3);
        questions.add(question4);
        questions.add(question5);
        return questions;
    }




}
