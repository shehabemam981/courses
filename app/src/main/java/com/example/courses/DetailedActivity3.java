package com.example.courses;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.TextView;

import java.util.Objects;

public class DetailedActivity3 extends AppCompatActivity {
    ImageView imageView;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detailed3);
        textView = findViewById(R.id.texts);
        imageView = findViewById(R.id.imageDetailed);
        Intent intent = getIntent();
        String courseName = intent.getStringExtra(Constants.course);
        for (int i = 0; i < 3; i++) {
            if (courseName.equals(Constants.androidCourse)) {
                imageView.setImageResource(R.drawable.android);
                textView.setText(Constants.androidDetailed);
                return;
            } else if (courseName.equals(Constants.iosCourse)) {
                imageView.setImageResource(R.drawable.ios);
                textView.setText(Constants.iosDetailed);
                return;
            } else if (courseName.equals(Constants.fullStackCourse)) {
                imageView.setImageResource(R.drawable.fullstack);
                textView.setText(Constants.fullStackDetailed);
                return;
            }
        }
    }
}