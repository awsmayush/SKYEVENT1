package com.example.skyevent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;

public class login extends AppCompatActivity {
    Button in,can;
    EditText ema,pas;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        in=(Button) findViewById(R.id.b1);
        can=(Button) findViewById(R.id.b2);
        //LinearLayout hg=(LinearLayout) findViewById(R.id.l2);
        ema=(EditText) findViewById(R.id.et1);
        pas=(EditText) findViewById(R.id.et2);

        // intent=new Intent(login.this,home.class);
        // glide.with(.this).load("@drawable/tenor.gif).into(hg);


    }

    public void register(View view) {
       Intent intent= new Intent(login.this,register.class);
    }

    public void login(View view) {
        try {
            Intent intent = new Intent(login.this, home.class);
        }
        catch(Exception e)
        {
            Log.i(e.getMessage(),"you get an exception");
        }
    }

}
