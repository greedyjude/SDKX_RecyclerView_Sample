package com.greedygame.samples.sdkx.recyclerviews.grid_layout.vertical;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.greedygame.samples.sdkx.recyclerviews.R;

public class VerticalGridLayoutActivity extends AppCompatActivity {

    VerticalGridLayoutAdapter adapter;
    RecyclerView gridContentList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid_layout);
        gridContentList = findViewById(R.id.gridRv);
        adapter = new VerticalGridLayoutAdapter();
        gridContentList.setLayoutManager(new GridLayoutManager(this,2,RecyclerView.VERTICAL,false));
        gridContentList.setAdapter(adapter);

    }
}