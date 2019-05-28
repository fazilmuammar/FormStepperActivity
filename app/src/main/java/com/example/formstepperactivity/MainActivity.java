package com.example.formstepperactivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText author,title;
    Button next;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        author = (EditText) findViewById(R.id.author);
        title = (EditText) findViewById(R.id.title);

        next = (Button) findViewById(R.id.next);

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences sharedPreferencesOne = getSharedPreferences("one", MODE_PRIVATE);
                SharedPreferences.Editor editor = sharedPreferencesOne.edit();
                editor.putString("author", author.getText().toString());
                editor.putString("title", title.getText().toString());
                editor.commit();

                startActivity(new Intent(MainActivity.this, PhoneActivity.class));
            }
        });


    }

}
