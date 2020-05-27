package com.example.ex062;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Switch;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    LinearLayout MainActivity;

    Switch swB;

    RadioGroup rg;

    RadioButton rbRed, rbGreen, rbBlue, rbYellow;

    ArrayList<Integer> idArr, colorsArr;

    int rbID;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MainActivity = (LinearLayout) findViewById(R.id.activity_main);

        swB = (Switch) findViewById(R.id.swB);

        rg = (RadioGroup) findViewById(R.id.rg);

        rbRed = (RadioButton) findViewById(R.id.rbRed);
        rbGreen = (RadioButton) findViewById(R.id.rbGreen);
        rbBlue = (RadioButton) findViewById(R.id.rbBlue);
        rbYellow = (RadioButton) findViewById(R.id.rbYellow);

        // create a color's array
        colorsArr = new ArrayList<Integer>(5);
        colorsArr.add(Color.RED);
        colorsArr.add(Color.GREEN);
        colorsArr.add(Color.BLUE);
        colorsArr.add(Color.YELLOW);

        // create a id's array
        idArr = new ArrayList<Integer>(5);
        idArr.add(R.id.rbRed);
        idArr.add(R.id.rbGreen);
        idArr.add(R.id.rbBlue);
        idArr.add(R.id.rbYellow);
    }

    public void changeBC(View view) {
        if (!swB.isChecked()) {
            rbID = rg.getCheckedRadioButtonId();
            MainActivity.setBackgroundColor(colorsArr.get(idArr.indexOf(rbID)));
        }

    }

    public void chaneClicked(View view) {
        rbID = rg.getCheckedRadioButtonId();
        if ((rbID != -1) && swB.isChecked())
            MainActivity.setBackgroundColor(colorsArr.get(idArr.indexOf(rbID)));
    }
}
