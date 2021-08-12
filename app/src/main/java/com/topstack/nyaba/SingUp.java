package com.topstack.nyaba;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SingUp extends AppCompatActivity {

    TextView openLogin;
    Button singUp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sing_up);

        openLogin = findViewById(R.id.openLogin);
        singUp = findViewById(R.id.sing_btn_dash);

        openLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SingUp.this,MainActivity.class);
                startActivity(intent);
                finish();
            }
        });

        singUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SingUp.this,LoginMain.class);
                startActivity(intent);
                finish();
            }
        });


    }
}