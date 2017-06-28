package com.example.android.checkbox;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

import static com.example.android.checkbox.R.string.points;
import static com.example.android.checkbox.R.string.q1;
import static com.example.android.checkbox.R.string.q3;


public class MainActivity extends AppCompatActivity {

    int q1points = 0;
    int q2points = 0;
    int q3points = 0;
    int q4points = 0;
    int q5points = 0;
    int q6points = 0;
    int q7points = 0;
    int q8points = 0;

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("Q1A3", q1points);
        outState.putInt("Q2A1", q2points);
        outState.putInt("Q3A3", q3points);
        outState.putInt("Q4A1", q4points);
        outState.putInt("Q5A2", q5points);
        outState.putInt("Q6A1", q6points);
        outState.putInt("Q7A3", q7points);
        outState.putInt("Q8A2", q8points);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (savedInstanceState != null) {
            q1points = savedInstanceState.getInt("Q1A3");
            q2points = savedInstanceState.getInt("Q2A1");
            q3points = savedInstanceState.getInt("Q3A3");
            q4points = savedInstanceState.getInt("Q4A1");
            q5points = savedInstanceState.getInt("Q5A2");
            q6points = savedInstanceState.getInt("Q6A1");
            q7points = savedInstanceState.getInt("Q7A3");
            q8points = savedInstanceState.getInt("Q8A1");
        }

    }

    // Question 1 radio buttons
    public int question1(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) findViewById(R.id.Q1A3)).isChecked();

        // Check which radio button was clicked

        if (checked) {
            q1points = 1;
        } else {
            q1points = 0;
        }
        return q1points;
    }

    // Question 2 radio buttons
    public int question2(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) findViewById(R.id.Q2A1)).isChecked();


        // Check which radio button was clicked
        if (checked) {
            q2points = 1;
        } else {
            q2points = 0;
        }
        return q2points;
    }

    // Question 3 radio buttons
    public int question3(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) findViewById(R.id.Q3A3)).isChecked();

        // Check which radio button was clicked
        if (checked) {
            q3points = 1;
        } else {
            q3points = 0;
        }

        return q3points;
    }

    // Question 4 Multi Answer Question
    public int question4(View View) {

        // Is the view now checked?
        CheckBox checkBoxPerson1 = (CheckBox) findViewById(R.id.person1);
        boolean checkedPerson1 = checkBoxPerson1.isChecked();
        CheckBox checkBoxPerson2 = (CheckBox) findViewById(R.id.person2);
        boolean checkedPerson2 = checkBoxPerson2.isChecked();
        CheckBox checkBoxPerson3 = (CheckBox) findViewById(R.id.person3);
        boolean checkedPerson3 = checkBoxPerson3.isChecked();
        if (checkedPerson1 && checkedPerson2 && checkedPerson3) {
            q4points = 1;
        } else {
            q4points = 0;
        }
        return q4points;
    }

    // Question 5 Radio Buttons
    public int question5(View view) {
        boolean checked = ((RadioButton) findViewById(R.id.Q5A2)).isChecked();
        // Is the button now checked?

        if (checked) {
            q5points = 1;
        } else {
            q5points = 0;
        }
        return q5points;
    }

    // Question 6 Radio Buttons
    public int question6(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) findViewById(R.id.Q6A1)).isChecked();

        // Check which radio button was clicked
        if (checked) {
            q6points = 1;
        } else {
            q6points = 0;
        }

        return q6points;
    }

    // Question 7 Multi Answer Question
    public int question7(View View) {

        // Is the view now checked?
        CheckBox checkBoxSun1 = (CheckBox) findViewById(R.id.object1);
        boolean checkedSun1 = checkBoxSun1.isChecked();
        CheckBox checkBoxSun2 = (CheckBox) findViewById(R.id.object2);
        boolean checkedSun2 = checkBoxSun2.isChecked();
        CheckBox checkBoxSun3 = (CheckBox) findViewById(R.id.object3);
        boolean checkedSun3 = checkBoxSun3.isChecked();
        if (checkedSun1 && checkedSun2 && checkedSun3) {
            q7points = 1;
        } else {
            q7points = 0;
        }
        return q7points;
    }

    // Question 8 Radio Buttons
    public int question8(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) findViewById(R.id.Q8A2)).isChecked();

        // Check which radio button was clicked
        if (checked) {
            q8points = 1;
        } else {
            q8points = 0;
        }

        return q8points;
    }

    // Displays Name and Score
    public int results(View View) {
        EditText nameField = (EditText) findViewById(R.id.name_field);
        String name = nameField.getText().toString();
        Toast.makeText(getApplicationContext(), getString(R.string.hey) + name + getString(R.string.you) + (q1points + q2points + q3points + q4points + q5points + q6points + q7points + q8points) + getString(points), Toast.LENGTH_LONG).show();
        q1points = 0;
        q2points = 0;
        q3points = 0;
        q4points = 0;
        q5points = 0;
        q6points = 0;
        q7points = 0;
        q8points = 0;
        return (q1points + q2points + q3points + q4points + q5points + q6points + q7points + q8points);

    }
}