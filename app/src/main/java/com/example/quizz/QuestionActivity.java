package com.example.quizz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class QuestionActivity extends AppCompatActivity {

    Button btn4;
    Button btn5;
    Button btn6;
    Button btn7;
    String[] questions;
    String[] goodReponses;
    String[] badReponses;
    TextView textView1;
    int point;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.question);

        btn4 = findViewById(R.id.button11);
        btn5 = findViewById(R.id.button12);
        btn6 = findViewById(R.id.button13);
        btn7 = findViewById(R.id.button14);
        textView1 = findViewById(R.id.textView6);

        questions = new String[4];
        questions[0] = "En quelle année s'est déroulée la bataille de Marignan ?";
        questions[1] = "La place de la femme c'est où ?";
        questions[2] = "Quel est le meilleur couple de tous les temps ?";
        questions[3] = "Qui a succédé  à napoleon 3 en 1871 ?";

        goodReponses = new String[4];
        goodReponses[0] = "1515";
        goodReponses[1] = "La cuisine";
        goodReponses[2] = "Elsa et Michou";
        goodReponses[3] = "Adolphe Thiers";

        badReponses = new String[12];
        badReponses[0] = "ça n'a jamais eu lieu";
        badReponses[1] = "2022";
        badReponses[2] = "13";
        badReponses[3] = "La chambre";
        badReponses[4] = "La cave";
        badReponses[5] = "La cuisine";
        badReponses[6] = "Chèvre et Miel";
        badReponses[7] = "Hugo et Geoffrey";
        badReponses[8] = "Cécile et Fred";
        badReponses[9] = "Eric Zemmour";
        badReponses[10] = "Hugo";
        badReponses[11] = "Napoleon 4";

        textView1.setText(questions[0]);

        btn4.setText(goodReponses[0]);
        btn5.setText(badReponses[0]);
        btn6.setText(badReponses[1]);
        btn7.setText(badReponses[2]);

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(QuestionActivity.this, WinActivity.class);
                startActivity(intent);
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(QuestionActivity.this, LooseActivity.class);
                startActivity(intent);
            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(QuestionActivity.this, LooseActivity.class);
                startActivity(intent);
            }
        });

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(QuestionActivity.this, LooseActivity.class);
                startActivity(intent);
            }
        });
    }
}