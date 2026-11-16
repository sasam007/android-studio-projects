package com.example.resto;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class DessertsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_desserts);

        ListView dessertsList = findViewById(R.id.list_view_desserts);
        MenuItem[] desserts = {
                new MenuItem("Tiramisu","Au café",500),
                new MenuItem("Crème brûlée","Au fruit de la passion",650),
                new MenuItem("Moelleux au chocolat","Très chocolaté",550),
                new MenuItem("Salade de fruits","Avec fruits de saison",600),
                new MenuItem("Fondant au chocolat","Servi avec une boule de glace vanille",450),
                new MenuItem("Glace","Choix entre chocolat, caramel, vanille",200),
                new MenuItem("Sorbet","Fruits de saison",220),
                new MenuItem("Dame blanche","Glace vanille, chocolat chaud et chantilly",550),
                new MenuItem("Dame noire","Glace chocolat, chocolat chaud et chantilly",550),
                new MenuItem("Café gourmand","Servi avec 3 mini pâtisseries au choix",600),


        };
        ArrayAdapter<MenuItem> dessertsAdapter= new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,desserts);
        dessertsList.setAdapter(dessertsAdapter);


    }
}