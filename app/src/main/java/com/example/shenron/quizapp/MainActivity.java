package com.example.shenron.quizapp;

import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import static com.example.shenron.quizapp.R.id.james;
import static com.example.shenron.quizapp.R.id.one994;
import static com.example.shenron.quizapp.R.id.other_editText;

public class MainActivity extends AppCompatActivity {

    boolean java_button;
    int score=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void checkResult(View view)
    {
        RadioButton javaRadioButton = (RadioButton) findViewById(R.id.james);
        boolean javaq = javaRadioButton.isChecked();

        RadioButton worldRadioButton = (RadioButton) findViewById(R.id.one994);
        boolean worldq = worldRadioButton.isChecked();

        RadioButton distanceRadioButton = (RadioButton) findViewById(R.id.one49);
        boolean distanceq = distanceRadioButton.isChecked();

        RadioButton lightRadioButton = (RadioButton) findViewById(R.id.five12);
        boolean lightq = lightRadioButton.isChecked();

        CheckBox udacityCheckBox = (CheckBox) findViewById(R.id.udacity_checkbox);
        boolean udacityq = udacityCheckBox.isChecked();

        calculateResult(javaq,worldq,distanceq,lightq,udacityq);

    }

    public void calculateResult(boolean javaq,boolean worldq,boolean distanceq,boolean lightq,boolean udacityq)
    {
        if(javaq)
        {
            score += 1;
        }
        if(worldq)
        {
            score += 1;
        }
        if(distanceq)
        {
            score += 1;
        }
        if(lightq)
        {
            score += 1;
        }
        if(udacityq)
        {
            score += 1;
        }

        showResult();
    }

    public void showResult()
    {
        Toast.makeText(this, "" + score, Toast.LENGTH_SHORT).show();
        score=0;
    }

}
