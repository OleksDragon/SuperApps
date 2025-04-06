package com.example.superapps;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class LmsActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lms);

        // Знаходимо BottomNavigationView
        BottomNavigationView navView = findViewById(R.id.nav_view);

        // Встановлюємо слухач натискань
        navView.setOnItemSelectedListener(item ->

        {
            int itemId = item.getItemId();
            if (itemId == R.id.navigation_home) {
                // Кнопка "Додому" натиснута, переходимо на HomeActivity
                Intent homeIntent = new Intent(this, HomeActivity.class);
                startActivity(homeIntent);
                finish();
                return true;
            }
            return false;
        });
    }

    public void onClickGoToHomeActivity(View v) {
        startActivity(new Intent(this, HomeActivity.class));
        finish();
    }
}
