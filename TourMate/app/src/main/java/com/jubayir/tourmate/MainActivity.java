package com.jubayir.tourmate;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.jubayir.tourmate.login.SigninActivity;
import com.jubayir.tourmate.login.SignupActivity;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void next(View view) {
        startActivity(new Intent(MainActivity.this, SigninActivity.class));
    }

    public void singUp(View view) {
        startActivity(new Intent(MainActivity.this, SignupActivity.class));
    }
}
