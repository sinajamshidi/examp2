package com.example.asus.examp2;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import javax.xml.transform.TransformerFactory;

public class MainActivity extends AppCompatActivity {
    EditText name;
    EditText family;
    Button save;
    Context mcontext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mcontext=this;
        bindview();

        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String namevalue=name.getText().toString();
                String familyvalue=family.getText().toString();
                String result=namevalue+""+familyvalue;

                Intent intent=new Intent(mcontext,second.class);
                intent.putExtra("name",namevalue);
                intent.putExtra("family",familyvalue);
                Toast.makeText(mcontext, result, Toast.LENGTH_LONG).show();
                startActivity(intent);

            }

        });
    }

    private void bindview() {
        name=(EditText) findViewById(R.id.name);
        family=(EditText) findViewById(R.id.family);
        save=(Button) findViewById(R.id.save);
    }
}
