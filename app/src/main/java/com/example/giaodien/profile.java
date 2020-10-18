package com.example.giaodien;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class profile extends AppCompatActivity {
    Button btmain1;
    Button btmain;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        btmain1 = (Button)findViewById(R.id.bt2);
        btmain1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(profile.this, MainActivity.class);
                startActivity(intent);
            }
        });
        btmain = (Button) findViewById(R.id.posts);
        btmain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(profile.this, LisvtviewActivity.class);
                startActivity(intent);
            }
        });
    }
}