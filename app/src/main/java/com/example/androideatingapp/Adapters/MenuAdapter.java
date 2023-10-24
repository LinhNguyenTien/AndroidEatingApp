package com.example.androideatingapp.Adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.androideatingapp.Interface.ItemClickListener;
import com.example.androideatingapp.R;
import com.example.androideatingapp.Category;
import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.firebase.ui.database.FirebaseRecyclerOptions;
import com.squareup.picasso.Picasso;

public class MenuAdapter extends FirebaseRecyclerAdapter<Category, MenuAdapter.MenuViewHolder> {

    public MenuAdapter(@NonNull FirebaseRecyclerOptions<Category> options) {
        super(options);
    }

    @Override
    protected void onBindViewHolder(@NonNull MenuViewHolder holder, int position, @NonNull Category model) {
        holder.menu_name.setText(model.getName());
        Picasso.get().load(model.getImage()).placeholder(R.drawable.loading).into(holder.menu_image);
        Category clickItem = model;
        holder.setItemClickListener(new ItemClickListener() {
            @Override
            public void onClick(View view, int position, Boolean isLongClick) {
                Toast.makeText(view.getContext(), clickItem.getName(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    @NonNull
    @Override
    public MenuViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.menu_item, parent, false);
        return new MenuViewHolder(view);
    }

    public class MenuViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

        private TextView menu_name;
        private ImageView menu_image;
        private ItemClickListener itemClickListener;
        public MenuViewHolder(@NonNull View itemView) {
            super(itemView);
            menu_name = itemView.findViewById(R.id.menu_name);
            menu_image = itemView.findViewById(R.id.menu_image);
            itemView.setOnClickListener(this);
        }

        public void setItemClickListener(ItemClickListener itemClickListener) {
            this.itemClickListener = itemClickListener;
        }

        @Override
        public void onClick(View view) {
            itemClickListener.onClick(view, getAdapterPosition(), false);
        }
    }

}
