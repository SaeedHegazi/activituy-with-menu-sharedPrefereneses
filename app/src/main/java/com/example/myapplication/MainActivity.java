package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.android.material.navigation.NavigationBarItemView;

public class MainActivity extends AppCompatActivity {
private NavigationBarItemView nav;
public Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        nav=findViewById(R.id.bottom_navigation);
        setContentView(R.layout.activity_main);
    }
    public boolean onCreateOptionsMenu(Menu menu) {
// inflates the menu XML into view

        getMenuInflater().inflate(R.menu.my_menu,menu);
        return true;
}
public boolean onOptionsItemSelected(MenuItem item){
        int id=item.getItemId();
        if (id == R.id.home){
            intent = new Intent(String.valueOf(MainActivity.this),MainActivity);

        }
        else if (id == R.id.dash){}
        else if (id == R.id.login){}



        return true;

    }


}