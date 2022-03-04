package com.studentplanner;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText email,password;
    Button loginBtn;
    TextView btnToRegister;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        email.findViewById(R.id.email);
        password = findViewById(R.id.password);

        loginBtn = findViewById((R.id.loginBtn));
        btnToRegister = findViewById(R.id.btnToLogin);

        loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String mail,pass;

                mail = email.getText().toString();
                pass = password.getText().toString();

                if (mail.equals("")) {
                    Toast.makeText(MainActivity.this, "Email is Blank", Toast.LENGTH_LONG).show();
                }

                else if (pass.equals("")) {
                    Toast.makeText(MainActivity.this, "Password is Blank", Toast.LENGTH_LONG).show();
                }
                else {
                    // authentication
                }
            }
        });
        btnToRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this,Register.class);
                startActivity(i);
                finish();
            }
        });
    }
}