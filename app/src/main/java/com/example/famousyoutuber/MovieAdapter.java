package com.example.famousyoutuber;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class MovieAdapter extends RecyclerView.Adapter<MovieAdapter.MovieHolder> {
    private ArrayList<ModelMovie> listData;


    public MovieAdapter(ArrayList<ModelMovie> listData) {
        this.listData = listData;
    }

    @NonNull
    @Override
    public MovieHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.rawlist, viewGroup, false);

        return new MovieHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MovieHolder movieHolder, int i) {
        movieHolder.bindView(listData.get(i));


    }

    @Override
    public int getItemCount() {
        return listData.size();
    }

    public class MovieHolder extends RecyclerView.ViewHolder {

        private TextView title;
        private ImageView ivmain,gambar;

        public MovieHolder(@NonNull View itemView) {
            super(itemView);
            title = itemView.findViewById(R.id.title);
            ivmain = itemView.findViewById(R.id.ivMain);
            gambar = itemView.findViewById(R.id.gambar);


        }

        private void bindView(ModelMovie data) {
            title.setText(data.getSubjudul());
            ivmain.setImageResource(data.getGambar());
            final String idmov = data.getId();


            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    itemView.getContext().startActivity(new Intent(itemView.getContext(),DetailMovie.class)
                            .putExtra(DetailMovie.KEY_MOVIE, idmov));

                }
            });


        }


    }
}
