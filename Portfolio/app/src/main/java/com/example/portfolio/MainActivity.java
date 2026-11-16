package com.example.portfolio;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.ArrayAdapter;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView recyclerView = findViewById(R.id.recycler_view_projects);
        Project[] projects = {

                new Project(R.drawable.getting_started, "Getting Started App", "Default 'Hello world !' app"),
                new Project(R.drawable.quote, "Motivational Quotes", "Gives you a random motivational quote"),
                new Project(R.drawable.calculator, "BMI calculator", "Calculates your Body Mass Index(BMI), telling you whether you are underweight, normal or overweight"),
                new Project(R.drawable.tape, "Meter to feet app", "Converts meters into feet/inches"),
                new Project(R.drawable.hungry_developer, "Resto", "A restaurant menu app with starters, dishes and desserts"),


        };
        ProjectsAdapter adapter = new ProjectsAdapter(projects);
        recyclerView.setAdapter(adapter);



    }

















}