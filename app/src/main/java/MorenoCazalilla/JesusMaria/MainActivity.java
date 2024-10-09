package MorenoCazalilla.JesusMaria;

import android.os.Bundle;
import android.provider.ContactsContract;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    TextView personajeNombre;
    ImageView personajeFoto;

    private RecyclerView miRecyclerView;
    private MiAdaptador miAdaptador;

    /**
     * Nombres de los personajes
     */
    private static final String[] myDataSet = {
            "Mario Bross",
            "luigi",
            "Peach",
            "Toad"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        miRecyclerView = findViewById(R.id.recyclerView);
        //mejor el rendimiento
        //miRecyclerView.setHasFixedSize(true);

        //El RecyclerView usa LinearLayout
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        miRecyclerView.setLayoutManager((layoutManager));

        //asociamos el adapter al RecyclerView
        miAdaptador = new MiAdaptador(myDataSet);
        miRecyclerView.setAdapter(miAdaptador);

    }
}