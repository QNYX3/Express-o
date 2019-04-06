package com.example.csiott.expresso;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Toast;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.app.AlertDialog.Builder;


public class Order extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }

    public void onClickFave(View v)
    {

        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage("Iced Almond Milk Latte \n Price: $4.99 \n Would you like to confirm your order?").setPositiveButton("Yes", null)
                .setNegativeButton("No", null).show();
    }

    public void onClickCoffee(View v)
    {

        Intent newintent = new Intent(this, customize.class);
        startActivity(newintent);
    }

    public void onClickLatte(View v)
    {

        Intent newintent = new Intent(this, customize.class);
        startActivity(newintent);
    }


}
