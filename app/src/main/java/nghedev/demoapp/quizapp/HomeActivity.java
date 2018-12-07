package nghedev.demoapp.quizapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.List;

public class HomeActivity extends AppCompatActivity implements View.OnClickListener {

    private int mQuestionIndex = 0;

    private int mPoint = 0;

    List<Question> mQuestionList;

    TextView mTvTitle;

    Button mOptionA, mOptionB, mOptionC, mOptionD;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        mTvTitle = (TextView)findViewById(R.id.tv_question_title);
        mOptionA = (Button)findViewById(R.id.btn_option_a);
        mOptionB = (Button)findViewById(R.id.btn_option_b);
        mOptionC = (Button)findViewById(R.id.btn_option_c);
        mOptionD = (Button)findViewById(R.id.btn_option_d);
        mOptionA.setOnClickListener(this);
        mOptionB.setOnClickListener(this);
        mOptionC.setOnClickListener(this);
        mOptionD.setOnClickListener(this);
        mQuestionList = QuestionHelper.getQuestions();
        Question question = mQuestionList.get(mQuestionIndex);
        this.fillQuestion(question);
    }

    private void fillQuestion(Question question) {
        mTvTitle.setText(question.getQuestion());
        mOptionA.setText(question.getOptA());
        mOptionB.setText(question.getOptB());
        mOptionC.setText(question.getOptC());
        mOptionD.setText(question.getOptD());
    }

    @Override
    public void onClick(View v) {
        int yourAnswer = v.getId();
        Question currentQuestion = mQuestionList.get(mQuestionIndex);
        QuestionHelper.QuestionValue correctAnswer = currentQuestion.getAnswer();
        if (yourAnswer == R.id.btn_option_d && correctAnswer.equals(QuestionHelper.QuestionValue.D))  {
            mPoint+=1;
        }
        if (yourAnswer == R.id.btn_option_c && correctAnswer.equals(QuestionHelper.QuestionValue.C))  {
            mPoint+=1;
        }
        if (yourAnswer == R.id.btn_option_b && correctAnswer.equals(QuestionHelper.QuestionValue.B))  {
            mPoint+=1;
        }
        if (yourAnswer == R.id.btn_option_a && correctAnswer.equals(QuestionHelper.QuestionValue.A)) {
            mPoint += 1;
        }
        openNextQuestion();
    }

    private void openNextQuestion() {
        if (mQuestionIndex >= mQuestionList.size()-1) {
            Intent intent = new Intent(this, ResultActivity.class);
            Bundle b = new Bundle();
            b.putInt("score", mPoint);
            intent.putExtras(b);
            startActivity(intent );
            return;
        }
        mQuestionIndex += 1;
        Question currentQuestion = mQuestionList.get(mQuestionIndex);
        fillQuestion(currentQuestion);
    }
}
