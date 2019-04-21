package com.example.avengersbio;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
private ImageView ironman;
private ImageView hulk;
private ImageView captain_america;
private ImageView thor;
private ImageView black_widow;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ironman=(ImageView)findViewById(R.id.ironman);
        captain_america=(ImageView)findViewById(R.id.captain_america);
        hulk=(ImageView)findViewById(R.id.hulk);
        thor=(ImageView)findViewById(R.id.thor);
        black_widow=(ImageView)findViewById(R.id.black_widow);
        ironman.setOnClickListener(this);
        captain_america.setOnClickListener(this);
        hulk.setOnClickListener(this);
        thor.setOnClickListener(this);
        black_widow.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId())
        {
            case R.id.ironman:
                Intent ironIntent=new Intent(MainActivity.this,Avengers.class);
                ironIntent.putExtra("Name","Robert Downey Jr.");
                startActivity(ironIntent);
                break;
            case R.id.black_widow:
                Intent blackIntent=new Intent(MainActivity.this,Avengers.class);
                blackIntent.putExtra("Name","Scarlett Johansson");
                startActivity(blackIntent);
                break;
            case R.id.captain_america:
                Intent captainIntent=new Intent(MainActivity.this,Avengers.class);
                captainIntent.putExtra("Name","Christopher Robert Evans");
                startActivity(captainIntent);
                break;
            case R.id.hulk:
                Intent hulkIntent=new Intent(MainActivity.this,Avengers.class);
                hulkIntent.putExtra("Name","Mark Ruffalo");
                startActivity(hulkIntent);
                break;
            case R.id.thor:
                Intent thorIntent=new Intent(MainActivity.this,Avengers.class);
                thorIntent.putExtra("Name","Christopher Hemsworth");
                startActivity(thorIntent);
                break;
        }

    }
}
