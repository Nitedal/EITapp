package com.example.eitapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class LoggonScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loggon_screen);
    }

    public void sendRegisterUser(View view) {
        Intent intent = new Intent(this, RegisterNewUser.class);
        startActivity(intent);

    }
}
