package com.avisek.avisekapp24;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView textView;
    Button push_me,push_me2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); // Make sure to replace 'activity_main' with your layout file name

        /* Below two codes for event listener
         * Declaring "textView" instance for event listener
         * Declaring "push_me" instance for event listener
         * Both of this handle declared in activity_main.xml
         */
        textView = (TextView) findViewById(R.id.textView);
//        final TextView = (TextView) findViewById(R.id.textView);

        push_me = (Button) findViewById(R.id.pushMeButton);
        push_me2 = (Button) findViewById(R.id.pushMeButton2);

//        push_me.setOnClickListener(this);
//        push_me2.setOnClickListener(this);

//        Button push_me = (Button) findViewById(R.id.pushMeButton);
//        Button push_me2 = (Button) findViewById(R.id.pushMeButton2);

//        push_me.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Log.d("tag","Somebody clicked on Button 1");
//                textView.setText("Somebody clicked on Button 1");
//            }
//        });
//        push_me2.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Log.d("tag","Somebody clicked on Button 2");
//                textView.setText("Somebody clicked on Button 2");
//            }
//        });

        /* Log is a class which contains multiple errors
         * With "tag" logcat relevant logs can be visible
         * With "msg" logcat prints for executing each class can be monitored
         */
        Log.d("tag", "inCreate");
        Log.e("tag", "insideCreate");

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("tag","inStart");
    }


    @Override
    protected void onResume() {
        super.onResume();
        Log.d("tag","inResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("tag","inPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("tag","inStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("tag","inDestroy");
    }


    @Override
    public void onClick(View v) {
        int buttonId = v.getId();
        if(buttonId == R.id.pushMeButton)
        {
            Log.d("tag","Somebody clicked on Button 1");
            textView.setText("Somebody clicked on Button 1");
        }
        else if(buttonId == R.id.pushMeButton2)
        {
            Log.d("tag","Somebody clicked on Button 2");
            textView.setText("Somebody clicked on Button 2");
        }

//        switch (v.getId())
//        {
//            case R.id.pushMeButton:
//                Log.d("tag","Somebody clicked on Button 1");
//                textView.setText("Somebody clicked on Button 1");
//                break;
//
//            case R.id.pushMeButton2:
//                Log.d("tag","Somebody clicked on Button 2");
//                textView.setText("Somebody clicked on Button 2");
//                break;
//        }
    }


}



