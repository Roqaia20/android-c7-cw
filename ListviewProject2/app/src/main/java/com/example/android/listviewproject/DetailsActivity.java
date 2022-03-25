package com.example.android.listviewproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details3);

        TextView name = findViewById(R.id.details_name);
        ImageView image = findViewById(R.id.details_image);

        Bundle bundle = getIntent().getExtras();
        Items shopItems = (Items) bundle.getSerializable("shopItems");

        name.setText(shopItems.getItemName());
        image.setImageResource(shopItems.getItemImage());

    }
}