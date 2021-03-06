package com.example.smartparkingapp;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SignInActivity extends AppCompatActivity {

    private Button buttonConfSignIn;
    private EditText user;
    private EditText pass;
    private TextView txtSignInUser, txtSignInPass, txtRemember, txtForgetpass, txtSignIn, txtWelcome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sign_in);

        txtSignInUser = findViewById(R.id.textView_username);
        txtSignInUser.setText(getString(R.string.signin_user));

        txtSignInPass = findViewById(R.id.textView_password);
        txtSignInPass.setText(getString(R.string.signin_pass));

        txtRemember = findViewById(R.id.checkBox);
        txtRemember.setText(getString(R.string.signin_checkbox));

        txtForgetpass = findViewById(R.id.textView_forgetpass);
        txtForgetpass.setText(getString(R.string.signin_forgetpass));

        txtSignIn = findViewById(R.id.button_confsup);
        txtSignIn.setText(getString(R.string.signin_button));

        txtWelcome = findViewById(R.id.textView6);
        txtWelcome.setText(getString(R.string.welcome));

        user = findViewById(R.id.matricula);
        pass = findViewById(R.id.pass);
        buttonConfSignIn = findViewById(R.id.button_confsup);
        AlertDialog.Builder builder1 = new AlertDialog.Builder(SignInActivity.this);
        builder1.setMessage("Write your message here.");
        builder1.setCancelable(true);
        builder1.setTitle("Invalid Sign In");
        builder1.setMessage("Wrong username or password. Retry again!");
        builder1.setPositiveButton("OK", null);


        buttonConfSignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username = user.getText().toString();
                String password = pass.getText().toString();
                if(username.equals("admin") & password.equals("admin"))
                    launchAdminSign();
                else if (username.equals("test") & password.equals("test"))
                    launchConfSign();
                else
                    builder1.show();
            }
        });
    }

    public void launchConfSign() {
        Intent intent = new Intent(this, HomeActivity.class);
        startActivity(intent);
    }

    public void launchAdminSign() {
        Intent intent = new Intent(this, HomeAdminActivity.class);
        startActivity(intent);
    }
}