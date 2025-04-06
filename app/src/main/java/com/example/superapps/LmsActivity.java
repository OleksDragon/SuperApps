package com.example.superapps;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class LmsActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lms);
    }

    public void onClickGoToHomeActivity(View v) {
        startActivity(new Intent(this, HomeActivity.class));
        finish();
    }
}
