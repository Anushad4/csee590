package com.example.helloworld;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    // Create variables for the widgets created in layout
    private EditText Name;
    private EditText Password;
    private TextView Info;
    private Button Login;
    private int counter = 4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    Name = (EditText)findViewById(R.id.editname);
    Password = (EditText) findViewById(R.id.editpassword);
    Login = (Button) findViewById(R.id.button);
        Info.setText("No of attempts remaining: 4");
        Login.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            validate(Name.getText().toString(), Password.getText().toString());
        }
    });

}

    private void validate(String userName, String userPassword) {
        if ((userName.equals("anu")) && (userPassword.equals("1234"))) {
            Intent intent = new Intent(MainActivity.this, Homescreen.class);
            startActivity(intent);
            finish();
        } else {
            counter--;
            Info.setText("No of attempts remaining: " + String.valueOf(counter));
            if (counter == 0) {
                Login.setEnabled(false);
            }
        }
    }
}

