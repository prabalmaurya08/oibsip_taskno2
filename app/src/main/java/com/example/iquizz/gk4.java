package com.example.iquizz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;

public class gk4 extends AppCompatActivity {
    Button next;
    RadioButton r1,r2,r3,r4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gk4);
        next=findViewById(R.id.gk_q4_next);
        r1=findViewById(R.id.radioButton13);
        r2=findViewById(R.id.radioButton14);
        r3=findViewById(R.id.radioButton15);
        r4=findViewById(R.id.radioButton16);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //

                if(r4.isChecked()){
                    ++gk1.score;
                    ++gk1.correct;

                }else{
                    --gk1.score;
                    if(r1.isChecked()|| r3.isChecked()||r2.isChecked()){
                        ++gk1.incorrect;
                    }


                }
                Intent intent=new Intent(gk4.this, gk_result.class);
                startActivity(intent);
                finish();
            }
        });
    }
}