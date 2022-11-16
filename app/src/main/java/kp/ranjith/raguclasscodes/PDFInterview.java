package kp.ranjith.raguclasscodes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class PDFInterview extends AppCompatActivity {

    PDFView pdfView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pdfinterview);

        pdfView = findViewById(R.id.pdf_interview);
        pdfView.fromAsset("android interview questions.pdf").load();
    }
}