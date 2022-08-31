package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Book_Activity extends AppCompatActivity {
    private TextView tvTitle,tvDescription,tvCategory;
    private ImageView imv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book);

        tvTitle= findViewById(R.id.textTitle);
        tvDescription = findViewById(R.id.textDescription);
        tvCategory = findViewById(R.id.textCategory);
        imv = findViewById(R.id.bookThumbnail);

        //receive data

        Intent intent = getIntent();
        String Title = intent.getExtras().getString("Title");
        String Description = intent.getExtras().getString("Description");
        int image = intent.getExtras().getInt("Thumbnail");

        //setting value
          tvTitle.setText("Title");
          tvDescription.setText("Description");
          tvCategory.setText("Category");
          imv.setImageResource(image);

    }
}