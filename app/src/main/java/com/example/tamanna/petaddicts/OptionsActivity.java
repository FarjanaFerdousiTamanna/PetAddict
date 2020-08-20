package com.example.tamanna.petaddicts;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class OptionsActivity extends AppCompatActivity {

    Button petButton;
    Button wantButton;
    Button emergencyButton;
    Button chitChatButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_options);

        petButton = (Button) findViewById(R.id.petButton);
        petButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(OptionsActivity.this, PetActivity.class);
                startActivity(intent);
            }
        });

        wantButton = (Button) findViewById(R.id.wantButton);
        wantButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(OptionsActivity.this, WantActivity.class);
                startActivity(intent);
            }
        });

        emergencyButton = (Button) findViewById(R.id.emergencyButton);
        emergencyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(OptionsActivity.this, EmergencyActivity.class);
                startActivity(intent);
            }
        });

        chitChatButton = (Button) findViewById(R.id.chitChatButton);
        chitChatButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(OptionsActivity.this, ChitChatActivity.class);
                startActivity(intent);
            }
        });
    }
}
