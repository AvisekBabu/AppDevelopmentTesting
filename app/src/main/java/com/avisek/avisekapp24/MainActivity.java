package com.avisek.avisekapp24;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView textView;
    Button dialNumber,toast,showLocation,openWebPage,viewIntent,letsGetPro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); // Make sure to replace 'activity_main' with your layout file name

        /* Below two codes for event listener
         * Declaring "textView" instance for event listener
         * Declaring "push_me" instance for event listener
         * Both of this handle declared in activity_main.xml
         */

        // TextView textView and Button push_me set as global
//        final TextView textView = (TextView) findViewById(R.id.textView);
//        Button push_me = (Button) findViewById(R.id.pushMeButton);
//        Button push_me2 = (Button) findViewById(R.id.pushMeButton2);
        textView = (TextView) findViewById(R.id.textView);
        dialNumber = (Button) findViewById(R.id.dialNumber);
        toast = (Button) findViewById(R.id.toast);
        showLocation = (Button) findViewById(R.id.showLocation);
        openWebPage = (Button) findViewById(R.id.openWebPage);
        viewIntent = (Button) findViewById(R.id.viewIntent);
        letsGetPro = (Button) findViewById(R.id.letsGetPro);

        dialNumber.setOnClickListener(this);
        toast.setOnClickListener(this);
        openWebPage.setOnClickListener(this);
        viewIntent.setOnClickListener(this);
        letsGetPro.setOnClickListener(this);

        // Event listeners
//        push_me.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Log.d("tag","Somebody clicked on Button 1");
//                textView.setText("Somebody clicked on Button 1");
//            }
//        });
//        push_me2.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
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

    // Better approach..
    // Whatever button is configured, control will come here
    @Override
    public void onClick(View v) {

        if(v.getId() == R.id.dialNumber) {
            // this will navigating to dialler app component "ACTION_DIAL"
            Intent intent1 = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:9674303557"));
            startActivity(intent1);

        }
        else if(v.getId() == R.id.toast) {
            // intent activity help you to jump another activity
            Intent intent = new Intent(MainActivity.this, otherActivity.class);
            startActivity(intent);

        }
        else if(v.getId() == R.id.showLocation) {
            // "ACTION_VIEW" will be overridden by Google map, geo: need to mentioned
            Intent intent2 = new Intent(Intent.ACTION_VIEW,
                    Uri.parse("geo:23.7831911,88.2641384?q=location+name")); // Add query parameter for label
            startActivity(intent2);

        }
        else if(v.getId() == R.id.openWebPage) {
            // "ACTION_VIEW" will be overridden by any existing browser, https: need to mentioned
            Intent intent3 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.innominds.com"));
            startActivity(intent3);

        }
        else if(v.getId() == R.id.viewIntent) {
            // All apps who using ACTION_VIEW, will ask for select
            Intent intent4 = new Intent(Intent.ACTION_VIEW);
            startActivity(intent4);

        }
        else if(v.getId() == R.id.letsGetPro) {
            // this intent reaching across the boundary of this app
            Intent intent5 = new Intent("com.avisek.avisekapp24.otherActivity");
            intent5.putExtra("KEY", "Data landed here in otherActivity");
            startActivity(intent5);

        }
    }





}



