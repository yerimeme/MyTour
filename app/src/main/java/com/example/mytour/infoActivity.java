package com.example.mytour;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class infoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);

        ImageView img_info = findViewById(R.id.img_info);
        TextView txt_info = findViewById(R.id.txt_info);

        img_info.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(infoActivity.this, "이미지 클릭", Toast.LENGTH_SHORT).show();
            }
        });
    }
}