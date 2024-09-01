package com.shlok.blackcoffer;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class profile_adapter extends RecyclerView.Adapter<profile_adapter.ProfileViewHolder> {

    private List<item_profile> profile_list;

    public profile_adapter(List<item_profile> profile_list) {
        this.profile_list = profile_list;
    }

    @NonNull
    @Override
    public ProfileViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_recycler,parent,false);
        return new ProfileViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull ProfileViewHolder holder, int position) {
        item_profile item_profile = profile_list.get(position);
        holder.profile_pic.setImageResource(item_profile.getProfile_pic());
        holder.profile_name.setText(item_profile.getProfile_name());
        holder.profile_Detail.setText(item_profile.getProfile_Detail());
        holder.profile_distance.setText(item_profile.getProfile_distance());
        holder.profile_interest.setText(item_profile.getProfile_interest());
        holder.profile_status.setText(item_profile.getProfile_status());
    }

    @Override
    public int getItemCount() {
        return profile_list.size();
    }

    public static class ProfileViewHolder extends RecyclerView.ViewHolder{

        ImageView profile_pic;
        TextView profile_name;
        TextView profile_Detail;
        TextView profile_distance;
        SeekBar seekBar_distance;
        TextView profile_interest;
        TextView profile_status;

        public ProfileViewHolder(@NonNull View itemView) {
            super(itemView);
            profile_pic = itemView.findViewById(R.id.profile_pic);
            profile_name = itemView.findViewById(R.id.profile_name);
            profile_Detail = itemView.findViewById(R.id.profile_Detail);
            profile_distance = itemView.findViewById(R.id.profile_distance);
            seekBar_distance = itemView.findViewById(R.id.seekBar_distance);
            profile_interest = itemView.findViewById(R.id.profile_interest);
            profile_status = itemView.findViewById(R.id.profile_status);

        }
    }
}
