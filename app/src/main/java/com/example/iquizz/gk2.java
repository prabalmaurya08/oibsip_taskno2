package com.example.iquizz;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;

public class gk2 extends AppCompatActivity {
    Button next;
    RadioButton r1,r2,r3,r4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gk2);
        next=findViewById(R.id.gk_q2_next);
        r1=findViewById(R.id.radioButton5);
        r2=findViewById(R.id.radio6);
        r3=findViewById(R.id.radioButton7);
        r4=findViewById(R.id.radioButton8);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(r3.isChecked()){
                        ++gk1.score;
                        ++gk1.correct;
                }
                else{
                    --gk1.score;
                    if(r1.isChecked()|| r2.isChecked()||r4.isChecked()){
                        ++gk1.incorrect;
                    }

                }
                Intent intent=new Intent(gk2.this, gk3.class);
                startActivity(intent);
                finish();
            }
        });
    }
}