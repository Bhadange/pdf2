package com.abc.pdf2;

import androidx.appcompat.app.AppCompatActivity;
import com.github.barteksc.pdfviewer.PDFView;

import android.os.Bundle;

public class pdfview extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pdfview);
        PDFView pdfView = findViewById(R.id.pdfView);

        pdfView.fromAsset("hostel.pdf").load();
        pdfView.fromAsset("DBMS.pdf").load();
        pdfView.fromAsset("balaji.pdf").load();

    }
}