package com.example.iquizz;

import static com.example.iquizz.sci1.incorrect;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.iquizz.ui.slideshow.scienceViewModel;

public class sciout extends AppCompatActivity {
    Button back;
    TextView correct_ans,incorrect_ans,result;
    @SuppressLint({"SetTextI18n", "MissingInflatedId"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sciout);
        back=findViewById(R.id.sci_out_back);
        correct_ans=findViewById(R.id.sci_correct_ans);
        result=findViewById(R.id.sci_result);
        incorrect_ans=findViewById(R.id.sci_incorrect_ans);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(sciout.this, scienceViewModel.class);
                startActivity(intent);
                finish();
            }
        });
        result.setText(""+sci1.score);
        correct_ans.setText(""+sci1.correct);
        incorrect_ans.setText(""+ incorrect);
    }
}