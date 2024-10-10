package morenocazalilla.jesusmaria;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import MorenoCazalilla.JesusMaria.R;


public class MainActivity extends AppCompatActivity {

    ArrayList<Personaje> listaPersonajes;
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        //creamos la lista de personajes
        listaPersonajes = new ArrayList<Personaje>();

        Personaje MarioBross = new Personaje("Mario Bross", "Mario es muy positivo y siempre está alegre");
        listaPersonajes.add(MarioBross);
        Personaje Peach = new Personaje("Peach", "Siempre está trabajando para crear un mundo en el que todos puedan convivir juntos y felices");
        listaPersonajes.add(Peach);
        Personaje Luigi = new Personaje("Luigi", "Un poco de nervioso, especialmente si hay fantasmas por ahí. Es hermano de Mario");
        listaPersonajes.add(Luigi);
        Personaje Toad = new Personaje("Toad", "Tiene manchas rojas en la cabeza, es muy alegre y leal");
        listaPersonajes.add(Toad);

        //pasamos la lista al adaptador
        MiAdaptador adaptador = new MiAdaptador(listaPersonajes);
        //pasamos como referencia el adaptador al Recycler
        recyclerView.setAdapter(adaptador);


    }
}