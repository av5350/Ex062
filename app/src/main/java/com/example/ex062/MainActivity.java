package com.example.ex062;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Switch;

public class MainActivity extends AppCompatActivity {

    LinearLayout ll;

    Switch swB;

    RadioGroup rg;

    RadioButton rbRed, rbGreen, rbBlue, rbYellow;

    Boolean rbCheck;

    RadioButton[] idArr;
    String[] valuesArr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ll = (LinearLayout) findViewById(R.id.activity_main);

        swB = (Switch) findViewById(R.id.swB);

        rg = (RadioGroup) findViewById(R.id.rg);

        rbRed = (RadioButton) findViewById(R.id.rbRed);
        rbGreen = (RadioButton) findViewById(R.id.rbGreen);
        rbBlue = (RadioButton) findViewById(R.id.rbBlue);
        rbYellow = (RadioButton) findViewById(R.id.rbYellow);

        rbCheck = false;

        valuesArr = new String[]{"red", "green", "blue", "yellow"};
        idArr = new RadioButton[]{rbRed, rbGreen, rbBlue, rbYellow};
        // TODO: add the thing of change bc && check if idArr is needed!!!

    }

    public void rgClicked(View view) {
        rbCheck = true;
    }

    public void changeBC(View view) {
        if (rbCheck)
        {
            int rbID = rg.getCheckedRadioButtonId();
        }
    }
}
