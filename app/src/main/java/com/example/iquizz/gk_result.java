package com.example.iquizz;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;

import android.widget.Button;

import android.widget.TextView;

import com.example.iquizz.ui.gallery.gkViewModel;

public class gk_result extends AppCompatActivity {
    Button back;
    TextView correct_answer,incorrect_answer,result;


    @SuppressLint({"MissingInflatedId", "SetTextI18n"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gk_result);
        back=findViewById(R.id.gk_out_back);
        correct_answer=findViewById(R.id.correct_ans);
        incorrect_answer=findViewById(R.id.incorrect_ans);
        result=findViewById(R.id.gk_result);
        back.setOnClickListener(view -> {
            //

            Intent intent=new Intent(gk_result. this, gkViewModel.class);
            startActivity(intent);
            finish();
        });
        correct_answer.setText(" "+gk1.correct);
        incorrect_answer.setText(" "+gk1.incorrect);
        result.setText(" "+gk1.score);

    }
}