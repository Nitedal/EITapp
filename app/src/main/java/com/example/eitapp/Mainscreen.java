package com.example.eitapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Mainscreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainscreen);
    }

    public void openMineActivities(View view) {
        Intent intent = new Intent(this, infoScreen.class);
        startActivity(intent);

    }

    public void openRegisterNew(View view) {
        Intent intent = new Intent(this, RegistrerNewActivity.class);
        startActivity(intent);

    }

    public void openFindActivity(View view) {
        Intent intent = new Intent(this, activitySelectionMain.class);
        startActivity(intent);

    }

    public void openMyRequests(View view) {
        Intent intent = new Intent(this, infoScreen.class);
        startActivity(intent);

    }
}
