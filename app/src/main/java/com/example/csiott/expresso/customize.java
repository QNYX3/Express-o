package com.example.csiott.expresso;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;


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



        RadioGroup radioGroup = (RadioGroup) findViewById(R.id.radiogroup);
//

        int radioButtonID = radioGroup.getCheckedRadioButtonId();
        View radioButton = radioGroup.findViewById(radioButtonID);
        int idx = radioGroup.indexOfChild(radioButton);


        RadioButton r = (RadioButton) radioGroup.getChildAt(idx);
        String selectedtext = r.getText().toString();









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
        dialog.setMessage("Your customization: " + selectedtext +"\nProceed to checkout?");
        dialog.show();



        //goes to the checkout
//        onYesListener();



    }

    public void onYesListener(){
        Intent newintent = new Intent(this, QR.class);
        startActivity(newintent);

    }

}
