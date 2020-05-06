package com.example.navigationbar;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    BottomNavigationView bottomNavigationView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bottomNavigationView=findViewById(R.id.bottom_bar);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                switch (item.getItemId())
                {
                    case R.id.home:
                        Toast.makeText(MainActivity.this, "This is Home", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.search:
                        Toast.makeText(MainActivity.this, "This is Search", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.add:
                        Toast.makeText(MainActivity.this, "This is Add", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.like:
                        Toast.makeText(MainActivity.this, "This is Like", Toast.LENGTH_SHORT).show();
                        break; case R.id.profile:
                    Toast.makeText(MainActivity.this, "This is Profile", Toast.LENGTH_SHORT).show();
                    break;

                }

                return true;
            }
        });
    }
}
