package com.example.a500060696.quiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Toast;

public class FourthActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth);

        RadioButton a = (RadioButton) findViewById(R.id.a);
        RadioButton b = (RadioButton) findViewById(R.id.b);
        RadioButton c = (RadioButton) findViewById(R.id.c);
       final RadioButton d = (RadioButton) findViewById(R.id.d);
        Button button6 = (Button) findViewById(R.id.button6);

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(d.isChecked()) {
                    ++SecondActivity.s;
                    Toast.makeText(getApplicationContext(), "Correct Answer", Toast.LENGTH_SHORT).show();
                }  else
                    Toast.makeText(getApplicationContext(), "Incorrect Answer", Toast.LENGTH_SHORT).show();
                goToFifthActivity();
            }
        });
    }
    private void goToFifthActivity() {
        Intent intent= new Intent(this, FifthActivity.class);
        startActivity(intent);
    }

}
