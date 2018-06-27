package d.edu.itla.taskapp.vista;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ListView;

import java.util.List;

import d.edu.itla.taskapp.R;
import d.edu.itla.taskapp.entidad.Categoria;
import d.edu.itla.taskapp.repositorio.CategoriaRepositorio;
import d.edu.itla.taskapp.repositorio.db.CategoriaRepositorioDBImp;

public class CategoriaListaActivity extends AppCompatActivity {
    private static final String LOG_TAG = "CategoriaVistaActivity";
    private CategoriaRepositorio categoriaRepositorio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_categoria_lista);

        categoriaRepositorio = new CategoriaRepositorioDBImp(this);

        List<Categoria> categorias = categoriaRepositorio.buscar(null);
//        Log.i(LOG_TAG, "Total Categoria: " + categorias.size());

        ListView catListview = findViewById(R.id.categoria_listview);

        catListview.setAdapter(new CategoriaListAdapter(this, categorias));
    }
}
