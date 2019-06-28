package com.example.helloworld;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Homescreen extends AppCompatActivity {

    private Button Logout;
    private TextView Message;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homescreen);
        Logout = (Button) findViewById(R.id.btnlogout);
        Message = (TextView) findViewById(R.id.welcome);

        Logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent redirect = new Intent(Homescreen.this, MainActivity.class);
                startActivity(redirect);

            }
        });


    }
}