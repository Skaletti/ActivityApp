package com.example.activityapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button switchToMainActivity2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        switchToMainActivity2 = findViewById(R.id.activity_first_button);
        switchToMainActivity2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switchActivities();
            }
        });
    }

    private void switchActivities() {
        Intent intent = new Intent(this, MainActivity2.class);
        startActivity(intent);
    }

//    public void switchActivities(View view){
//        Intent intent = new Intent(this, MainActivity2.class);
//        startActivity(intent);
//    }

}