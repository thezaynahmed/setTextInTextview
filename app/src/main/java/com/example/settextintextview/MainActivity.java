package com.example.settextintextview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText enterName;
    Button btnName;
    TextView showName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        enterName = findViewById(R.id.editText);
        btnName = findViewById(R.id.button);
        showName = findViewById(R.id.textView);



        btnName.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String name = enterName.getText().toString();
                showName.setText("Name: " + name);

                Toast.makeText(MainActivity.this, "Text Successfully Setted To " + name, Toast.LENGTH_SHORT).show();
            }
        });

    }
}
