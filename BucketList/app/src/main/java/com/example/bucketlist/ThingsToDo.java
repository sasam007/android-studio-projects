package com.example.bucketlist;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

public class ThingsToDo extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_things_to_do);
        RecyclerView recyclerViewToDo = findViewById(R.id.recycler_view_things_to_do);

        Thing.Experiences[] things = {
                new Thing.Experiences(R.drawable.bungee, "Bungee jump"),
                new Thing.Experiences(R.drawable.rodeo, "Rodeo"),
                new Thing.Experiences(R.drawable.parachute, "Parachute jump"),
                new Thing.Experiences(R.drawable.salto, "Backflip"),
                new Thing.Experiences(R.drawable.diplome, "Get a diploma"),
                new Thing.Experiences(R.drawable.airsoft, "Airsoft"),
                new Thing.Experiences(R.drawable.tir, "Real shooting"),
        };
        recyclerViewToDo.setAdapter(new ThingAdapter(things));
    }
}
