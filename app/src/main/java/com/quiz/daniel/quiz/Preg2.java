package com.quiz.daniel.quiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Preg2 extends AppCompatActivity implements View.OnClickListener
{
    Button ver,fal;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_preg2);

        ver=(Button)findViewById(R.id.verdad);
        ver.setOnClickListener(this);

        fal=(Button)findViewById(R.id.falso);
        fal.setOnClickListener(this);
    }

    @Override
    public void onClick(View v)
    {
        switch (v.getId())
        {
            case R.id.verdad1:
                Intent abrir1 = new Intent(Preg2.this, lose.class);
                startActivity(abrir1);
                break;

            case R.id.falso1:
                Intent abrir2 = new Intent(Preg2.this, win.class);
                startActivity(abrir2);
                break;

        }

    }
}

