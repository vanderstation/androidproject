package d.edu.itla.taskapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import d.edu.itla.taskapp.vista.CategoriaActivity;
import d.edu.itla.taskapp.vista.CategoriaListaActivity;

public class MainActivity extends AppCompatActivity {

    //LOG
    private static final String LOG_TAC = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnCategoria = findViewById(R.id.btnCategoria);
        Button btnCrearCategoria = findViewById(R.id.btnCrearCategoria);

        btnCategoria.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, CategoriaListaActivity.class);
                startActivity(intent);
            }
        });

        btnCrearCategoria.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, CategoriaActivity.class);
                startActivity(intent);
            }
        });

//        Categoria cat = new Categoria();
//
//        cat.setDescription("Categoria 1");
//        cat.setId(2);
//
//        Log.i(LOG_TAC, cat.toString());
    }
}
