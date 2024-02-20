package com.example.latihan_fragment;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {
    private TextView tvText;
    private BottomNavigationView navigation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();
        navigationListener();
    }

    private void init() {
        tvText = findViewById(R.id.tv_text);
        navigation = findViewById(R.id.navigation);
    }

    private void navigationListener() {
        navigation.setOnItemSelectedListener(new BottomNavigationView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                if (item.getItemId() == R.id.nav_home) {
                    tvText.setText(item.getTitle());
                    return true;
                } else if (item.getItemId() == R.id.nav_search) {
                    tvText.setText(item.getTitle());
                    return true;
                } else if (item.getItemId()
                        == R.id.nav_notification) {
                    tvText.setText(item.getTitle());
                    return true;
                } else if (item.getItemId() == R.id.nav_account) {
                    tvText.setText(item.getTitle());
                    return true;
                }
                return false;
            }
        });
    }
}