package com.example.myapplication;

import static com.example.myapplication.MainActivity2.isLoged;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarItemView;
import com.google.android.material.navigation.NavigationBarView;

public class MainActivity extends AppCompatActivity {
@SuppressLint("RestrictedApi")
BottomNavigationView nav;
public Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nav=findViewById(R.id.bottom_navigation);
        nav.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                int id=item.getItemId();
                if (id == R.id.home){
                    intent = new Intent(MainActivity.this ,MainActivity.class);
                    startActivity(intent);
                }
                else if (id == R.id.dash){
                    if(isLoged == true){
                        intent = new Intent(MainActivity.this ,MainActivity3.class);
                        startActivity(intent);
                    }
                }
                else if (id == R.id.login){
                    intent = new Intent(MainActivity.this ,MainActivity2.class);
                    startActivity(intent);
                }

                return false;
            }
            private void startActivities(Intent intent) {
            }
        });
    }
    public boolean onCreateOptionsMenu(Menu menu) {
// inflates the menu XML into view

        getMenuInflater().inflate(R.menu.my_menu,menu);
        return true;
}





}