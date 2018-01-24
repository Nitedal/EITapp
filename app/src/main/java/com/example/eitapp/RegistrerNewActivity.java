package com.example.eitapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class RegistrerNewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_new);
    }
    public void openViewJoinedActivity(View view) {
        Intent intent = new Intent(this, ViewJoinedActivity.class);
        startActivity(intent);

    }

    public void openaActivitySelectionMain(View view) {
        Intent intent = new Intent(this, activitySelectionMain.class);
        startActivity(intent);

    }

}
