package com.example.superapps;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class HomeActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        // Находим CardView
        CardView cardLms = findViewById(R.id.cardLms);
        CardView cardBusiness = findViewById(R.id.cardBusiness);

        // Устанавливаем обработчик клика
        cardBusiness.setOnClickListener(view ->{
            // Создаем Intent для перехода
            Intent intent = new Intent(this, BusinessActivity.class);
            startActivity(intent);

            // Анимация перехода
            overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
        });

        // Устанавливаем обработчик клика
        cardLms.setOnClickListener(view -> {
            // Создаем Intent для перехода
            Intent intent = new Intent(this, LmsActivity.class);
            startActivity(intent);

            // Анимация перехода
            overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
        });

        // Знаходимо BottomNavigationView
        BottomNavigationView navView = findViewById(R.id.nav_view);

        // Встановлюємо слухач натискань
        navView.setOnNavigationItemSelectedListener(item -> {
            int itemId = item.getItemId();
            if (itemId == R.id.navigation_home) {
                // Кнопка "Додому" натиснута
                // Ми вже на HomeActivity, тому нічого не робимо
                return true;
            }
            return false;
        });
        // Встановлюємо "Додому" як вибраний елемент за замовчуванням
        navView.setSelectedItemId(R.id.navigation_home);
    }
}
