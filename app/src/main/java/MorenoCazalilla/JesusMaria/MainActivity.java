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

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    TextView personajeNombre;
    ImageView personajeFoto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        personajeFoto=(ImageView) findViewById(R.id.iv_photo);
        personajeNombre=(TextView) findViewById(R.id.tv_name);

        personajeNombre.setText("Mario Bross");
        personajeFoto.setImageResource(R.mipmap.mario);

    }
}