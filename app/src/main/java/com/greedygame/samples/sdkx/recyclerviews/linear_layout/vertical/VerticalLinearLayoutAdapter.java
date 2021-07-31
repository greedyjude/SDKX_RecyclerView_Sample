package com.greedygame.samples.sdkx.recyclerviews.linear_layout.vertical;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.CircularProgressDrawable;

import com.bumptech.glide.Glide;
import com.greedygame.core.adview.general.AdLoadCallback;
import com.greedygame.core.adview.general.GGAdview;
import com.greedygame.core.models.general.AdErrors;
import com.greedygame.samples.sdkx.recyclerviews.R;
import com.greedygame.samples.sdkx.recyclerviews.data.DataManager;
import com.greedygame.samples.sdkx.recyclerviews.data.Hit;

import org.jetbrains.annotations.NotNull;

public class VerticalLinearLayoutAdapter extends RecyclerView.Adapter<VerticalLinearLayoutAdapter.ViewHolder> {
    @NonNull
    @NotNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull @NotNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(viewType, parent, false);
        if (viewType == R.layout.horizontal_grid_image) {
            return new GridContentViewHolder(view);
        }
        return new GridAdViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull @NotNull ViewHolder holder, int position) {
        if (position % 5 == 0) {
            holder.bind(null);
        } else {
            holder.bind(DataManager.apiImages.hits.get(position));
        }
    }

    @Override
    public int getItemCount() {
        DataManager.getInstance();
        return (int) DataManager.apiImages.totalHits;
    }

    @Override
    public int getItemViewType(int position) {
        if (position % 5 == 0) {
            return R.layout.horizontal_grid_ad;
        } else {
            return R.layout.horizontal_grid_image;
        }
    }

    abstract public class ViewHolder extends RecyclerView.ViewHolder {
        public ViewHolder(@NonNull @NotNull View itemView) {
            super(itemView);
        }

        public abstract void bind(Hit hit);
    }

    class GridAdViewHolder extends ViewHolder {
        GGAdview adview;

        public GridAdViewHolder(@NonNull @NotNull View itemView) {
            super(itemView);
            adview = itemView.findViewById(R.id.contentAd);
        }

        @Override
        public void bind(Hit hit) {
            adview.setUnitId("float-4730");
            adview.loadAd(adLoadCallback);
        }

        AdLoadCallback adLoadCallback = new AdLoadCallback() {
            @Override
            public void onAdLoaded() {

            }

            @Override
            public void onAdLoadFailed(@NotNull AdErrors adErrors) {

            }

            @Override
            public void onUiiOpened() {

            }

            @Override
            public void onUiiClosed() {

            }

            @Override
            public void onReadyForRefresh() {

            }
        };
    }

    class GridContentViewHolder extends ViewHolder {
        ImageView imageView;

        public GridContentViewHolder(@NonNull @NotNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.contentImage);
        }

        @Override
        public void bind(Hit hit) {
            CircularProgressDrawable circularProgressDrawable = new CircularProgressDrawable(imageView.getContext());
            circularProgressDrawable.setStrokeWidth(2);
            circularProgressDrawable.start();
            Glide.with(imageView).load(hit.largeImageURL).placeholder(circularProgressDrawable).into(imageView);
        }
    }
}