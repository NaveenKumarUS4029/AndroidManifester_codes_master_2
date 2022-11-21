package kp.ranjith.raguclasscodes;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;


public class FaceBk extends AppCompatActivity {

    WebView fb;
    public void getOpenFacebookIntent(Context context) {

        startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/androidmanifester")));

        try {
           // Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("fb://profile/426253597411111"));
            //startActivity(intent);
        } catch (Exception e) {
///            startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.facebook.com/androidmanifester")));
        }
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_face_bk);

        getOpenFacebookIntent(this);


      /*  fb=findViewById(R.id.fbweb);

        fb.loadUrl("https://www.facebook.com/androidmanifester");

        fb.setWebChromeClient(new WebChromeClient() {
            private ProgressDialog mProgress;

            @Override
            public void onProgressChanged(WebView view, int progress) {
                if (mProgress == null) {
                    mProgress = new ProgressDialog(FaceBk.this);
                    mProgress.show();
                }
                mProgress.setMessage("Loading " + progress + "%");
                if (progress == 100) {
                    mProgress.dismiss();
                    mProgress = null;
                }
            }
        });*/

    }
}