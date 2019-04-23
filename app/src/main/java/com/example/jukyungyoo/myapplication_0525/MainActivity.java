package com.example.jukyungyoo.myapplication_0525;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;



public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ImageButton move_alarm = (ImageButton)findViewById(R.id.imgBtn_alarm);
        move_alarm.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent myIntent = new Intent(MainActivity.this, AlarmActivity.class);
                startActivity(myIntent);
            }
        });

    }
}
