package d.edu.itla.taskapp.vista;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import d.edu.itla.taskapp.R;
import d.edu.itla.taskapp.entidad.Categoria;
import d.edu.itla.taskapp.repositorio.CategoriaRepositorio;
import d.edu.itla.taskapp.repositorio.db.CategoriaRepositorioDBImp;

public class CategoriaActivity extends AppCompatActivity {
    private static final String LOG_TAG = "CategoriaActivity";
    private CategoriaRepositorio categoriaRepositorio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_categoria);
        categoriaRepositorio = new CategoriaRepositorioDBImp(this);

        final EditText txtNombre = (EditText) findViewById(R.id.txtNombre);
        Button btnGuardar = (Button) findViewById(R.id.btnCategoria);
        btnGuardar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Categoria categoria = new Categoria();
                categoria.setNombre(txtNombre.getText().toString());
                categoriaRepositorio.guardar(categoria);
                Log.i(LOG_TAG, categoria.toString());
            }
        });
    }

}
