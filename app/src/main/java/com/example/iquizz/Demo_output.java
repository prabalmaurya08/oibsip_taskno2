package com.example.iquizz;

import androidx.appcompat.app.AppCompatActivity;


import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.iquizz.ui.home.DemoViewModel;



public class Demo_output extends AppCompatActivity {
    Button back;
    TextView result;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_demo_output);
        back=findViewById(R.id.demo_back);
        result=findViewById(R.id.demo_out);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Demo_output.this, DemoViewModel.class);
                startActivity(i);
                finish();
            }

        });
        result.setText(" "+demo1.score);
    }
}