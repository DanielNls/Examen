package com.quiz.daniel.quiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Inicio extends AppCompatActivity implements View.OnClickListener
{
    Button jug, sal;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio);

        jug=(Button)findViewById(R.id.play);
        jug.setOnClickListener(this);

        sal=(Button)findViewById(R.id.exit);
        sal.setOnClickListener(this);
    }

    @Override
    public void onClick(View v)
    {

        switch (v.getId())
        {
            case R.id.play:
                Intent abrir1 = new Intent(Inicio.this, Preg1.class);
                startActivity(abrir1);
                break;

            case R.id.exit:
                System.exit(0);
                break;

        }

    }
}
