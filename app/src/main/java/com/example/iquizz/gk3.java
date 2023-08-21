package com.example.iquizz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;

public class gk3 extends AppCompatActivity {
    Button next;
    RadioButton r1,r2,r3,r4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gk3);
        next=findViewById(R.id.gk_q3_next);
        r1=findViewById(R.id.radioButton9);
        r2=findViewById(R.id.radio10);
        r3=findViewById(R.id.radioButton11);
        r4=findViewById(R.id.radioButton12);
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
                Intent intent=new Intent(gk3.this,gk4.class);
                startActivity(intent);
                finish();
            }
        });
    }
}