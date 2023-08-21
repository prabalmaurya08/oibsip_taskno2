package com.example.iquizz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.imageview.ShapeableImageView;

public class MainActivity extends AppCompatActivity {
    ShapeableImageView iv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Thread thread=new Thread(){
            public void run(){
                try{
                    sleep(3000);
                }
                catch (Exception e){

                }
                finally {
                    Intent i=new Intent(MainActivity.this, login.class);
                    startActivity(i);
                    finish();
                }
            }
        };thread.start();

    }
}