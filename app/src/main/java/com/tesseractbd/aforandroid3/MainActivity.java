package com.tesseractbd.aforandroid3;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    public static final String NUMBER = "number";
    Button one;
    Button two;
    Button three;
    Button btnEnter;
    private TextView tvNumber;

    String number="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        one = (Button) findViewById(R.id.button_one);
        two = (Button) findViewById(R.id.button_two);
        three = (Button) findViewById(R.id.button_three);
        btnEnter = (Button) findViewById(R.id.btn_enter);
        tvNumber = (TextView) findViewById(R.id.tv_number);

        one.setOnClickListener(this);
        two.setOnClickListener(this);
        three.setOnClickListener(this);
        btnEnter.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v == btnEnter) {
            Intent intent = new Intent(this, DetailsActivity.class);
            intent.putExtra(NUMBER, number);
            startActivity(intent);
        } else  {
            number = number.concat(((Button)v).getText().toString());
            tvNumber.setText(number);
        }
        
    }
}
