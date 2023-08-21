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

public class Reg extends AppCompatActivity {
    EditText username,email,pass;
    Button submit;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reg);
        username=findViewById(R.id.editTextText);
        email=findViewById(R.id.editTextText2);
        pass=findViewById(R.id.editTextText5);
        submit=findViewById(R.id.button);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s1=username.getText().toString();
                String s2=email.getText().toString();
                String s3=pass.getText().toString();
                if(s1.equals("")||s2.equals("")||s3.equals("")){
                    Toast.makeText(Reg.this, "Fill proper detail", Toast.LENGTH_SHORT).show();
                }
                else{
                    //database created
                    SQLiteDatabase sqLiteDatabase=openOrCreateDatabase("info",MODE_PRIVATE,null);
                    //create table under info database
                    sqLiteDatabase.execSQL("create table if not exists person(name varchar,email varchar,pass varchar)");
                    //to check whether the following info already exits or not
                    String s4="select * from person where name='"+s1+"' and email='"+s2+"' ";
                    Cursor cursor=sqLiteDatabase.rawQuery(s4,null);
                    if(cursor.getCount()>0){
                        Toast.makeText(Reg.this, "Already registered", Toast.LENGTH_SHORT).show();
                    }
                    else{
                        sqLiteDatabase.execSQL("insert into person values('"+s1+"','"+s2+"','"+s3+"') ");
                        Toast.makeText(Reg.this, "Successful", Toast.LENGTH_SHORT).show();
                        Intent intent=new Intent(Reg.this, login.class);
                        startActivity(intent);
                        finish();











                    }

                }
            }
        });



    }
}