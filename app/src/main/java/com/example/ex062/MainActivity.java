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

    ArrayList<Integer> idList, colorsList;

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
        colorsList = new ArrayList<Integer>(4);
        colorsList.add(Color.RED);
        colorsList.add(Color.GREEN);
        colorsList.add(Color.BLUE);
        colorsList.add(Color.YELLOW);

        // create a id's array
        idList = new ArrayList<Integer>(4);
        idList.add(R.id.rbRed);
        idList.add(R.id.rbGreen);
        idList.add(R.id.rbBlue);
        idList.add(R.id.rbYellow);
    }

    public void changeBC(View view) {
        if (!swB.isChecked()) {
            rbID = rg.getCheckedRadioButtonId();
            MainActivity.setBackgroundColor(colorsList.get(idList.indexOf(rbID)));
        }
    }

    public void chaneClicked(View view) {
        rbID = rg.getCheckedRadioButtonId();
        if ((rbID != -1) && swB.isChecked())
            MainActivity.setBackgroundColor(colorsList.get(idList.indexOf(rbID)));
    }
}
