package com.avisek.avisekapp24;

import android.os.Bundle;
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
        // receiving the data from mainActivity
        Bundle bundle = getIntent().getExtras();
        String str = bundle.getString("KEY");
        Toast.makeText(this, str, Toast.LENGTH_SHORT).show();
    }
}