package com.example.userauthenticationpractise;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class DisplaySignUpActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_sign_up);

        Intent intent = getIntent();
//        authenMap=(HashMap<String, String>)intent.getSerializableExtra("map");
    }

    public void sendToHomePage(View view) {

        EditText usernameTextInput = (EditText) findViewById(R.id.usernameTextInput);
        EditText passwordInput = (EditText) findViewById(R.id.passwordInput);

        if(!usernameTextInput.getText().toString().equals("")){
            if(!passwordInput.getText().toString().equals("")){
                MainActivity.authenMap.put(usernameTextInput.getText().toString(), passwordInput.getText().toString());
                Toast.makeText(this, "SignUp successful!", Toast.LENGTH_LONG).show();
                finish();
            }else{
                Toast.makeText(this, "Password Field Empty!", Toast.LENGTH_LONG).show();
                passwordInput.setError("Empty Field!");
            }
        }else{
            Toast.makeText(this, "Username Field Empty!", Toast.LENGTH_LONG).show();
            usernameTextInput.setError("Empty Field!");
        }
    }
}