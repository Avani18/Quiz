package com.example.a500060696.quiz;

import android.content.Intent;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Toast;

public class ThirdActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        final RadioButton a = (RadioButton) findViewById(R.id.a);
        RadioButton b = (RadioButton) findViewById(R.id.b);
        RadioButton c = (RadioButton) findViewById(R.id.c);
        RadioButton d = (RadioButton) findViewById(R.id.d);
        Button button3 = (Button) findViewById(R.id.button3);

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (a.isChecked()) {
                    ++SecondActivity.s;
                    Toast.makeText(getApplicationContext(), "Correct Answer", Toast.LENGTH_SHORT).show();
                } else
                    Toast.makeText(getApplicationContext(), "Incorrect Answer", Toast.LENGTH_SHORT).show();
                goToFourthActivity();
            }
        });
    }

            private void goToFourthActivity() {
                Intent intent= new Intent(this, FourthActivity.class);
                startActivity(intent);
            }


    }

