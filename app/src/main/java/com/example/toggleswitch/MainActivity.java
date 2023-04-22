package com.example.toggleswitch;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Switch;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {
    ToggleButton tB;
    Switch s;
    LinearLayout layout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tB = findViewById(R.id.toggleButton);
        s = findViewById(R.id.switch1);
        layout = findViewById(R.id.LL);
    }

    public void btn(View view) {
        if (tB.isChecked() && s.isChecked()){
            layout.setBackgroundColor(Color.RED);
        } else if (tB.isChecked() && !(s.isChecked())) {
            layout.setBackgroundColor(Color.YELLOW);
        } else if (s.isChecked() && !(tB.isChecked())) {
            layout.setBackgroundColor(Color.BLUE);
            } else {
            layout.setBackgroundColor(Color.GREEN);
        }
    }
}