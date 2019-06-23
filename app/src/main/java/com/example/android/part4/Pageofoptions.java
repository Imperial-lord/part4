package com.example.android.part4;

import androidx.appcompat.app.AppCompatActivity;
import com.example.android.part4.MainActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Pageofoptions extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pageofoptions);

        Bundle bundle=getIntent().getExtras();
        String user=bundle.getString("String_I_need");
        String country=bundle.getString("Country_I_need");

        displayuser(user);
        displayteam(country);
    }





    public void displayuser(String string)
    {
        TextView textView=(TextView) findViewById(R.id.name);
        textView.setText(string);
    }

    public void displayteam(String string)
    {
        TextView textView=(TextView)findViewById(R.id.team);
        textView.setText(string);
    }
}
