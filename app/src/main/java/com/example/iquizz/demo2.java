package com.example.iquizz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;

public class demo2 extends AppCompatActivity {
    Button next;
    RadioButton r1,r2,r3,r4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_demo3);


        next=findViewById(R.id.demo_q2_next);
        r1=findViewById(R.id.radioButton21);
        r2=findViewById(R.id.radiobutton22);
        r3=findViewById(R.id.radioButton23);
        r4=findViewById(R.id.radioButton24);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(r4.isChecked()){
                    ++demo1.score;
                }
                Intent intent=new Intent(demo2.this,Demo_output.class);
                startActivity(intent);
                finish();

            }
        });


    }
}