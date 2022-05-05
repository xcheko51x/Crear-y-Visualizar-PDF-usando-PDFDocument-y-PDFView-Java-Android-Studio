package com.example.crearvisualizarpdfdocumentpdfviewjava;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Environment;

import com.pdfview.PDFView;

import java.io.File;

public class PdfVista extends AppCompatActivity {

    PDFView vistaPdf;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pdf_vista);

        vistaPdf = findViewById(R.id.vistaPdf);

        File file = new File(Environment.getExternalStorageDirectory(), "Archivo.pdf");

        vistaPdf.fromFile(file);
        vistaPdf.isZoomEnabled();

        vistaPdf.show();
    }
}