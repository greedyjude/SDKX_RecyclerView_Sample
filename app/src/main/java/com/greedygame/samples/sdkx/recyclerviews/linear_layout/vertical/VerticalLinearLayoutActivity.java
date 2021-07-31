package com.greedygame.samples.sdkx.recyclerviews.linear_layout.vertical;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.greedygame.core.adview.general.AdLoadCallback;
import com.greedygame.core.adview.general.GGAdview;
import com.greedygame.core.models.general.AdErrors;
import com.greedygame.samples.sdkx.recyclerviews.R;

import org.jetbrains.annotations.NotNull;

public class VerticalLinearLayoutActivity extends AppCompatActivity {

    VerticalLinearLayoutAdapter adapter;
    RecyclerView gridContentList;
    GGAdview adview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid_layout);
        gridContentList = findViewById(R.id.gridRv);
        adapter = new VerticalLinearLayoutAdapter();
        gridContentList.setLayoutManager(new LinearLayoutManager(this,RecyclerView.VERTICAL,false));
        gridContentList.setAdapter(adapter);
        adview = new GGAdview(this);
        adview.setUnitId("float-4730");
        adview.loadAd(new AdLoadCallback() {
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
        });


    }
}
