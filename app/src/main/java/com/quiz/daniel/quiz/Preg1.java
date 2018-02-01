package com.quiz.daniel.quiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Preg1 extends AppCompatActivity implements View.OnClickListener
{
    Button ver,fal;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_preg1);

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
            case R.id.verdad:
                Intent abrirv1 = new Intent(Preg1.this, Preg2.class);
                startActivity(abrirv1);
                break;

            case R.id.falso:
                Intent abrir2 = new Intent(Preg1.this, lose.class);
                startActivity(abrir2);
                break;

        }

    }
}
