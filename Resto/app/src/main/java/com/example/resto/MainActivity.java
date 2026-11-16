package com.example.resto;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    CardView cardEntrees;
    CardView cardPlats;
    CardView cardDesserts;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        cardEntrees = findViewById(R.id.card_view_entrees);
        cardPlats = findViewById(R.id.card_view_plats);
        cardDesserts = findViewById(R.id.card_view_desserts);


        cardEntrees.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent entreesActivityIntent = new Intent(MainActivity.this, EntreesActivity.class);

                startActivity(entreesActivityIntent);
            }
        });

        cardPlats.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent platsActivityIntent = new Intent(MainActivity.this, PlatsActivity.class);
                startActivity(platsActivityIntent);
            }
        });
        cardDesserts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent dessertsActivityIntent = new Intent(MainActivity.this,DessertsActivity.class);
                startActivity(dessertsActivityIntent);
            }
        });
        TextView emailTextView = findViewById(R.id.text_view_adresse_email);
        emailTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent launchEmailAppIntent = new Intent(Intent.ACTION_SENDTO);
                launchEmailAppIntent.setData(Uri.parse("mailto:contact@resto.example"));
                try {
                    startActivity(launchEmailAppIntent);
                } catch (ActivityNotFoundException e) {
                    Toast.makeText(MainActivity.this, "No email app installed", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}