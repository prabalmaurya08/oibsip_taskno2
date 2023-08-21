package com.example.iquizz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;

public class gk1 extends AppCompatActivity {
    Button next;
    RadioButton r1,r2,r3,r4;
    static int score=0;
    static int correct=0;
    static int incorrect=0;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gk1);
        next=findViewById(R.id.gk_q1_next);
        r1=findViewById(R.id.radioButton);
        r2=findViewById(R.id.radioButton2);
        r3=findViewById(R.id.radioButton3);
        r4=findViewById(R.id.radioButton4);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                score=0;
                correct=0;
                incorrect=0;
                if(r2.isChecked()){
                    ++score;
                    ++correct;

                }
                else {
                    --score;
                    if(r1.isChecked()|| r3.isChecked()||r4.isChecked()){
                        ++incorrect;
                    }

                }


                Intent intent=new Intent(gk1.this, gk2.class);
                startActivity(intent);
                finish();
            }
        });
    }
}