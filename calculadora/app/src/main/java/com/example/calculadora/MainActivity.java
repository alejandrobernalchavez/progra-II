package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tempVal;
    RadioGroup opt;
    Button btn;
    Spinner spn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = findViewById(R.id.btnCalcular);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try{
                    //opt = findViewById(R.id.optCalculadora);
                    spn = findViewById(R.id.spnOpciones);

                    tempVal = findViewById(R.id.txtnum1);
                    double num1 =0;
                    if(!tempVal.getText().toString().isEmpty())
                     num1 = Double.parseDouble(tempVal.getText().toString());

                    tempVal = findViewById(R.id.txtnum2);
                    double num2=0;
                    if(!tempVal.getText().toString().isEmpty())
                        num2 = Double.parseDouble(tempVal.getText().toString());

                    double resp = 0;
                        /*switch (opt.getCheckedRadioButtonId()){
                            case R.id.optSuma:
                                resp = num1+num2;
                                break;
                            case R.id.optResta:
                                resp = num1-num2;
                                break;
                            case R.id.optMultiplicacion:
                                resp=num1*num2;
                                break;
                            case R.id.optDivision:
                                resp = num1/num2;
                                break;
                        }*/
                    boolean numentero = true;
                    switch (spn.getSelectedItemPosition()){
                        case 0:
                            resp = num1+num2;
                            break;
                        case 1:
                            resp = num1-num2;
                            break;
                        case 2:
                            resp = num1*num2;
                            break;
                        case 3:
                            resp = num1/num2;
                            break;
                        case 4:
                            resp= Math.pow(num1,num2);
                            break;
                        case 5:
                            resp= Math.pow(num1,1/num2);
                            break;
                        case 6:
                            resp= num1*num2/100;
                            break;
                        case 7:
                            if(num1 % 1==0) {
                                numentero=false;
                                numentero=true;
                                resp = 1;
                                for (int t = 1; t <= num1; t++) {
                                    resp *= t;
                                }
                            }
                    }
                    tempVal = findViewById(R.id.lblrespuesta);
                    if(numentero);
                        else
                            tempVal.setText("el numero a ingresar debe ser un numero entero");
                    tempVal.setText("resultado: " + resp );
                }catch (Exception e){
                    tempVal = findViewById(R.id.lblrespuesta);
                    tempVal.setText("Error: "+ e.getMessage());
                }

            }
        });

    }
}