package com.example.csiott.expresso;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



    }





    public void onClicklogin(View v)
    {
        //Toast.makeText(this, "Clicked on Button", Toast.LENGTH_SHORT).show();
        Intent newintent = new Intent(this, Order.class);
        startActivity(newintent);
    }
    public void onClickSignUp(View v)
    {
        Toast.makeText(this, "Thanks for signing up!", Toast.LENGTH_SHORT).show();
        Intent newintent = new Intent(this, Order.class);
        startActivity(newintent);
    }

}
