package com.studentplanner;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Register extends AppCompatActivity {

    EditText name, email1, password1;
    Button registerBtn;
    TextView btnToLogin;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.register);

        name = findViewById(R.id.name);
        email1 = findViewById(R.id.email1);
        password1 = findViewById(R.id.password1);

        registerBtn = findViewById(R.id.registerBtn);
        btnToLogin = findViewById(R.id.btnToLogin);

        registerBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String Name, Email1, Password1;

                Name = name.getText().toString();
                Email1 = email1.getText().toString();
                Password1 = password1.getText().toString();

                if (Name.equals("")) {
                    Toast.makeText(Register.this, "Name is Blank", Toast.LENGTH_SHORT).show();
                }
                if (Email1.equals("")) {
                    Toast.makeText(Register.this, "Email is Blank", Toast.LENGTH_SHORT).show();
                }
                if (Password1.equals("")) {
                    Toast.makeText(Register.this, "Password is Blank", Toast.LENGTH_SHORT).show();
                }
            }
        });

        btnToLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent R = new Intent(Register.this,MainActivity.class);
                startActivity(R);
                finish();
            }
        });

    }
}