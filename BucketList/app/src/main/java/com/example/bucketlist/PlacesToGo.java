package com.example.bucketlist;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

public class PlacesToGo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_places_to_go);
        RecyclerView recyclerViewToGo = findViewById(R.id.recycler_view_places_to_go);

        Thing.Places[] places = {
                new Thing.Places(R.drawable.japan, "Japan"),
                new Thing.Places(R.drawable.niagara_falls, "Niagara Falls"),
                new Thing.Places(R.drawable.indonesie, "Indonesia"),
                new Thing.Places(R.drawable.america, "America"),
                new Thing.Places(R.drawable.tanzania, "Tanzania"),
                new Thing.Places(R.drawable.australie, "Australia"),
                new Thing.Places(R.drawable.thailande, "Thailand"),
        };
        recyclerViewToGo.setAdapter(new ThingAdapter(places));
    }
}
