package com.example.firsttest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.DatePicker;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;

import java.text.MessageFormat;
import java.util.Calendar;

public class ThirdActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        LinearLayout layout = findViewById(R.id.linearLayout);

        for (int i = 0; i < 100; i++){
            TextView text = new TextView(this);
            text.setText("textView" + i);
            layout.addView(text);
        }

    }

    public void prevActivity(View view) {
//        Intent intent = new Intent(this, SecondActivity.class);
//        startActivity(intent);
        onBackPressed();

    }
}
