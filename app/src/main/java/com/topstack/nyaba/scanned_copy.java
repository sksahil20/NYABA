package com.topstack.nyaba;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.io.File;

public class scanned_copy extends AppCompatActivity {

    Button finishBtn;

    // ImageView scanIDBack;

    //ImageView scanIDFront;

    //String storeFrontScan;
    //String storeBackScan="BACK_ID_JPEG.jpg";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scanned_copy);

        readFrontImgFromFile();
        readBackImgFromFile();

        // scanIDBack = findViewById(R.id.Scan_id_back);

        // scanIDFront = findViewById(R.id.Scan_id_front);

        finishBtn = findViewById(R.id.ScanfinishBtn);
        finishBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(scanned_copy.this, WellDone.class);
                startActivity(intent);
                finish();
            }
        });


    }


    public void readFrontImgFromFile() {
        Bundle b = new Bundle();
        b = getIntent().getExtras();
        String frontImg = b.getString("frontScan");

        ImageView scanIDFront = findViewById(R.id.Scan_id_front);
        File imgFileFront = new File(frontImg);
        if (imgFileFront.exists()) {
            scanIDFront.setImageURI(Uri.fromFile(imgFileFront));

        }
    }

    public void readBackImgFromFile() {
        Bundle b1 = new Bundle();
        b1 = getIntent().getExtras();
        String backImg = b1.getString("backScan");

        ImageView scanIDBack = findViewById(R.id.Scan_id_back);
        File imgFileBack = new File(backImg);
        if (imgFileBack.exists()) {
            scanIDBack.setImageURI(Uri.fromFile(imgFileBack));

        }
    }
}