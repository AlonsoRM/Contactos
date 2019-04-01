package com.example.usuario.contactos;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {
    ArrayList<Contacto> contactos;
    RecyclerView rcListacontactos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rcListacontactos = findViewById(R.id.rcListaContactos);

    }
    public void IniciarLista()
    {
        contactos = new ArrayList<>();

        contactos.add(new Contacto("","","",""))
    }
}
