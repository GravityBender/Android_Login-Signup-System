package com.example.userauthenticationpractise;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class MainActivity extends AppCompatActivity {

    public static Map<String, String> authenMap = new HashMap<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        Intent intent = getIntent();
//        Map<String, String> tempMap=(HashMap<String, String>)intent.getSerializableExtra("map");
//
//        System.out.println(tempMap.keySet());
    }

    public void sendToSignUp(View view) {
        Intent intent = new Intent(this, DisplaySignUpActivity.class);
        intent.putExtra("map", (Serializable) authenMap);
        startActivity(intent);
    }

    public void sendToLogin(View view) {
        Intent intent = new Intent(this, DisplayLoginActivity.class);
        intent.putExtra("map", (Serializable) authenMap);
        startActivity(intent);
    }
}