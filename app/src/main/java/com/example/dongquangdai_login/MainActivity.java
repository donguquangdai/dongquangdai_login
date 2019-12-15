package com.example.dongquangdai_login;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button b1,b2;
    EditText text1,text2;
    TextView tx1;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1=findViewById(R.id.button_login);
        b2=findViewById(R.id.button_can);
        text1=findViewById(R.id.taikhoan);
        text2=findViewById(R.id.pass);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(text1.getText().toString().equals("admin") &&
                        text2.getText().toString().equals("Admin123*")){
                        Intent intent;
                    intent = new Intent(MainActivity.this,Screen.class);
                    startActivity(intent);
                }
                    else{
                    Toast.makeText(getApplicationContext(), "Fail",Toast.LENGTH_SHORT).show();
                    }
                }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
