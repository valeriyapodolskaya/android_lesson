package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.LinkedList;

public class altActivity extends AppCompatActivity {

    Button altButton;
    ImageView altImage;
    LinkedList<Drawable> imagesList = new LinkedList();
    int index = 1;

    private Drawable getNextImage (int index) {
        for(int i = index; i < imagesList.size(); ++i) {
                return imagesList.get(i);
        }

        return imagesList.get(index);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alt);

        altButton = findViewById(R.id.alt_button);
        altImage = findViewById(R.id.image);

        imagesList.add(getResources().getDrawable(R.drawable.logo));
        imagesList.add(getResources().getDrawable(R.drawable.logo2));
        imagesList.add(getResources().getDrawable(R.drawable.logo3));

        altButton.setOnClickListener(new View.OnClickListener() {
                 public void onClick(View v) {
                     altImage.setImageDrawable(getNextImage(index));

                     index++;

                     if (index >= imagesList.size()) {
                         index = 0;
                     }
                 }
             }
        );
    }
}
