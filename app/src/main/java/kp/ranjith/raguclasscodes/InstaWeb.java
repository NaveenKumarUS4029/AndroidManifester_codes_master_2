package kp.ranjith.raguclasscodes;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;

public class InstaWeb extends AppCompatActivity {

    WebView instaWeb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_insta_web);
        Uri uri = Uri.parse("http://instagram.com/androidmanifester");
        Intent likeIng = new Intent(Intent.ACTION_VIEW, uri);
        likeIng.setPackage("com.instagram.android");

        try {
            startActivity(likeIng);
        } catch (ActivityNotFoundException e) {
            startActivity(new Intent(Intent.ACTION_VIEW,
                    Uri.parse("http://instagram.com/androidmanifester")));
        }
       /* instaWeb = findViewById(R.id.instaweb);
        ///instaWeb.setWebViewClient(new WebViewClient());
        instaWeb.loadUrl("https://www.instagram.com/androidmanifester/");
        instaWeb.setWebChromeClient(new WebChromeClient() {
            private ProgressDialog mProgress;

            @Override
            public void onProgressChanged(WebView view, int progress) {
                if (mProgress == null) {
                    mProgress = new ProgressDialog(InstaWeb.this);
                    mProgress.show();
                }
                mProgress.setMessage("Loading " + progress + "%");
                if (progress == 100) {
                    Toast.makeText(InstaWeb.this, "hi", Toast.LENGTH_SHORT).show();
                    mProgress.dismiss();
                    mProgress = null;
                }
            }
        });*/
    }
}