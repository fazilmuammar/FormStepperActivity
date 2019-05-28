package com.example.formstepperactivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class ActivityFinally extends AppCompatActivity {

    EditText phone,tanggal;
    Button save;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_finally);

        phone = (EditText) findViewById(R.id.phone);
        tanggal = (EditText) findViewById(R.id.tanggal);




        save = (Button) findViewById(R.id.save);

        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               SharedPreferences saveShared = getSharedPreferences("one", Context.MODE_PRIVATE);
                String author = saveShared.getString("author","");
                String title = saveShared.getString("title","");
                String content = saveShared.getString("content","");
                String phones = phone.getText().toString();
                String dates   = tanggal.getText().toString();

                Log.d("hasil", author + title + content + phones + dates);


            }
        });

    }
}
