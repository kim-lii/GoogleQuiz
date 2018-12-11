package kimli.googlequiz;

import android.content.Intent;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private Questions questionList = new Questions();
    private String answer;
    private int numQuestions = questionList.getSize();
    private Random random;
    private Button firstBtn, secondBtn, thirdBtn, fourthBtn;
    private TextView questionAsked;
    public int maxTime = 10;
    private TextView secondsLeft;
    private TextView score;
    private int scoreNum = 0;
    private ImageButton sharingButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        secondsLeft = (TextView) findViewById(R.id.countdown);
        final CountDownTimer timer = new CountDownTimer(10000, 1000){
            public void onTick(long millisUntilFinished){
                secondsLeft.setText(String.valueOf(maxTime));
                maxTime--;
            }
            public void onFinish(){
                if (scoreNum > 3) {
                    scoreNum -= 3;
                } else {
                    scoreNum = 0;
                }
                score.setText("Score: " + scoreNum);
            }
        }.start();


        score = (TextView)findViewById(R.id.score);
        score.setText("Score: " + scoreNum);


        random = new Random();
        questionAsked = (TextView)findViewById(R.id.question);

        firstBtn = (Button)findViewById(R.id.firstChoice);
        firstBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(firstBtn.getText() == answer) {
                    scoreNum++;
                    NextQuestion(random.nextInt(numQuestions));
                    maxTime = 10;
                    timer.cancel();
                    timer.start();
                } else {
                    if (scoreNum > 1) {
                        scoreNum --;
                    } else {
                        scoreNum = 0;
                    }
                    score.setText("Score: " + scoreNum);
                }
            }
        });

        secondBtn = (Button)findViewById(R.id.secondChoice);
        secondBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(secondBtn.getText() == answer) {
                    scoreNum++;
                    NextQuestion(random.nextInt(numQuestions));
                    maxTime = 10;
                    timer.cancel();
                    timer.start();
                } else {
                    if (scoreNum > 1) {
                        scoreNum --;
                    } else {
                        scoreNum = 0;
                    }
                    score.setText("Score: " + scoreNum);
                }
            }
        });

        thirdBtn = (Button)findViewById(R.id.thirdChoice);
        thirdBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(thirdBtn.getText() == answer) {
                    scoreNum++;
                    NextQuestion(random.nextInt(numQuestions));
                    maxTime = 10;
                    timer.cancel();
                    timer.start();
                } else {
                    if (scoreNum > 1) {
                        scoreNum --;
                    } else {
                        scoreNum = 0;
                    }
                    score.setText("Score: " + scoreNum);
                }
            }
        });

        fourthBtn = (Button)findViewById(R.id.fourthChoice);
        fourthBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(fourthBtn.getText() == answer) {
                    scoreNum++;
                    NextQuestion(random.nextInt(numQuestions));
                    maxTime = 10;
                    timer.cancel();
                    timer.start();
                } else {
                    if (scoreNum > 1) {
                        scoreNum --;
                    } else {
                        scoreNum = 0;
                    }
                    score.setText("Score: " + scoreNum);
                }
            }
        });

        sharingButton = (ImageButton)findViewById(R.id.shareButton);
        sharingButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                shareIt();
            }
        });

        NextQuestion(random.nextInt(numQuestions));

    }


    private void NextQuestion(int num){
        questionAsked.setText(questionList.getQuestion(num));
        firstBtn.setText(questionList.getFirst(num));
        secondBtn.setText(questionList.getSecond(num));
        thirdBtn.setText(questionList.getThird(num));
        fourthBtn.setText(questionList.getFourth(num));
        score.setText("Score: " + scoreNum);
        answer = questionList.getAnswer(num);
    }

    private void shareIt() {
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        String shareBody = "Here is the share content body";
        sharingIntent.putExtra(android.content.Intent.EXTRA_SUBJECT, "Subject Here");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, shareBody);
        startActivity(Intent.createChooser(sharingIntent, "Share via"));
    }

}
