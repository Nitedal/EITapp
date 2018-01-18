package com.example.eitapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class activitySelectionMain extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selection_main);
    }

    public void openFindActivity(View view) {
        Intent intent = new Intent(this, ActivitySelectPhysicalActivity.class);
        startActivity(intent);

    }
}
