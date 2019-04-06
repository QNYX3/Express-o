package com.example.csiott.expresso;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;


public class customize extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customize);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        Button checkout = (Button) findViewById(R.id.checkoutbutton);

    }




    public void onClickCheckout(View v)
    {



        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        // Add the buttons
        builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int id) {

                onYesListener();
            }
        });
        builder.setNegativeButton("No", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int id) {
                // User cancelled the dialog
            }
        });
// Set other dialog properties



// Create the AlertDialog
        AlertDialog dialog = builder.create();
        dialog.setMessage("2% Milk Iced Latte \n Price: $3.900 \n Proceed to Checkout?");
        dialog.show();



        //goes to the checkout
//        onYesListener();



    }

    public void onYesListener(){
        Intent newintent = new Intent(this, QR.class);
        startActivity(newintent);

    }

}
