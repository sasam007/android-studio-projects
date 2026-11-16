package com.example.bmicalculator;

import android.os.Bundle;
import android.text.TextUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    private static final int ADULT_AGE = 18;
    private static final double UNDERWEIGHT_LIMIT = 18.5;
    private static final double OVERWEIGHT_LIMIT = 25.0;

    private final DecimalFormat bmiFormat = new DecimalFormat("0.00");

    private RadioButton male;
    private RadioButton female;
    private EditText age;
    private EditText height;
    private EditText weight;
    private Button calculate;
    private TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViews();
        calculate.setOnClickListener(v -> onCalculateClicked());
    }

    private void findViews() {
        male = findViewById(R.id.radio_button_male);
        female = findViewById(R.id.radio_button_female);
        age = findViewById(R.id.edit_text_age);
        height = findViewById(R.id.edit_text_height);
        weight = findViewById(R.id.edit_text_weight);
        calculate = findViewById(R.id.button_calculate);
        result = findViewById(R.id.text_view_result);
    }

    private void onCalculateClicked() {
        Integer ageValue = readPositiveInt(age);
        Integer heightCm = readPositiveInt(height);
        Integer weightKg = readPositiveInt(weight);

        if (ageValue == null || heightCm == null || weightKg == null) {
            Toast.makeText(this, "Please enter a valid age, height and weight", Toast.LENGTH_SHORT).show();
            return;
        }

        double bmi = calculateBmi(heightCm, weightKg);
        result.setText(ageValue >= ADULT_AGE ? adultResult(bmi) : childGuidance(bmi));
    }

    /** Returns the field's value as a strictly positive integer, or null if it is empty or invalid. */
    @Nullable
    private static Integer readPositiveInt(EditText field) {
        String text = field.getText().toString().trim();
        if (TextUtils.isEmpty(text)) {
            return null;
        }
        try {
            int value = Integer.parseInt(text);
            return value > 0 ? value : null;
        } catch (NumberFormatException e) {
            return null;
        }
    }

    static double calculateBmi(int heightCm, int weightKg) {
        double heightInMeters = heightCm / 100.0;
        return weightKg / (heightInMeters * heightInMeters);
    }

    private String adultResult(double bmi) {
        String category;
        if (bmi < UNDERWEIGHT_LIMIT) {
            category = "Underweight";
        } else if (bmi >= OVERWEIGHT_LIMIT) {
            category = "Overweight";
        } else {
            category = "OK";
        }
        return bmiFormat.format(bmi) + " - " + category;
    }

    private String childGuidance(double bmi) {
        String group;
        if (male.isChecked()) {
            group = "boys' ";
        } else if (female.isChecked()) {
            group = "girls' ";
        } else {
            group = "";
        }
        return bmiFormat.format(bmi) + " - for more information about " + group
                + "healthy ranges, feel free to ask your doctor";
    }
}
