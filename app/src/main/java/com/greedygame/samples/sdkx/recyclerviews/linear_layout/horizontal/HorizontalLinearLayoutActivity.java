package com.greedygame.samples.sdkx.recyclerviews.linear_layout.horizontal;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.greedygame.samples.sdkx.recyclerviews.R;
import com.greedygame.samples.sdkx.recyclerviews.linear_layout.vertical.VerticalLinearLayoutAdapter;

public class HorizontalLinearLayoutActivity extends AppCompatActivity {

    VerticalLinearLayoutAdapter adapter;
    RecyclerView gridContentList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid_layout);
        gridContentList = findViewById(R.id.gridRv);
        adapter = new VerticalLinearLayoutAdapter();
        gridContentList.setLayoutManager(new LinearLayoutManager(this,RecyclerView.HORIZONTAL,false));
        gridContentList.setAdapter(adapter);

    }
}
