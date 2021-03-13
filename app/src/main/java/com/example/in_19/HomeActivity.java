package com.example.in_19;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import static com.example.in_19.R.id.btnUnlock;

public class HomeActivity extends AppCompatActivity {

    ImageButton btUnlock ;
    Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        btUnlock = findViewById(btnUnlock);
        btUnlock.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    Log.d("HomeActivity", "onClick: Success");
                    Intent i = new Intent(context, MainActivity.class);
                    context.startActivity(i);
            }
        });


    }
}