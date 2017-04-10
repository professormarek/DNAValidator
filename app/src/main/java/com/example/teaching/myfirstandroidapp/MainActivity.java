package com.example.teaching.myfirstandroidapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    @Override
    /*
    onCreate() will be called by the operating system when our Activity appears i.e. the app has started
    notice we don't have a main method
     */
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //in this example we're going to set up a button handler for our button
        /*
        NOTE: the "R" object is a static class that is a "bridge" between Java code
        and the xml resources in the res/ folder!
         */

        //get a reference to the button so we can set it's onClick handler code
        Button myButton = (Button) findViewById(R.id.button);
        //add an onClock handler to the button
        //I'm going to demonstrate what's called an anonymous class here
        //setOnClickListener is a method that expects an View.OnClickListener object to be passed as an argument
        //instantiate a new View.OnClickListner right inside the  ( )
        myButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                //here's where we actually put our application code; the rest was boilerplate
                validateSequence();
            } //OnClickListener is an abstract class - we have to implement one of the methods to make it concrete


        });

        System.out.println("this is the line I added");

    }

    private void validateSequence(){
        //a Toast is a way to display a short, non-interactive message to your users
        Toast.makeText(this, "Button was clicked!", Toast.LENGTH_LONG).show();

        //get the text out of the EditText box
        EditText myTextBox = (EditText) findViewById(R.id.editText);
        String userEnteredText = myTextBox.getText().toString();
        System.out.println("DEBUG: User trying to validate "+ userEnteredText);
        //"proper" way to debug in android:
        Log.d("DEBUG", "User trying to validate "+ userEnteredText);

        //TODO: validate the sequence - display result using toast
        Toast.makeText(this, "ENTER ANSWER HERE!", Toast.LENGTH_LONG).show();

    }
}
