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
    private TextView mainTextView;
    private Button sorryButton;
    private ImageView catPic;
    private TextView mainTextView2;
    private Button sorryButton2;
    private ImageView catPic2;
    private TextView mainTextView3;
    private Button sorryButton3;
    private ImageView catPic3;
    private Drawable angryCat;
    private Drawable happyCat;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hello_world);

        mainTextView = (TextView) findViewById(R.id.helloWorldTextView);
        mainTextView.setText("");
        mainTextView.setMaxWidth(200);

        mainTextView2 = (TextView) findViewById(R.id.helloWorldTextView2);
        mainTextView2.setText("");
        mainTextView2.setMaxWidth(200);


        mainTextView3 = (TextView) findViewById(R.id.helloWorldTextView3);
        mainTextView3.setText("");
        mainTextView3.setMaxWidth(200);

        angryCat = getResources().getDrawable(R.drawable.angry_cat);
        happyCat = getResources().getDrawable(R.drawable.happy_cat);
        sorryButton = (Button) findViewById(R.id.sorryButton);

        sorryButton2 = (Button) findViewById(R.id.sorryButton2);

        sorryButton3 = (Button) findViewById(R.id.sorryButton3);
        catPic = (ImageButton) findViewById(R.id.catPic);
        catPic.setAdjustViewBounds(true);
        catPic.setMaxHeight(200);
        catPic.setMaxWidth(200);
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
        catPic2 = (ImageButton) findViewById(R.id.catPic2);
        catPic2.setAdjustViewBounds(true);
        catPic2.setMaxHeight(200);
        catPic2.setMaxWidth(200);
        catPic2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                mainTextView2.setText("DON'T FUCKING TOUCH ME!");
                sorryButton2.setVisibility(View.VISIBLE);
                catPic2.setImageDrawable(angryCat);
            }
        });
        sorryButton2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                mainTextView2.setText("Thank you...");
                catPic2.setImageDrawable(happyCat);
                sorryButton2.setVisibility(View.INVISIBLE);
            }
        });
        catPic3 = (ImageButton) findViewById(R.id.catPic3);
        catPic3.setAdjustViewBounds(true);
        catPic3.setMaxHeight(200);
        catPic3.setMaxWidth(200);
        catPic3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                mainTextView3.setText("DON'T FUCKING TOUCH ME!");
                sorryButton3.setVisibility(View.VISIBLE);
                catPic3.setImageDrawable(angryCat);
            }
        });
        sorryButton3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                mainTextView3.setText("Thank you...");
                catPic3.setImageDrawable(happyCat);
                sorryButton3.setVisibility(View.INVISIBLE);
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
