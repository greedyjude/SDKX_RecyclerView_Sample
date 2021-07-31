package com.greedygame.samples.sdkx.recyclerviews.grid_layout.horizontal;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.greedygame.samples.sdkx.recyclerviews.R;
import com.greedygame.samples.sdkx.recyclerviews.grid_layout.vertical.VerticalGridLayoutAdapter;

public class HorizontalGridLayoutActivity extends AppCompatActivity {

    HorizontalGridLayoutAdapter adapter;
    RecyclerView gridContentList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid_layout);
        gridContentList = findViewById(R.id.gridRv);
        adapter = new HorizontalGridLayoutAdapter();
        gridContentList.setLayoutManager(new GridLayoutManager(this,2,RecyclerView.HORIZONTAL,false));
        gridContentList.setAdapter(adapter);

    }
}