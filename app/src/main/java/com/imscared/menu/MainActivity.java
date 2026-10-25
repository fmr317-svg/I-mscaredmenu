package com.imscared.menu;

import android.app.Activity;
import android.os.Bundle;
import android.graphics.Color;
import android.graphics.Typeface;
import android.view.Gravity;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Switch;

public class MainActivity extends Activity {
    LinearLayout panel;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ScrollView scroll = new ScrollView(this);
        scroll.setBackgroundColor(Color.BLACK);

        panel = new LinearLayout(this);
        panel.setOrientation(LinearLayout.VERTICAL);
        panel.setPadding(24, 35, 24, 25);
        panel.setBackgroundColor(Color.rgb(18, 18, 18));

        TextView title = new TextView(this);
        title.setText("I’MSCARED");
        title.setTextColor(Color.RED);
        title.setTextSize(30);
        title.setTypeface(null, Typeface.BOLD);
        title.setGravity(Gravity.CENTER);
        panel.addView(title);

        TextView subtitle = new TextView(this);
        subtitle.setText("DEVIL'S ROULETTE VR");
        subtitle.setTextColor(Color.LTGRAY);
        subtitle.setGravity(Gravity.CENTER);
        subtitle.setPadding(0, 10, 0, 25);
        panel.addView(subtitle);

        addToggle("Menu Enabled", false);
        addToggle("Custom UI", false);
        addToggle("Practice Mode (Demo)", false);
        addToggle("Debug Mode", false);

        scroll.addView(panel);
        setContentView(scroll);
    }

    void addToggle(String name, boolean initial) {
        Switch toggle = new Switch(this);
        toggle.setText(name);
        toggle.setTextColor(Color.WHITE);
        toggle.setTextSize(16);
        toggle.setChecked(initial);
        toggle.setPadding(0, 15, 0, 15);
        panel.addView(toggle);
    }
}
