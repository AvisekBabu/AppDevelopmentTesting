package com.avisek.avisekapp24;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class otherActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_other);
        // toast message to show
        Toast.makeText(this, "Landed in another activity..", Toast.LENGTH_SHORT).show();
        /*
        Receiving the data from mainActivity intent5
        We can highlight that data via
        Toast or TextView
         */
//        Bundle bundle = getIntent().getExtras();
//        String str = bundle.getString("KEY");
        // Display the message in a Toast
//        Toast.makeText(this, str, Toast.LENGTH_SHORT).show();
        // Display the message in a TextView
//        TextView otherTextView = (TextView) findViewById(R.id.otherTextView);
//        otherTextView.setText(str);

    }
}