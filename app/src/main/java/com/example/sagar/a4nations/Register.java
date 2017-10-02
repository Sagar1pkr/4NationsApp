package com.example.sagar.a4nations;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

public class Register extends AppCompatActivity {

    EditText e_Username, e_Password, e_Email;
    String Username, Password, Email;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        e_Username = (EditText) findViewById(R.id.Username);
        e_Password = (EditText) findViewById(R.id.Password);
        e_Email = (EditText) findViewById(R.id.Email);
    }

    public void reguser(View view) {

        Username = e_Username.getText().toString();
        Password = e_Password.getText().toString();
        Email = e_Email.getText().toString();
        String method = "register";
        BackgroundTask backgroundTask = new BackgroundTask(this);
        backgroundTask.execute(method, Username, Password, Email);
    }
}

