package com.example.courses;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity2 extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

    }

    @Override
    public void onClick(View view) {
     if(view.getId() == R.id.android){
        getDetail(Constants.androidCourse);
        return;
     }else if(view.getId() ==R.id.ios){
        getDetail(Constants.iosCourse);
        return;
     }else if(view.getId() == R.id.full_stack){
       getDetail(Constants.fullStackCourse);
       return;

     }
    }

    private void getDetail(String course) {
        Intent intent =new Intent(MainActivity2.this,DetailedActivity3.class);
        intent.putExtra(Constants.course,course);
        startActivity(intent);

    }
}