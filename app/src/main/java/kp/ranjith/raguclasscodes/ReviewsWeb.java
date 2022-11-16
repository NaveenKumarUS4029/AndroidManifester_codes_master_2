package kp.ranjith.raguclasscodes;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class ReviewsWeb extends AppCompatActivity {

    WebView reviewsWeb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reviews_web);

        reviewsWeb = findViewById(R.id.reviewsWeb);
        reviewsWeb.setWebViewClient(new WebViewClient());
        reviewsWeb.loadUrl("https://www.google.com/search?q=android+manifester&sxsrf=ALiCzsZWhyhXlhmH9pNM-NBN2QYo98r6tg%3A1668460568547&ei=GLByY7mNIcSMseMPqrGLmAY&gs_ssp=eJzj4tVP1zc0TLdIKo9PqjAwYLRSNagwTjQ1MjM3SEs1NEgxsrRIsjKosEhMM0mxMEiyNExKMzQzt_ASSsxLKcrPTFHITczLTEstLkktAgAOBxZb&oq=androidmanifester&gs_lcp=Cgxnd3Mtd2l6LXNlcnAQARgDMgQIIxAnMgQIIxAnMgcIABCABBAKMg0ILhCABBDHARCvARAKMgcIABCABBAKMgcIABCABBAKMgcIABCABBAKMgcIABCABBAKMgcIABCABBAKMgcIABCABBAKOggIABCABBCwAzoKCAAQgAQQhwIQFDoFCAAQgAQ6AggmSgQIQRgBSgQIRhgAUPsQWMgdYPY0aAFwAHgAgAFxiAHABJIBAzMuM5gBAKABAcgBCsABAQ&sclient=gws-wiz-serp#lrd=0x3a52670fe10d298b:0x8af4d80b91bf1678,1,,,");
        reviewsWeb.setWebChromeClient(new WebChromeClient() {
            private ProgressDialog mProgress;

            @Override
            public void onProgressChanged(WebView view, int progress) {
                if (mProgress == null) {
                    mProgress = new ProgressDialog(ReviewsWeb.this);
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