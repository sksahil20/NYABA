package com.topstack.nyaba;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ContactInfo extends AppCompatActivity {

    TextView contactEmail;
    TextView contactNumber;
    Button contactBackBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact_info);

        contactEmail = findViewById(R.id.contact_email);
        contactNumber = findViewById(R.id.contact_number);
        contactBackBtn = findViewById(R.id.contact_back_btn);

        contactBackBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ContactInfo.this,MainActivity.class);
                startActivity(intent);
                finish();
            }
        });

    }
}