package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity2 extends AppCompatActivity {
public static boolean isLoged=false;
public Intent intent1;
EditText e1,e2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        e1 = findViewById(R.id.et);
        e2 = findViewById(R.id.pass);

    }


    public void check(View view) {
        if(e1.getText().toString().equals(e2.getText().toString())){
            isLoged = true;

            intent1 = new Intent(this,MainActivity3.class);
            startActivity(intent1);

        }

    }

    public void ret(View view) {
        isLoged = false;
       intent1 = new Intent(this,MainActivity.class);
       startActivity(intent1);
    }


}