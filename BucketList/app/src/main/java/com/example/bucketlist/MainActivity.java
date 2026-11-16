package com.example.bucketlist;

import android.content.Intent;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        CardView cardToDo = findViewById(R.id.card_view_to_do);
        CardView cardToGo = findViewById(R.id.card_view_to_go);

        cardToDo.setOnClickListener(v -> startActivity(new Intent(this, ThingsToDo.class)));
        cardToGo.setOnClickListener(v -> startActivity(new Intent(this, PlacesToGo.class)));
    }
}
