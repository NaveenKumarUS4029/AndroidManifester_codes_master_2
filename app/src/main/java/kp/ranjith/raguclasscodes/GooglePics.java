package kp.ranjith.raguclasscodes;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class GooglePics extends AppCompatActivity {

    WebView webViewPics;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_google_pics);

        webViewPics = findViewById(R.id.goog_pics);

        webViewPics.setWebViewClient(new WebViewClient());
        webViewPics.loadUrl("https://www.google.com/search?q=androidmanifester&sxsrf=ALiCzsYtsjAHwtl85PCYPJtPqIukgNM12Q:1668532338019&source=lnms&tbm=isch&sa=X&ved=2ahUKEwiV5raq17D7AhV8TmwGHaXgDQkQ_AUoAXoECAIQAw&biw=1252&bih=723&dpr=2");
        webViewPics.setWebChromeClient(new WebChromeClient() {
            private ProgressDialog mProgress;

            @Override
            public void onProgressChanged(WebView view, int progress) {
                if (mProgress == null) {
                    mProgress = new ProgressDialog(GooglePics.this);
                    mProgress.show();
                }
                mProgress.setMessage("Loading " + progress + "%");
                if (progress == 100) {
                    mProgress.dismiss();
                    mProgress = null;
                }
            }
        });
    }
}