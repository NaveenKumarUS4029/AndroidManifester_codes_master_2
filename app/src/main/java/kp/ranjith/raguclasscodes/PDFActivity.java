package kp.ranjith.raguclasscodes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class PDFActivity extends AppCompatActivity {

    PDFView pdfView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pdfactivity);

        pdfView = findViewById(R.id.pdfview);
        pdfView.fromAsset("AndroidCourseByKPRanjith_Syllabus_AndroidManifester.pdf").load();
    }
}