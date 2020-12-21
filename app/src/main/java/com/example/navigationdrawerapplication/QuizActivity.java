package com.example.navigationdrawerapplication;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class QuizActivity extends AppCompatActivity
{
    Button bt1 , bt2 , bt3 , bt4;
    TextView tw1 , tw2 , textView;

    private questionSet mQuestions = new questionSet();

    private String mAns;
    private int mScore = 0 , chk = 0;

    public Random random = new Random();

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        bt1 = (Button) findViewById(R.id.bt1);
        bt2 = (Button) findViewById(R.id.bt2);
        bt3 = (Button) findViewById(R.id.bt3);
        bt4 = (Button) findViewById(R.id.bt4);

        tw1 = (TextView) findViewById(R.id.tw1);
        tw2 = (TextView) findViewById(R.id.tw2);
        textView = (TextView) findViewById(R.id.textView);

        new CountDownTimer(1000*10 , 1000){
            @Override
            public void onTick(long millisUntilFinished) {
                textView.setText(String.valueOf(millisUntilFinished/1000));
            }

            @Override
            public void onFinish() {
                gameOver();
            }
        }.start();

        tw1.setText("Score: " + mScore);

        updateQuestion(random.nextInt(10));

        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(bt1.getText().toString().equals(mAns)){
                    mScore++;
                    chk++;
                    tw1.setText("Score: " + mScore);

                    if(chk == 10)
                        gameOver();
                    else
                        updateQuestion(random.nextInt(10));
                }
                else
                {
                    chk++;

                    if(chk == 10)
                        gameOver();
                    else
                        updateQuestion(random.nextInt(10));
                }

            }
        });

        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(bt2.getText().toString().equals(mAns))
                {
                    mScore++;
                    chk++;
                    tw1.setText("Score: " + mScore);

                    if(chk == 10)
                        gameOver();
                    else
                        updateQuestion(random.nextInt(10));
                }
                else
                {
                    chk++;

                    if(chk == 10)
                        gameOver();
                    else
                        updateQuestion(random.nextInt(10));
                }

            }
        });

        bt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(bt3.getText().toString().equals(mAns))
                {
                    mScore++;
                    chk++;
                    tw1.setText("Score: " + mScore);

                    if(chk == 10)
                        gameOver();
                    else
                        updateQuestion(random.nextInt(10));
                }
                else
                {
                    chk++;

                    if(chk == 10)
                        gameOver();
                    else
                        updateQuestion(random.nextInt(10));
                }

            }
        });

        bt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(bt4.getText().toString().equals(mAns))
                {
                    mScore++;
                    chk++;
                    tw1.setText("Score: " + mScore);

                    if(chk == 10)
                        gameOver();
                    else
                        updateQuestion(random.nextInt(10));
                }
                else
                {
                    chk++;

                    if(chk == 10)
                        gameOver();
                    else
                        updateQuestion(random.nextInt(10));
                }

            }
        });
    }

    private void updateQuestion(int num)
    {
        tw2.setText(mQuestions.getQuestion(num));

        bt1.setText(mQuestions.getChoice1(num));
        bt2.setText(mQuestions.getChoice2(num));
        bt3.setText(mQuestions.getChoice3(num));
        bt4.setText(mQuestions.getChoice4(num));

        mAns = mQuestions.getCorrectAns(num);
    }

    private void gameOver()
    {
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(QuizActivity.this);
        alertDialogBuilder
                .setMessage("Your final Score is " + mScore)
                .setCancelable(false)
                .setNegativeButton("Exit",
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                finish();
                            }
                        });
        AlertDialog alertDialog = alertDialogBuilder.create();
        alertDialog.show();
    }
}