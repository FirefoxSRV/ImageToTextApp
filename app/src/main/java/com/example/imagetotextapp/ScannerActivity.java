package com.example.imagetotextapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class ScannerActivity extends AppCompatActivity {

    private ImageView captureImage;
    private TextView resultText;
    private Button takePhoto, detectText;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scanner);
    }
}