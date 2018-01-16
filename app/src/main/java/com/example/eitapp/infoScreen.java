package com.example.eitapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class infoScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info_screen);
    }

    public void sendMessage(View view) {
        Intent intent = new Intent(this, LoggonScreen.class);
        startActivity(intent);

    }
}
