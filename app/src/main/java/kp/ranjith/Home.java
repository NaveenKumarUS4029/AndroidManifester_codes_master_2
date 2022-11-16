package kp.ranjith;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import kp.ranjith.raguclasscodes.AdvanceLearn;
import kp.ranjith.raguclasscodes.AndroidManifesterWeb;
import kp.ranjith.raguclasscodes.BasicsActivity;
import kp.ranjith.raguclasscodes.ContactUs;
import kp.ranjith.raguclasscodes.GithubWeb;
import kp.ranjith.raguclasscodes.GooglMaps;
import kp.ranjith.raguclasscodes.GooglePics;
import kp.ranjith.raguclasscodes.LearnWeb;
import kp.ranjith.raguclasscodes.LearningPlatform;
import kp.ranjith.raguclasscodes.MainActivity;
import kp.ranjith.raguclasscodes.PDFActivity;
import kp.ranjith.raguclasscodes.PDFInterview;
import kp.ranjith.raguclasscodes.R;
import kp.ranjith.raguclasscodes.ReviewsWeb;
import kp.ranjith.raguclasscodes.TrainingAlbum;

public class Home extends AppCompatActivity {

    CardView topics,sylabus,aboutus,learn,interviewQues, contact, reviews,trainingAlbm,github;
    Animation topicsAni,sylabusAni,aboutAni,learnAni,interviewQuesAni,contactAni,reviewsAni,trainingAlbmAni,githubAni;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        topics = findViewById(R.id.topic);
        sylabus = findViewById(R.id.coursesylabus);
        aboutus = findViewById(R.id.aboutus);
        learn = findViewById(R.id.learn);
        interviewQues = findViewById(R.id.interview);
        contact = findViewById(R.id.contacts);
        reviews = findViewById(R.id.reviews);
        trainingAlbm = findViewById(R.id.training_albm);
        github = findViewById(R.id.github);


        topicsAni = AnimationUtils.loadAnimation(this,R.anim.fadebtn);
        sylabusAni = AnimationUtils.loadAnimation(this,R.anim.fadebtn);
        aboutAni = AnimationUtils.loadAnimation(this,R.anim.fadebtn);
        learnAni = AnimationUtils.loadAnimation(this,R.anim.fadebtn);
        interviewQuesAni = AnimationUtils.loadAnimation(this,R.anim.fadebtn);
        contactAni = AnimationUtils.loadAnimation(this,R.anim.fadebtn);
        reviewsAni = AnimationUtils.loadAnimation(this,R.anim.fadebtn);
        trainingAlbmAni = AnimationUtils.loadAnimation(this,R.anim.fadebtn);
        githubAni = AnimationUtils.loadAnimation(this,R.anim.fadebtn);

        topics.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                topics.startAnimation(topicsAni);
                startActivity(new Intent(Home.this, MainActivity.class));
            }
        });

        sylabus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sylabus.startAnimation(sylabusAni);

                startActivity(new Intent(Home.this, PDFActivity.class));
            }
        });


        reviews.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                reviews.startAnimation(reviewsAni);
                startActivity(new Intent(getApplicationContext(), ContactUs.class));
            }
        });

        aboutus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                aboutus.startAnimation(aboutAni);

                startActivity(new Intent(Home.this, AndroidManifesterWeb.class));
            }
        });

        learn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                learn.startAnimation(learnAni);
//                startActivity(new Intent(getApplicationContext(), LearnWeb.class));
                startActivity(new Intent(getApplicationContext(), LearningPlatform.class));
            }
        });



        interviewQues.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                interviewQues.startAnimation(interviewQuesAni);
                startActivity(new Intent(getApplicationContext(), PDFInterview.class));
            }
        });

        contact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                contact.startAnimation(contactAni);
                startActivity(new Intent(getApplicationContext(), GooglMaps.class));
            }
        });

        trainingAlbm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                trainingAlbm.startAnimation(trainingAlbmAni);
                startActivity(new Intent(getApplicationContext(), TrainingAlbum.class));
            }
        });

        github.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                github.startAnimation(githubAni);
                startActivity(new Intent(getApplicationContext(), GithubWeb.class));
            }
        });

    }


    public void goog_img(MenuItem item) {
        startActivity(new Intent(getApplicationContext(), GooglePics.class));
    }

    public void share(MenuItem item) {
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");
        String Body = "Download this App";
        String Sub = "http://play.google.com";
        intent.putExtra(Intent. EXTRA_TEXT, Body) ;
        intent.putExtra(Intent. EXTRA_TEXT, Sub);
        startActivity(Intent.createChooser(intent,"share using"));
    }

    public void quit(MenuItem item) {

        AlertDialog.Builder quit = new AlertDialog.Builder(Home.this);
        quit.setTitle("Alert");
        quit.setMessage("Are you sure quit the app");
        quit.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                finish();
                Toast.makeText(Home.this, "Thanks", Toast.LENGTH_SHORT).show();
            }
        });
        quit.setNegativeButton("No",null);
        quit.setNeutralButton("cancel",null);
        quit.show();
    }

//    public void setting(View view) {
//        startActivity(new Intent(getApplicationContext(), GithubWeb.class));
//    }

    public void website(MenuItem item) {
        startActivity(new Intent(getApplicationContext(), LearnWeb.class));
    }
}