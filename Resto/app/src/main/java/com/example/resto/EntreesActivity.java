package com.example.resto;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class EntreesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_entrees);


        ListView startersList = findViewById(R.id.list_view_entrées);


        MenuItem[] entrées = {
                new MenuItem("Tataki de thon", "Des fines lamelles de thon cru servies avec une sauce soja", 500),
                new MenuItem("Gyoza", "Beignets frits de poulet et légumes", 600),
                new MenuItem("Kai Satai", "Brochettes de poulet avec une sauce aux cacahuètes", 600),
                new MenuItem("Kroepoek", "Chips de crevettes", 250),
                new MenuItem("Beignets vapeur", "Beignets de crevettes cuits à la vapeur", 600),
                new MenuItem("Salade", "Un mélange de salade iceberg et roquette", 700),
                new MenuItem("Nems", "Condiments enroulés dans une fine pâte puis frits", 600),
                new MenuItem("Soupe de tomate", "Crème onctueuse de tomate avec une touche de mozzarella", 650),
                new MenuItem("Soupe de poisson", "Soupe préparée grâce à du poisson pêché le jour même", 700),
                new MenuItem("Frites", "Lamelles de pomme de terre frites", 400),

        };


        ArrayAdapter<MenuItem> entréesAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, entrées);

        startersList.setAdapter(entréesAdapter);


    }
}