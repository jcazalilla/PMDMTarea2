package morenocazalilla.jesusmaria;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import MorenoCazalilla.JesusMaria.R;

public class MiAdaptador extends RecyclerView.Adapter<MiAdaptador.ViewHolder> {

    ArrayList<Personaje> listPersonajes;

    public MiAdaptador(ArrayList<Personaje> listPersonajes) {
        this.listPersonajes = listPersonajes;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item, null, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.asignarPersonajes(listPersonajes.get(position));
    }

    @Override
    public int getItemCount() {
        return listPersonajes.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        //los datos que tenemos en el layout item.xml
        //que mostraremos en el RecyclerView
        TextView name;
        ImageView photo;
        TextView description;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.tv_name);
            photo = itemView.findViewById(R.id.iv_photo);

        }

        public void asignarPersonajes(Personaje personaje) {
            name.setText(personaje.getName());
            description.setText(personaje.getDescription());
            //photo.setImageResource(personaje.getPhoto());

        }
    }
}
