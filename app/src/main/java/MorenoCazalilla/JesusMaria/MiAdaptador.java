package MorenoCazalilla.JesusMaria;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.io.ByteArrayOutputStream;
import java.util.List;

public class MiAdaptador extends RecyclerView.Adapter<MiAdaptador.PersonajeViewHolder> {


    List<Personaje> personajes;


    MiAdaptador(List<Personaje> personajes) {
        this.personajes = personajes;
    }

    @NonNull
    @Override
    public MiAdaptador.PersonajeViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item, ViewGroup, false);
        PersonajeViewHolder pvh = new PersonajeViewHolder(v);
        return pvh;
    }

    @Override
    public void onBindViewHolder(@NonNull MiAdaptador.PersonajeViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {

        return personajes.size();
    }

    public class PersonajeViewHolder {
        CardView cv;
        TextView personajeNombre;
        ImageView personajeFoto;

        public void PersonajeViewHolder(View itemView) {
            super(itemView);
            cv = (CardView) itemView.findViewById(R.id.cv);
            personajeFoto = (ImageView) itemView.findViewById(R.id.iv_photo);
            personajeNombre = (TextView) itemView.findViewById(R.id.tv_name);
        }
    }
}
