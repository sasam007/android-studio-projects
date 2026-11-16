package com.example.metertofeetconverter;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    private static final double FEET_PER_METER = 3.28084;
    private static final int INCHES_PER_FOOT = 12;

    private EditText meterEditText;
    private Button convertButton;
    private TextView resultTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViews();
        convertButton.setOnClickListener(v -> onConvertClicked());
    }

    private void findViews() {
        meterEditText = findViewById(R.id.metersInput);
        convertButton = findViewById(R.id.convertButton);
        resultTextView = findViewById(R.id.resultText);
    }

    private void onConvertClicked() {
        String input = meterEditText.getText().toString().trim();
        if (input.isEmpty()) {
            Toast.makeText(this, "You need to fill the distance field", Toast.LENGTH_SHORT).show();
            return;
        }

        double meters;
        try {
            meters = Double.parseDouble(input);
        } catch (NumberFormatException e) {
            Toast.makeText(this, "Please enter a valid number", Toast.LENGTH_SHORT).show();
            return;
        }

        displayResult(meters);
    }

    private void displayResult(double meters) {
        // Round to the nearest inch first, so we never display something like "5 ft 12 in".
        long totalInches = Math.round(meters * FEET_PER_METER * INCHES_PER_FOOT);
        long feet = totalInches / INCHES_PER_FOOT;
        long inches = totalInches % INCHES_PER_FOOT;
        resultTextView.setText(String.format(Locale.getDefault(), "%d ft %d in", feet, inches));
    }
}
