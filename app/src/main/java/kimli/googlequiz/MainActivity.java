package kimli.googlequiz;

import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    Button btn_one, btn_two, btn_three, btn_four;
    TextView tv_question;

    private Questions questionList = new Questions();

    private String answer;
    private int numQuestions = questionList.questions.length;

    Random random;


    public int counter = 10;
    TextView textView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        textView= (TextView) findViewById(R.id.countdown);

        final CountDownTimer timer = new CountDownTimer(10000, 1000){
            public void onTick(long millisUntilFinished){
                textView.setText(String.valueOf(counter));
                counter--;
            }
            public void onFinish(){
                GameOver();
            }
        }.start();





        random = new Random();

        btn_one = (Button)findViewById(R.id.firstChoice);
        btn_one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(btn_one.getText() == answer) {
                    NextQuestion(random.nextInt(numQuestions));
                    counter = 10;
                    timer.cancel();
                    timer.start();
                }
            }
        });

        btn_two = (Button)findViewById(R.id.secondChoice);
        btn_two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(btn_two.getText() == answer) {
                    NextQuestion(random.nextInt(numQuestions));
                    counter = 10;
                    timer.cancel();
                    timer.start();
                }
            }
        });

        btn_three = (Button)findViewById(R.id.thirdChoice);
        btn_three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(btn_three.getText() == answer) {
                    NextQuestion(random.nextInt(numQuestions));
                    counter = 10;
                    timer.cancel();
                    timer.start();
                }
            }
        });

        btn_four = (Button)findViewById(R.id.fourthChoice);
        btn_four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(btn_four.getText() == answer) {
                    NextQuestion(random.nextInt(numQuestions));
                    counter = 10;
                    timer.cancel();
                    timer.start();
                }
            }
        });

        tv_question = (TextView)findViewById(R.id.question);

        NextQuestion(random.nextInt(numQuestions));

    }

//    public void onClick(View v) {
//        switch (v.getId()){
//            case R.id.firstChoice:
//                if(btn_one.getText() == answer){
//                    Toast.makeText(MainActivity.this, "You Are Correct", Toast.LENGTH_SHORT).show();
//                    NextQuestion(random.nextInt(questionLength));
//                }else{
//                    GameOver();
//                }
//
//                break;
//
//            case R.id.secondChoice:
//                if(btn_two.getText() == answer){
//                    Toast.makeText(MainActivity.this, "You Are Correct", Toast.LENGTH_SHORT).show();
//                    NextQuestion(random.nextInt(questionLength));
//                }else{
//                    GameOver();
//                }
//
//                break;
//
//            case R.id.thirdChoice:
//                if(btn_three.getText() == answer){
//                    Toast.makeText(MainActivity.this, "You Are Correct", Toast.LENGTH_SHORT).show();
//                    NextQuestion(random.nextInt(questionLength));
//                }else{
//                    GameOver();
//                }
//
//                break;
//
//            case R.id.fourthChoice:
//                if(btn_four.getText() == answer){
//                    Toast.makeText(MainActivity.this, "You Are Correct", Toast.LENGTH_SHORT).show();
//                    NextQuestion(random.nextInt(questionLength));
//                }else{
//                    GameOver();
//                }
//
//                break;
//        }
//    }


    private void NextQuestion(int num){
        tv_question.setText(questionList.getQuestion(num));
        btn_one.setText(questionList.getFirst(num));
        btn_two.setText(questionList.getSecond(num));
        btn_three.setText(questionList.getThird(num));
        btn_four.setText(questionList.getFourth(num));

        answer = questionList.getAnswer(num);
    }

    private void GameOver() {

    }

}
