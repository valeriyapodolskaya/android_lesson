package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {
    TextView text;
    Button mainButton;
    Button transButton;
    EditText edit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text = findViewById(R.id.main_text);
        mainButton = findViewById(R.id.main_button);
        transButton = findViewById(R.id.trans_button);
        edit = findViewById(R.id.main_edit);

        mainButton.setOnClickListener(
            new View.OnClickListener() {
                public void onClick(View v) {
                    String set = String.valueOf(edit.getText());

                    text.setText(set);
                }
            }
        );

        transButton.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(MainActivity.this, altActivity.class);

                        startActivity(intent);
                    }
                }
        );
    }


}
