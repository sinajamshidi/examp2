package com.example.asus.examp2;

import android.content.Context;
import android.content.Intent;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.squareup.picasso.Picasso;


import static com.example.asus.examp2.R.id.save;

public class second extends AppCompatActivity {
    TextView txtview;
    ImageView img;
    Button next;
    Context mcontext;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        mcontext = this;
        bindview();
        Intent sintent = getIntent();
        String name = sintent.getStringExtra("name");
        String family = sintent.getStringExtra("family");
        txtview.setText(name + "" + family);

        Picasso.with(mcontext).load("http://artescritorio.com/wp-content/uploads/2011/07/04-android-wallpapers1.jpg").into(img);

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

              Intent nintent=new Intent(mcontext,Main3Activity.class);
                startActivity(nintent);

            }
        });

    }





    private void bindview() {
        txtview = (TextView) findViewById(R.id.txtview);
        img = (ImageView) findViewById(R.id.img);
        next=(Button) findViewById(R.id.next);

    }
    }
