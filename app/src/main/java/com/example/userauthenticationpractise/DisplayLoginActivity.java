package com.example.userauthenticationpractise;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.HashMap;
import java.util.Map;

public class DisplayLoginActivity extends AppCompatActivity {

    private static Map<String, String> authenMap = new HashMap<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_login);

        Intent intent = getIntent();
//        Map<String, String> authenMap=(HashMap<String, String>)intent.getSerializableExtra("map");
    }

    public void sendToHomePage(View view) {

        EditText checkUserName = findViewById(R.id.checkUsername);
        EditText checkPassword = findViewById(R.id.checkPassword);

        if(!checkUserName.getText().toString().equals("")){
            if(!checkPassword.getText().toString().equals("")){
                if(MainActivity.authenMap.containsKey(checkUserName.getText().toString())){
                    if(MainActivity.authenMap.get(checkUserName.getText().toString()).equals(checkPassword.getText().toString())){
                        Toast.makeText(this, "Authentication Passed!", Toast.LENGTH_LONG).show();
                    }else{
                        Toast.makeText(this, "Authentication failed!", Toast.LENGTH_LONG).show();
                    }
                }else{
                    Toast.makeText(this, "Authentication failed!", Toast.LENGTH_LONG).show();
                }
            }else{
                Toast.makeText(this, "Password Field Empty!", Toast.LENGTH_LONG).show();
                checkPassword.setError("Empty Field!");
            }
        }else{
            Toast.makeText(this, "Username Field Empty!", Toast.LENGTH_LONG).show();
            checkUserName.setError("Empty Field!");
        }

//        finish();
    }
}