package com.example.firsttest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        CheckBox checkBox =  findViewById(R.id.checkbox);

        checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    Toast.makeText(getApplicationContext(),"Turn On", Toast.LENGTH_LONG).show();
                }else{
                    Toast.makeText(getApplicationContext(),"Turn Off", Toast.LENGTH_LONG).show();
                }

            }
        });
    }

    public void prevActivity(View view) {
//        Intent intent = new Intent(this, MainActivity.class);
//        startActivity(intent);
        onBackPressed();
    }

    public void nextActivity(View view) {
        Intent intent = new Intent(this, ThirdActivity.class);
        startActivity(intent);

    }
}
