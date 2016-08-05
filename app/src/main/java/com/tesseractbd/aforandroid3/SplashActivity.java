package com.tesseractbd.aforandroid3;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SplashActivity extends AppCompatActivity {

    Handler handler;
    private TextView tvSplashText;
    String s = "A for Android";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        tvSplashText = (TextView) findViewById(R.id.tv_splash_text);
        handler = new Handler();
        handler.post(splashRunnable);
    }

    Runnable splashRunnable = new Runnable() {
        int i = 0;
        String str = "";

        @Override
        public void run() {
            if (i < s.length()) {
                str = str.concat(s.charAt(i)+"");
                tvSplashText.setText(str);
                i++;
                handler.postDelayed(this, 200);
            } else {
                startActivity(new Intent(SplashActivity.this, MainActivity.class));
            }
        }
    };
}
