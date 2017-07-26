package com.example.asus.examp2;

import android.content.Context;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Main3Activity extends AppCompatActivity {
    EditText name;
    EditText family;
    Button save;
    Context mcontext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        mcontext=this;
        bindview();
        name.setText(getshared("name",""));
        family.setText(getshared("family",""));

        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (view.getId() == R.id.save)
                {
                    setshared("name",name.getText().toString());
                    setshared("family",family.getText().toString());
                    Toast.makeText(mcontext, "data has beeen saved!", Toast.LENGTH_SHORT).show();
                }


            }
        });

    }

    private String getshared(String key, String defvalu) {

        return PreferenceManager.getDefaultSharedPreferences(mcontext).getString(key, defvalu);

    }

    private void setshared(String key, String value) {

        PreferenceManager.getDefaultSharedPreferences(mcontext).edit().putString(key,value).apply();


    }


    private void bindview() {
        name=(EditText)findViewById(R.id.name);
        family=(EditText)findViewById(R.id.family);
        save=(Button)findViewById(R.id.save);
    }

}
