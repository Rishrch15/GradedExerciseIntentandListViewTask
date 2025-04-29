package com.example.graded_exercise_intent_and_listview_task;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        ImageView imageView = findViewById(R.id.detailImage);
        TextView titleView = findViewById(R.id.detailTitle);
        TextView descView = findViewById(R.id.detailDescription);

        String title = getIntent().getStringExtra("title");
        String desc = getIntent().getStringExtra("description");
        int image = getIntent().getIntExtra("image", 0);

        titleView.setText(title);
        descView.setText(desc);
        imageView.setImageResource(image);
    }
}
