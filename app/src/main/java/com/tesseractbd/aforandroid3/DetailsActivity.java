package com.tesseractbd.aforandroid3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class DetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        Intent intent = getIntent();
        String s = intent.getStringExtra(MainActivity.NUMBER);
        Toast.makeText(getApplicationContext(),s,Toast.LENGTH_LONG).show();
    }
}
