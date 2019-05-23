package com.example.secondlab;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int time;
    private int ticks;
    private boolean isWork;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        runTimer();

    }

    public void nextActivity(View view) {
        Intent intent = new Intent(this, SecondActivity.class);
        startActivity(intent);
    }

    public void OnStartBtnClick(View view) {
        isWork = true;
    }

    public void OnStopBtnClick(View view) {
        isWork = false;

    }

    public void OnResetBtnClick(View view) {
        isWork = false;
        time = 0;
        ticks = 0;
    }
    private void runTimer(){
        final TextView textView = findViewById(R.id.time_view);
        final Handler handler = new Handler();

        handler.post(new Runnable() {
            @Override
            public void run() {
                int hours = time/3600;
                int minutes = (time%3600)/60;
                int seconds = time%60;

                String timeView = String.format("%d:%02d:%02d",hours,minutes,seconds);
                textView.setText(timeView);

                if(isWork){
                    ticks++;
                    if(ticks == 20){
                        time++;
                        ticks = 0;
                    }
                }
                handler.postDelayed(this,50);
            }
        });


    }
}
