package com.example.iquizz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;

public class sci3 extends AppCompatActivity {
    Button next;
    RadioButton r1,r2,r3,r4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sci3);
        next=findViewById(R.id.sci_q3_next);
        r1=findViewById(R.id.radioButton33);
        r2=findViewById(R.id.radiobutton34);
        r3=findViewById(R.id.radioButton35);
        r4=findViewById(R.id.radioButton36);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(r2.isChecked()){
                    ++sci1.score;
                    ++sci1.correct;

                }
                else{
                    --sci1.score;
                    ++sci1.incorrect;
                }
                Intent intent=new Intent(sci3.this,sci4.class);
                startActivity(intent);
                finish();
            }
        });
    }
}