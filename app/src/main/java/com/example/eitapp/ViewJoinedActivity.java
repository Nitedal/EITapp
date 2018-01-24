package com.example.eitapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ViewJoinedActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_joined);
    }

    public void openBasicChat(View view) {
        Intent intent = new Intent(this, BasicChat.class);
        startActivity(intent);

    }

}
