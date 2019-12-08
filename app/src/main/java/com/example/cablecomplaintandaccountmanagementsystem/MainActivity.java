package com.example.cablecomplaintandaccountmanagementsystem;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public abstract class MainActivity<adminLoginButton> extends AppCompatActivity implements View.OnClickListener {

    EditText etAdminId,etPassword;
    Button adminLoginButton;
    String adminId,password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etAdminId= (EditText) findViewById(R.id.etAdminId);
        etPassword=(EditText) findViewById(R.id.etPassword);
        adminLoginButton=(Button) findViewById(R.id.adminLoginButton);

        adminLoginButton.setOnClickListener(this);
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
