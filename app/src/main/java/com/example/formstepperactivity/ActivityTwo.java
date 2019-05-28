package com.example.formstepperactivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class ActivityTwo extends AppCompatActivity {

    EditText content;
    Button next;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phone);

        content = (EditText) findViewById(R.id.content);

        next = (Button) findViewById(R.id.nextTwo);



        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences sharedPreferencesTwo = getSharedPreferences("one", MODE_PRIVATE);
                SharedPreferences.Editor editor = sharedPreferencesTwo.edit();
                editor.putString("content", content.getText().toString());
                editor.commit();

                startActivity(new Intent(ActivityTwo.this, ActivityThree.class));
            }
        });
    }
}
