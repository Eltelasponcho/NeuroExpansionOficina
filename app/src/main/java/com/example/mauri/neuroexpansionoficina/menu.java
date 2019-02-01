package com.example.mauri.neuroexpansionoficina;

import android.os.StrictMode;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class menu extends AppCompatActivity {
conexion cn = new conexion();
    RecyclerView recyclerUsuarios;
    ArrayList<Usuario> listaUsuarios;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        StrictMode.ThreadPolicy p = new StrictMode.ThreadPolicy.Builder().permitAll().build();
        StrictMode.setThreadPolicy(p);



    }

     /*public void llenar()
     {
         String texto2 = cn.verAll("http://natanael13.000webhostapp.com/vertodo.php");
         String[] datos = texto2.split(",");
         int cont = Integer.parseInt(datos[0]);
         int c = 1;
         Usuario usuario=null;
         for (int i = 1; i <= cont; i++) {
             usuario.setId(datos[c]);
             usuario.setNombre(datos[c+1]);
             usuario.setClave(datos[c+2]);
             listaUsuarios.add(usuario);
             //Toast.makeText(getApplicationContext(),dato[c] + dato[c + 1] + dato[c + 2], Toast.LENGTH_SHORT).show();
             c = c + 3;
         }
         UsuariosAdapter adapter=new UsuariosAdapter(listaUsuarios);
         recyclerUsuarios.setAdapter(adapter);
     }*/


}
