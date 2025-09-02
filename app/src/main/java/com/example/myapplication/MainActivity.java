package com.example.myapplication;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public boolean onCreateOptionsMenu(Menu menu) {
// inflates the menu XML into view

        getMenuInflater().inflate(R.menu.my_menu,menu);
        return true;
}
public boolean onOptionsItemSelected(MenuItem item){
        int id=item.getItemId();
        if (id == R.id.home){}
        else if (id == R.id.dash){}
        else if (id == R.id.login){}



        return true;

    }
}