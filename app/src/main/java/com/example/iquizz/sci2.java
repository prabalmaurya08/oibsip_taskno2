package com.example.iquizz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;

public class sci2 extends AppCompatActivity {
    Button next;
    RadioButton r1,r2,r3,r4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sci2);
        next=findViewById(R.id.sci_q2_next);
        r1=findViewById(R.id.radioButton29);
        r2=findViewById(R.id.radiobutton30);
        r3=findViewById(R.id.radioButton31);
        r4=findViewById(R.id.radioButton32);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(r3.isChecked()){
                    ++sci1.score;
                    ++sci1.correct;

                }
                else{
                    --sci1.score;
                    ++sci1.incorrect;
                }
                Intent intent=new Intent(sci2.this,sci3.class);
                startActivity(intent);
                finish();
            }
        });
    }
}