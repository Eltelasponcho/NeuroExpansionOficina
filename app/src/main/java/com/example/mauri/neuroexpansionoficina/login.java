package com.example.mauri.neuroexpansionoficina;

import android.content.Intent;
import android.os.StrictMode;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;

public class login extends AppCompatActivity {
EditText txt1,txt2;
Button btn;
    conexion cn = new conexion();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        StrictMode.ThreadPolicy p = new StrictMode.ThreadPolicy.Builder().permitAll().build();
        StrictMode.setThreadPolicy(p);
        btn = (Button) findViewById(R.id.entrar);
        txt1 = (EditText) findViewById(R.id.txtu);
        txt2 = (EditText) findViewById(R.id.txtc);
    }
    public void validar(View v) {
        String usuario = txt1.getText().toString();
        String contra = txt2.getText().toString();
        if (txt1.getText().toString().equals("") || txt2.getText().toString().equals("")) {
            Toast.makeText(getApplicationContext(), "Introduzca datos", Toast.LENGTH_SHORT).show();
        } else {
            String texto2 = cn.validar("http://natanael13.000webhostapp.com/validarlogin.php", usuario, contra);
            String[] datos = texto2.split(",");
            int c = 0;

            if (datos[c].trim().equals("1")) {

                Intent i = new Intent(getApplicationContext(), menufragment.class);
                //i.putExtra("us", usuario);

                startActivity(i);
                finish();

                Toast.makeText(getApplicationContext(), "Bienvenido! " + datos[c + 2].trim(), Toast.LENGTH_SHORT).show();

            } else {
                Toast.makeText(getApplicationContext(), "Usuario o contraseña incorrecto", Toast.LENGTH_SHORT).show();

            }

        }
    }
}
