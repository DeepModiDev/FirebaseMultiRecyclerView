package com.deepmodi.firebasemultirecyclerview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SimpleDisplayActivity extends AppCompatActivity {

    TextView textView_id,textView_name,textView_age;
    String tempUserName,tempUserId,tempUserAge;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simple_display);

        Intent intent = getIntent();
        tempUserId = intent.getStringExtra("userId");
        tempUserName = intent.getStringExtra("userName");
        tempUserAge = intent.getStringExtra("userAge");

        //view init
        textView_id = findViewById(R.id.main_text_id);
        textView_name = findViewById(R.id.main_text_name);
        textView_age = findViewById(R.id.main_text_age);

        if(!tempUserAge.isEmpty() && !tempUserId.isEmpty() && !tempUserName.isEmpty())
        {
            textView_id.setText(tempUserId);
            textView_name.setText(tempUserName);
            textView_age.setText(tempUserAge);
        }

    }
}
