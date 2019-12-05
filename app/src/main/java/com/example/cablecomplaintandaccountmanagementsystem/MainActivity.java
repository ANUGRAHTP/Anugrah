package com.example.cablecomplaintandaccountmanagementsystem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void adminlogin(View v1)
    {
        Intent intent=new Intent(this,adminlogin.class);
        startActivity(intent);
    }
    public void userlogin(View v2) {
        Intent intent = new Intent(this, userlogin.class);
        startActivity(intent);
    }
    public void workerlogin (View v3) {
        Intent intent = new Intent(this, workerlogin.class);
        startActivity(intent);
    }
}
