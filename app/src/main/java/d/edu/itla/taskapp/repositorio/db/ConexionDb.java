package d.edu.itla.taskapp.repositorio.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

public class ConexionDb extends SQLiteOpenHelper {
    private static final String LOG_TAG = "ConexionDb";
    private static final String NOMBRE_DB = "taskapp";
    private static final int VERSION_DB = 1;


    public ConexionDb(Context context) {
        super(context, NOMBRE_DB, null, VERSION_DB);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        Log.i(LOG_TAG, "Creando Base de Datos");

        db.execSQL(EstructutaDb.TABLA_CATEGORIA);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
