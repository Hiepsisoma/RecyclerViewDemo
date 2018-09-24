package com.example.admin.recyclerdemo;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.List;

public class MarvelAdapter extends RecyclerView.Adapter<MarvelAdapter.ViewHolder> {
    private List<Marvel> mMarvels;
    private LayoutInflater mLayoutInflater;

    public MarvelAdapter(List<Marvel> mMarvels) {
        this.mMarvels = mMarvels;
    }

    @NonNull
    @Override
    public MarvelAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        mLayoutInflater = LayoutInflater.from(parent.getContext());
        View view = mLayoutInflater.inflate(R.layout.activity_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MarvelAdapter.ViewHolder holder, int position) {
        holder.bindData(mMarvels.get(position));
    }

    @Override
    public int getItemCount() {
        return (mMarvels != null ? mMarvels.size() : 0);
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        private TextView mNameMv;
        private ImageView mImageMv;

        ViewHolder(View itemView) {
            super(itemView);
            mNameMv = itemView.findViewById(R.id.text_name);
            mImageMv = itemView.findViewById(R.id.image_photo);
        }
        public void bindData(Marvel marvel) {
            mNameMv.setText(marvel.getName());
            Glide.with(itemView.getContext()).load(marvel.getImage()).into(mImageMv);
        }
    }
}
