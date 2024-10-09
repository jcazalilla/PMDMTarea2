package MorenoCazalilla.JesusMaria;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MiAdaptador extends RecyclerView.Adapter {

    private String[] miDataSet;


    // Obtener referencias de los componentes visuales para cada elemento
    // referencias de los TextViews e ImageView
    public static class ViewHolder extends RecyclerView.ViewHolder {

        public TextView textView;
        public ImageView imageView;

        public ViewHolder(TextView tv, ImageView iv) {
            super(v);
            this.textView = tv;
            this.imageView = iv;
        }
    }

    /**
     * Constructor del Adaptador
     */
    public MiAdaptador(String[] miDataSet) {
        this.miDataSet = miDataSet;
    }

    /**
     * El layout invoca a este método
     * para renderizar cada elemento del RecyclerView
     */
    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        //creamos la vista

        TextView v = (TextView) LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item, parent, false);

        ViewHolder vh = new ViewHolder(v);
        return vh;
    }


    /**
     * Este método asigna valores para cada elemento de la lista
     */
    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        //obtenemos un elemento del dataSet según su posición
        // reemplazamos el contenido con el dato obtnido
        holder.itemView.setText(miDataSet[position]);
    }

    @Override
    public int getItemCount() {
        return miDataSet.length;
    }
}
