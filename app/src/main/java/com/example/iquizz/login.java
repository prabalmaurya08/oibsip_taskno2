package com.example.iquizz;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class login extends AppCompatActivity {
    EditText username,pass,email;
    Button login,signup;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        username=findViewById(R.id.editTextText3);
        pass=findViewById(R.id.editTextText4);
        login=findViewById(R.id.button5);
        email=findViewById(R.id.editTextText7);
        signup=findViewById(R.id.button6);
        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(login.this, Reg.class);
                startActivity(intent);
                finish();
            }
        });
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s1=username.getText().toString();
                String s2=pass.getText().toString();
                String s3=email.getText().toString();
                if(s1.equals("")||s2.equals("")||s3.equals("")){
                    Toast.makeText(login.this, "fill", Toast.LENGTH_SHORT).show();
                }
                else{
                    //database created
                    SQLiteDatabase sqLiteDatabase=openOrCreateDatabase("info",MODE_PRIVATE,null);
                    //create table
                    sqLiteDatabase.execSQL("create table if not exists person(name varchar,email varchar,pass varchar)");
                    String s4="select * from person where name='"+s1+"' and pass='"+s2+"' and email='"+s3+"' ";
                    Cursor cursor=sqLiteDatabase.rawQuery(s4,null);
                    if(cursor.getCount()>0){
                        Intent intent=new Intent(login.this, Lay_main.class);
                        intent.putExtra("u",s1);
                        intent.putExtra("p",s3);
                        startActivity(intent);

                        Toast.makeText(login.this, "Login Successful", Toast.LENGTH_SHORT).show();
                    }
                    else{
                        Toast.makeText(login.this, "Seems like that You haven't done Registration", Toast.LENGTH_SHORT).show();
                    }


                }

            }
        });



    }
}