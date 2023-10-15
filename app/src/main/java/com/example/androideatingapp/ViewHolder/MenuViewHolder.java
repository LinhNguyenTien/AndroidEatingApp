package com.example.androideatingapp.ViewHolder;

import android.view.View;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import android.widget.ImageView;
import android.widget.TextView;

import com.example.androideatingapp.Interface.ItemClickerListener;
import com.example.androideatingapp.R;

public class MenuViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

    public TextView txtMenuName;
    public ImageView imageView;
    private ItemClickerListener itemClickerListener;

    public TextView getTxtMenuName() {
        return txtMenuName;
    }

    public void setTxtMenuName(TextView txtMenuName) {
        this.txtMenuName = txtMenuName;
    }

    public ImageView getImageView() {
        return imageView;
    }

    public void setImageView(ImageView imageView) {
        this.imageView = imageView;
    }

    public ItemClickerListener getItemClickerListener() {
        return itemClickerListener;
    }

    public void setItemClickerListener(ItemClickerListener itemClickerListener) {
        this.itemClickerListener = itemClickerListener;
    }

    public MenuViewHolder(@NonNull View itemView) {
        super(itemView);

        txtMenuName = itemView.findViewById(R.id.menu_name);
        imageView = itemView.findViewById(R.id.menu_image);

        itemView.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        itemClickerListener.onClick(view, getAdapterPosition(), false);
    }
}
