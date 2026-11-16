package com.example.bucketlist;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ThingAdapter extends RecyclerView.Adapter<ThingAdapter.ThingViewHolder> {
    private final Thing[] things;
    public ThingAdapter(Thing[] things){
        this.things=things;
    }

    @Override
    public int getItemCount() {
        return things.length;
    }


    @NonNull
    @Override
    public ThingViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_thing, parent, false);

        return new ThingViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ThingViewHolder holder, int position) {
        holder.bind(things[position]);

    }


    static class ThingViewHolder extends RecyclerView.ViewHolder{
        private ImageView imageThing;
        private TextView textThing;

        public ThingViewHolder(@NonNull View itemView) {
            super(itemView);
            imageThing= itemView.findViewById(R.id.image_view_thing);
            textThing=itemView.findViewById(R.id.text_view_thing);

        }
        public void bind(Thing thing){
            imageThing.setImageResource(thing.imageThing);
            textThing.setText(thing.titleThing);

        }


    }
}

