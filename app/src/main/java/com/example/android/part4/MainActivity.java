package com.example.android.part4;

import androidx.appcompat.app.AppCompatActivity;
import com.example.android.part4.Pageofoptions;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public String username="",country="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
    }

    public void storeandintent(View view)
    {
        EditText editText=(EditText)findViewById(R.id.user1);
        username=editText.getText().toString();

        EditText favteam=(EditText)findViewById(R.id.fav1);
        country=favteam.getText().toString();

        String arr[]={"India","Austalia","New Zealand","South Africa", "West Indies", "England", "Pakistan","Bangladesh","Sri Lanka", "Afghanistan"};
        int count=0;

        for(int i=0;i<10;i++)
        {
            if (country.equals(arr[i]))
            {
                count++;
                break;
            }
        }


        if((username.equals("") || country.equals("")) || count==0 )
        Toast.makeText(getApplicationContext(),"Invalid details!",Toast.LENGTH_SHORT).show();

        else
        {
            Intent intent = new Intent(MainActivity.this, Pageofoptions.class);
            intent.putExtra("String_I_need",username);
            intent.putExtra("Country_I_need",country);
            startActivity(intent);
        }


    }

}
