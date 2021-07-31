package com.greedygame.samples.sdkx.recyclerviews;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.greedygame.samples.sdkx.recyclerviews.grid_layout.horizontal.HorizontalGridLayoutActivity;
import com.greedygame.samples.sdkx.recyclerviews.grid_layout.vertical.VerticalGridLayoutActivity;
import com.greedygame.samples.sdkx.recyclerviews.linear_layout.horizontal.HorizontalLinearLayoutActivity;
import com.greedygame.samples.sdkx.recyclerviews.linear_layout.vertical.VerticalLinearLayoutActivity;

public class MainActivity extends AppCompatActivity {

    Button verticalGridLayoutButton;
    Button horizontalGridLayoutButton;
    Button verticalLinearLayoutButton;
    Button  horizontalLinearLayoutButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        verticalGridLayoutButton = findViewById(R.id.gridLayoutButton);
        verticalGridLayoutButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, VerticalGridLayoutActivity.class));
            }
        });

        horizontalGridLayoutButton = findViewById(R.id.horizontalGridLayoutButton);
        horizontalGridLayoutButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(MainActivity.this, HorizontalGridLayoutActivity.class));
            }
        });

        verticalLinearLayoutButton = findViewById(R.id.verticalLinearLayoutButton);
        verticalLinearLayoutButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, VerticalLinearLayoutActivity.class));
            }
        });
        horizontalLinearLayoutButton = findViewById(R.id.horizontalLinearLayoutButton);
        horizontalLinearLayoutButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(MainActivity.this, HorizontalLinearLayoutActivity.class));
            }
        });
    }
}