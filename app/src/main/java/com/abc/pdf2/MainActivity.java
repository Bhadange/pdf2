package com.abc.pdf2;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.app.DownloadManager;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import com.abc.pdf2.R;
import com.google.android.material.snackbar.Snackbar;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class MainActivity extends AppCompatActivity {
    Button button, Button ;
    ImageButton DBMS;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Find your buttons

        DBMS = findViewById(R.id.DBMS1);
        button = findViewById(R.id.Button);
        Button = findViewById(R.id.button2);
        Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, pdfview.class);
                startActivity(intent);
            }
        });



        DBMS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Open PDF view activity
                Intent intent = new Intent(MainActivity.this, pdfview.class);
                startActivity(intent);
            }
        });


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Open PDF view activity
                Intent intent = new Intent(MainActivity.this, pdfview.class);
                startActivity(intent);
            }
        });

    }
}