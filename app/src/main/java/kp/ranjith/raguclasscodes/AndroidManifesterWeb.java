package kp.ranjith.raguclasscodes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class AndroidManifesterWeb extends AppCompatActivity {

    WebView webVieww;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_android_manifester_web);

        webVieww = findViewById(R.id.andmanwebview);

        webVieww.setWebViewClient(new WebViewClient());
        webVieww.loadUrl("https://www.androidmanifester.in/");
    }
}