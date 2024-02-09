package com.example.calculadora;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TabHost;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TabHost tbh;
        TextView tempVal;
        Button btn;
        Spinner spn;
        conversores objconversor = new conversores();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tbh = findViewById(R.id.tbhConversores);
        tbh.setup();

        tbh.addTab(tbh.newTabSpec("LONGITUD").setContent(R.id.tabLongitud).setIndicator("LONGITUD", null));
        tbh.addTab(tbh.newTabSpec("ALMACENAMIENTO").setContent(R.id.tabAlmacenamiento).setIndicator("ALMACENAMIENTO", null));
        tbh.addTab(tbh.newTabSpec("MONEDAS").setContent(R.id.tabMonedas).setIndicator("MONEDAS",null));


        btn = findViewById(R.id.btnLongitudConvertir);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                spn= findViewById(R.id.spnLongitudDe);
                int de =spn.getSelectedItemPosition();

                spn= findViewById(R.id.spnLongitudDe);
                int a =spn.getSelectedItemPosition();

                tempVal = findViewById(R.id.txtLongitudCantidad);
                double cantidad = Double.parseDouble(tempVal.getText().toString());

                Double resp= objconversor.convertir(0,de,a,cantidad);
                Toast.makeText(getApplicationContext(),"Respuesta: "+
                        resp, Toast.LENGTH_LONG).show();

            }
        });
    }
    class conversores{
        double[][]Valores={
                //Longitud
                {1,100,39.3701,3.28084,1.193,1.0936133333333,0.001,0.000621371,0.001,0.000001,0.000000001
                },
        //Almacenamiento
        {1,8,1000*8,Math.pow(1,2)*8,Math.pow(1,3)*8,Math.pow(1,4)*8,Math.pow(1,5)*8,Math.pow(1,6)*8,Math.pow(1,7)*8,};

        public double convertir (int opcion,int de,int a,double cantidad){
            return  Valores [opcion][a]/Valores[opcion][de]*cantidad;
        }
        }
    }