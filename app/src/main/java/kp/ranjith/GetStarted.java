package kp.ranjith;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import kp.ranjith.raguclasscodes.R;

public class GetStarted extends AppCompatActivity {

    Button gtStrtBtn;
    ImageView fbFade,instaFade,whatsapFade,twitFade, tubeFade,githubFade;
    Animation gtStrtAnim,fbAnim,instaAnim,whatsapAnim,twitAnim,tubeAnim,githubAnim,leftBounceAnim;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_get_started);

        fbFade = findViewById(R.id.img_fb);
        instaFade = findViewById(R.id.img_insta);
        whatsapFade = findViewById(R.id.img_whatsapp);
        twitFade = findViewById(R.id.img_twitter);
        tubeFade = findViewById(R.id.img_youtube);
        githubFade = findViewById(R.id.img_github);

        gtStrtBtn = findViewById(R.id.startbtn);

        gtStrtAnim = AnimationUtils.loadAnimation(this, R.anim.fadebtn);
        fbAnim = AnimationUtils.loadAnimation(this, R.anim.fadebtn);
        instaAnim = AnimationUtils.loadAnimation(this, R.anim.fadebtn);
        whatsapAnim = AnimationUtils.loadAnimation(this, R.anim.fadebtn);
        twitAnim = AnimationUtils.loadAnimation(this, R.anim.fadebtn);
        tubeAnim = AnimationUtils.loadAnimation(this, R.anim.fadebtn);
        githubAnim = AnimationUtils.loadAnimation(this, R.anim.fadebtn);

        leftBounceAnim = AnimationUtils.loadAnimation(this, R.anim.leftbounce);

        gtStrtBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gtStrtBtn.startAnimation(gtStrtAnim);
                startActivity(new Intent(GetStarted.this, Home.class));
            }
        });
    }
    public void fb_ranjith(View view) {
        fbFade.startAnimation(fbAnim);
        startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/androidmanifester/")));
    }
    public void insta_ranjith(View view) {
        instaFade.startAnimation(instaAnim);
        startActivity(new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.instagram.com/androidmanifester/")));
    }
    public void whatsapp_ranjith(View view) {
        whatsapFade.startAnimation(whatsapAnim);
        String url = "https://api.whatsapp.com/send?phone=" + "+918148580586";
        startActivity(new Intent(Intent.ACTION_VIEW).setData(Uri.parse(url)));
    }

    public void twitter_ranjith(View view) {
        twitFade.startAnimation(twitAnim);
        startActivity(new Intent(Intent.ACTION_VIEW,Uri.parse("https://twitter.com/ran_jiith")));
    }
    public void youtube_ranjith(View view) {
        tubeFade.startAnimation(tubeAnim);
        startActivity(new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.youtube.com/watch?v=6wuHC61H_qc")));
    }
    public void github_ranjith(View view) {
        githubFade.startAnimation(githubAnim);
        startActivity(new Intent(Intent.ACTION_VIEW,Uri.parse("https://github.com/ranjithstar256")));
    }
}