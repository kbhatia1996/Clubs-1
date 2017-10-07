package com.example.android.login;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText username;
    private EditText Password;

    private Button Login;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        username = (EditText) findViewById(R.id.etUsername);

        Password = (EditText) findViewById(R.id.etPassword);

        Login = (Button) findViewById(R.id.btnlogin);



        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final String  Username = username.getText().toString();
                final String  password = Password.getText().toString();
                Valid(Username, password);
            }
         }) ;
    }

    public void Valid(String Username, String password) {
        if ((Username.equals("Admin")) && (password.equals("1234"))) {
            Intent intent = new Intent(MainActivity.this, com.example.android.login.userPage.class);
            startActivity(intent);
        }

    }
}

