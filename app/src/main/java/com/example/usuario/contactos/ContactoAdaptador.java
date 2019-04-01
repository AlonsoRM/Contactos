package com.example.usuario.contactos;

import android.media.Image;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class ContactoAdaptador extends RecyclerView.Adapter  <ContactoAdaptador.ContactoViewHolder>{
    ArrayList<Contacto> contactos;
    public ContactoAdaptador (ArrayList<Contacto> contactos)
    {
        this.contactos=contactos;
    }

    @NonNull
    @Override
    public ContactoViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.cardview_contacto,viewGroup,false);
        return new ContactoViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ContactoViewHolder contactoViewHolder, int posicion) {

        final Contacto contacto = contactos.get(posicion);
        contactoViewHolder.txxtv_correo.setText(contacto.getCorreo());
        contactoViewHolder.txtv_telefono.setText(contacto.getTelefono());
        contactoViewHolder.imgFoto.setText(contacto.getIdFoto());
    }


    @Override
    public int getItemCount() {
        return 0;
    }
    public static class ContactoViewHolder extends RecyclerView.ViewHolder
    {
        private ImageView imgFoto;
        private TextView txxtv_correo;
        private TextView txtv_telefono;

        public ContactoViewHolder(@NonNull View itemView) {
            super(itemView);
            imgFoto = itemView.findViewById(R.id.imgFoto);
            txtv_telefono=itemView.findViewById(R.id.txtvTelefono);
            txxtv_correo=itemView.findViewById(R.id.txtbCorreo);
        }
    }
}
