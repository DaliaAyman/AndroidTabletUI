package com.android.dalia.androidtabletui.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.android.dalia.androidtabletui.R;
import com.android.dalia.androidtabletui.models.AndroidVersion;

import java.util.List;

/**
 * Created by Dalia on 9/3/2016.
 */
public class AndroidVersionsAdapter extends RecyclerView.Adapter<AndroidVersionsAdapter.ViewHolder>{
    private List<AndroidVersion> versionsList;

    public AndroidVersionsAdapter(List<AndroidVersion> versionsList) {
        this.versionsList = versionsList;
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        ImageView image;
        TextView name;
        TextView api_level;
        TextView number;

        public ViewHolder(View itemView) {
            super(itemView);

            image = (ImageView) itemView.findViewById(R.id.image);
            name = (TextView) itemView.findViewById(R.id.name);
            api_level = (TextView) itemView.findViewById(R.id.api_level);
            number = (TextView) itemView.findViewById(R.id.number);
        }
    }


    @Override
    public int getItemCount() {
        return versionsList.size();
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.list_row_android_version, parent, false);

        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        AndroidVersion version = versionsList.get(position);

        holder.image.setImageDrawable(version.getImage());
        holder.name.setText(version.getName());
        holder.api_level.setText(Double.toString(version.getApi_level()));
        holder.number.setText(Double.toString(version.getNumber()));
    }
}
