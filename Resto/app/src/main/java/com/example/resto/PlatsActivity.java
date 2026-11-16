package com.example.resto;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class PlatsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_plats);


        ListView platsList = findViewById(R.id.list_view_plats);
        MenuItem[] plats = {
                new MenuItem("Burger", "Steak angus, salade, ketchup", 1000),
                new MenuItem("Pizza", "Pâte recouverte de sauce tomate et fromage", 800),
                new MenuItem("Poulet pané", "Blanc de poulet pané", 1350),
                new MenuItem("Ribs", "Côte de bœuf cuite à feu doux pendant longtemps pour une tendresse", 2000),
                new MenuItem("Fajita", "Galette de mais contenant du poulet, guacamole, légumes et oignons caramélisés", 1250),
                new MenuItem("Nachos", "Plat de nachos recouvert de sauce salsa, fromage et condiments", 1450),
                new MenuItem("Sushi", "Avocat, surimi, et concombre enroulés dans une feuille d'algue et du riz.", 1300),
                new MenuItem("Ramen", "Bouillon de porc avec tranches de boeuf, oeuf, feuilles d'algues et udon", 1600),
                new MenuItem("Plat gastronomique", "Tu payes pour 2 grammes de nourriture et du rêve mon gars...", 10000),
                new MenuItem("Plat enfant", "Nuggets et frites", 1050)

        };
        ArrayAdapter<MenuItem> platsAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, plats);

        platsList.setAdapter(platsAdapter);

    }
}




