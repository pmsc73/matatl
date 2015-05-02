package com.matatl.hello_world;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.PictureDrawable;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;


public class HelloWorld extends ActionBarActivity {
    TextView mainTextView;
    Button mainButton;
    Button sorryButton;
    ImageView catPic;
    Drawable angryCat;
    Drawable happyCat;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hello_world);

        mainTextView = (TextView) findViewById(R.id.helloWorldTextView);
        mainTextView.setText("");
        angryCat = getResources().getDrawable(R.drawable.angry_cat);
        happyCat = getResources().getDrawable(R.drawable.happy_cat);
        sorryButton = (Button) findViewById(R.id.sorryButton);
        catPic = (ImageButton) findViewById(R.id.catPic);
        catPic.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                mainTextView.setText("DON'T FUCKING TOUCH ME!");
                sorryButton.setVisibility(View.VISIBLE);
                catPic.setImageDrawable(angryCat);
            }
        });
        sorryButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                mainTextView.setText("Thank you...");
                catPic.setImageDrawable(happyCat);
                sorryButton.setVisibility(View.INVISIBLE);
            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_hello_world, menu);
        return true;
    }



}
