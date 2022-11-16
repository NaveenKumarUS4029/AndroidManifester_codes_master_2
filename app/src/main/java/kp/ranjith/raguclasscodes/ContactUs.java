package kp.ranjith.raguclasscodes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class ContactUs extends AppCompatActivity {

    ImageView gmap, fb, urbanpro, whatsap,insta;
    Animation gmapAni;
    Animation fbAni;
    Animation urbanAni;
    Animation whatsapAni;
    Animation instaAni;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact_us);

        gmap = findViewById(R.id.imageView7);
        fb = findViewById(R.id.imageView8);
        urbanpro = findViewById(R.id.imageView9);
        whatsap = findViewById(R.id.imageView10);
        insta = findViewById(R.id.imageView11);

        gmapAni = AnimationUtils.loadAnimation(this, R.anim.fadebtn);
        fbAni = AnimationUtils.loadAnimation(this, R.anim.fadebtn);
        urbanAni = AnimationUtils.loadAnimation(this, R.anim.fadebtn);
        whatsapAni = AnimationUtils.loadAnimation(this, R.anim.fadebtn);
        instaAni = AnimationUtils.loadAnimation(this, R.anim.fadebtn);

        gmap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gmap.startAnimation(gmapAni);
                startActivity(new Intent(getApplicationContext(), GooglMaps.class));
            }
        });
        fb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                fb.startAnimation(fbAni);
                startActivity(new Intent(getApplicationContext(), FaceBk.class));
            }
        });
        urbanpro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                urbanpro.startAnimation(urbanAni);
                startActivity(new Intent(getApplicationContext(), UrbanPro.class));
            }
        });
        insta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                insta.startAnimation(instaAni);
                startActivity(new Intent(getApplicationContext(), InstaWeb.class));
            }
        });

//        whatsap.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                whatsap.startAnimation(whatsapAni);
//
//                String url = "https://api.whatsapp.com/send?phone=" + "+918148580586";
//                startActivity(new Intent(Intent.ACTION_VIEW).setData(Uri.parse(url)));
//            }
//        });
    }
}


