package com.example.iquizz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;

public class demo1 extends AppCompatActivity {
    Button next;
    RadioButton r1,r2,r3,r4;
    static  int score=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_demo1);
        next=findViewById(R.id.demo_q1_next);
        r1=findViewById(R.id.radioButton17);
        r2=findViewById(R.id.radiobutton18);
        r3=findViewById(R.id.radioButton19);
        r4=findViewById(R.id.radioButton20);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                score=0;
                if(r1.isChecked()){
                    ++score;

                }
                Intent intent=new Intent(demo1.this, demo2.class);
                startActivity(intent);
                finish();

            }
        });

    }
}