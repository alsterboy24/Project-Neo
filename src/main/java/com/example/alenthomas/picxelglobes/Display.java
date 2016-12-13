package com.example.alenthomas.picxelglobes;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by alenthomas on 09/12/2016.
 */

public class Display extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.display);
        String username = getIntent().getStringExtra("Username");

        TextView tv = (TextView)findViewById(R.id.TVusername);
        tv.setText(username);
    }

    public void onButtonClick(View v)
    {
        if(v.getId() == R.id.But1)
        {
            Intent i = new Intent(Display.this, CameraActivity.class);
            startActivity(i);
        }
    }
}
