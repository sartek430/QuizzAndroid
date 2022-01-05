package com.example.quizz;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

public class QuestionActivity extends AppCompatActivity {

    Button btn4;
    Button btn5;
    Button btn6;
    Button btn7;
    String[] questions;
    String[] reponses;
    String[] badReponses;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.question);

        btn4 = findViewById(R.id.button11);
        btn5 = findViewById(R.id.button12);
        btn6 = findViewById(R.id.button13);
        btn7 = findViewById(R.id.button14);

        questions = new String[4];
        questions[0] = "En quelle année s'est déroulé la bataille de Marignan ?";
        questions[1] = "La place de la femme c'est où ?";
        questions[2] = "Quel est le meilleur couple de tous les temps ?";
        questions[3] = "Qui a succéder napoleon 3 en 1871 ?";

        reponses = new String[4];
        reponses[0] = "1515";
        reponses[1] = "La cuisine";
        reponses[2] = "Elsa et Michou";
        reponses[3] = "Adolphe Thiers";

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

    }
}