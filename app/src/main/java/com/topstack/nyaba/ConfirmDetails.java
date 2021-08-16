package com.topstack.nyaba;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ConfirmDetails extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirm_details);
    }

    public void continuePayment(View view) {
        Intent myIntent = new Intent(ConfirmDetails.this, Payment.class);
        ConfirmDetails.this.startActivity(myIntent);
        finish();
    }
}