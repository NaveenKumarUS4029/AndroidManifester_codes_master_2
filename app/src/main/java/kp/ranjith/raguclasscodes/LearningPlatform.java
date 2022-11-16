package kp.ranjith.raguclasscodes;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

public class LearningPlatform extends AppCompatActivity {

    CardView basics,intermediate,advance,learningplatform;
    Animation basicsAni,intermediateAni,advanceAni,learningAni;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_learning_platform);

        basics = findViewById(R.id.basic);
        intermediate = findViewById(R.id.intermediate);
        advance = findViewById(R.id.advance);
        learningplatform = findViewById(R.id.learnplatform);

        basicsAni = AnimationUtils.loadAnimation(this,R.anim.fadebtn);
        intermediateAni = AnimationUtils.loadAnimation(this,R.anim.fadebtn);
        advanceAni = AnimationUtils.loadAnimation(this,R.anim.fadebtn);
        learningAni = AnimationUtils.loadAnimation(this,R.anim.fadebtn);


        basics.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                basics.startAnimation(basicsAni);
                startActivity(new Intent(getApplicationContext(), BasicsActivity.class));

            }
        });

        intermediate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intermediate.startAnimation(intermediateAni);
//                startActivity(new Intent(getApplicationContext(),.class));
            }
        });

        advance.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                advance.startAnimation(advanceAni);
                startActivity(new Intent(getApplicationContext(), AdvanceLearn.class));
            }
        });

        learningplatform.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                learningplatform.startAnimation(learningAni);
                startActivity(new Intent(getApplicationContext(),LearnWeb.class));
            }
        });
    }
}