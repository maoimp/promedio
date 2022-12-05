package com.example.intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class SegundoActivity extends AppCompatActivity {
// Definimos atrubutos
    private EditText etp;
    private EditText etm;
    private EditText etf;
    private EditText etq;
    private TextView tv_resul;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segundo);
// Conectamos la parte logica con la grafica
     etp = (EditText)findViewById(R.id.txt_prog);
     etm = (EditText) findViewById(R.id.txt_mat);
     etf = (EditText) findViewById(R.id.txt_fisica);
     etq = (EditText) findViewById(R.id.txt_quimica);
     tv_resul =(TextView)findViewById(R.id.tv_resultado);
    }
    // Metodo calcular


public void Calcular(View view){
// Definir variables para string
    String prog_String = etp.getText().toString();
    String mat_String = etm.getText().toString();
    String fis_String = etf.getText().toString();
    String qui_String = etq.getText().toString();
// Casteo
   double prog_d = Double.parseDouble(prog_String);
    double mate_d = Double.parseDouble(mat_String);
    double fis_d  = Double.parseDouble(fis_String);
   double qui_d  = Double.parseDouble(qui_String);

  double promedio = (prog_d+mate_d+fis_d+qui_d)/4;



    if( promedio >= 6){
        tv_resul.setText("Estatus aprobado"+promedio);
    }else if (promedio <=5 ){
        tv_resul.setText("Estatus rerpobado "+promedio);
    }

    prog_d= prog_d*0.30;
clear();
}
// Borrar celdas
private void clear (){
etp.setText("");
etm.setText("");
etf.setText("");
etq.setText("");
}


    // Metodo para boton anterior

    public void Anterior (View view){
        Intent anterior = new Intent(this,MainActivity.class);
        startActivity(anterior);
    }
/*
// Metodo validar

    public boolean validar(){
        String prog_String = etp.getText().toString();
        String mat_String = etm.getText().toString();
        boolean retorno;

        if (prog_String.isEmpty()){

            etp.setError("Este campo no puede quedar vacio");
            retorno=false;

        }
        return retorno=true;
    }

// Validar
*/
}