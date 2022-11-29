package com.example.calculadora;

import android.widget.RadioButton;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText numA;
    private EditText numB;
    private TextView sumaNumeros;
    private Button botonSuma, botonResta, botonMult, botonDiv, botonOr, botonAnd, botonXor;
    private RadioButton radio_bN, radio_syM, radio_logica;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Obtenemos una referencia a los controles de la interfaz gráfica
        numA = (EditText)findViewById(R.id.numA);
        numB = (EditText) findViewById(R.id.numB);
        sumaNumeros =(TextView)findViewById(R.id.sumaNumeros);
        botonSuma = (Button) findViewById(R.id.botonSuma);
        botonResta = (Button) findViewById(R.id.botonResta);
        botonMult = (Button) findViewById(R.id.botonMult);
        botonDiv = (Button) findViewById(R.id.botonDiv);
        botonOr = (Button) findViewById(R.id.botonOr);
        botonAnd = (Button) findViewById(R.id.botonAnd);
        botonXor = (Button) findViewById(R.id.botonXor);
        radio_bN = (RadioButton) findViewById(R.id.radio_bN);
        radio_syM = (RadioButton) findViewById(R.id.radio_syM);
        radio_logica = (RadioButton) findViewById(R.id.radio_logica);


        //Implementamos el evento click del botón

            botonSuma.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    //Realizamos la suma
                    if (radio_bN.isChecked()) {
                        String valor1 = numA.getText().toString();
                        String valor2 = numB.getText().toString();
                        if (valor1.equals("") == false && valor2.equals("") == false) {
                            int numero1 = Integer.parseInt(valor1, 2);
                            int numero2 = Integer.parseInt(valor2, 2);
                            int suma = numero1 + numero2;
                            String resultado = Integer.toBinaryString(suma);
                            if (resultado.length() <= 8) {
                                while (resultado.length() < 8) resultado = 0 + resultado;
                                sumaNumeros.setText(resultado);
                            } else if (resultado.length() > 8){
                                Toast toast= Toast.makeText(getApplicationContext(),"Rango de bits superado",Toast.LENGTH_LONG);
                                toast.show();
                            }


                        } else {
                            Toast toast= Toast.makeText(getApplicationContext(),"Introduce un dato",Toast.LENGTH_LONG);
                            toast.show();
                        }
                    }
                    else if (radio_syM.isChecked()) {
                        String valor1 = numA.getText().toString();
                        String valor2 = numB.getText().toString();
                        if (valor1.equals("") == false && valor2.equals("") == false) {
                            while(valor1.length()<8) valor1=0+valor1;
                            while(valor2.length()<8) valor2=0+valor2;
                            if (valor1.charAt(0) == '1' && valor2.charAt(0) == '1') {
                                //bucle mientras sea menor al tamaño del string si es distinto de la pos 0 contador++
                                String cambio = "";
                                int cont = 0;
                                while (cont < 8) {
                                    if (cont != 0) {
                                        cambio = cambio + valor1.charAt(cont);
                                    }
                                    cont++;
                                }
                                int numero1 = Integer.parseInt(cambio, 2);
                                numero1 = numero1 * -1;

                                String cambio2 = "";
                                int cont2 = 0;
                                while (cont2 < 8) {
                                    if (cont2 != 0) {
                                        cambio2 = cambio2 + valor2.charAt(cont2);
                                    }
                                    cont2++;
                                }
                                int numero2 = Integer.parseInt(cambio2, 2);
                                numero2 = numero2 * -1;

                                int suma = numero1 + numero2;

                                String resultado = Integer.toBinaryString(suma);

                                if (resultado.length()>7){
                                    Toast toast= Toast.makeText(getApplicationContext(),"Rango de bits superado",Toast.LENGTH_LONG);
                                    toast.show();
                                }
                                else {
                                    if(resultado.length() <= 7) {
                                        while (resultado.length() < 7) {
                                            resultado = 0 + resultado;
                                        }
                                        if (suma >= 0) {
                                            resultado = 0 + resultado;
                                            sumaNumeros.setText(resultado);
                                        } else {
                                            resultado = 1 + resultado;
                                            sumaNumeros.setText(resultado);
                                        }
                                    }
                                }

                            }


                        if (valor1.charAt(0) == '0' && valor2.charAt(0) == '0') {
                            //bucle mientras sea menor al tamaño del string si es distinto de la pos 0 contador++
                            String cambio = "";
                            int cont = 0;
                            while (cont < 8) {
                                if (cont != 0) {
                                    cambio = cambio + valor1.charAt(cont);
                                }
                                cont++;
                            }
                            int numero1 = Integer.parseInt(cambio, 2);


                            String cambio2 = "";
                            int cont2 = 0;
                            while (cont2 < 8) {
                                if (cont2 != 0) {
                                    cambio2 = cambio2 + valor2.charAt(cont2);
                                }
                                cont2++;
                            }
                            int numero2 = Integer.parseInt(cambio2, 2);


                            int suma = numero1 + numero2;

                            String resultado = Integer.toBinaryString(suma);

                            if (resultado.length()>7){
                                    Toast toast= Toast.makeText(getApplicationContext(),"Rango de bits superado",Toast.LENGTH_LONG);
                                    toast.show();
                            }
                            else {
                                if(resultado.length() <= 7) {
                                    while (resultado.length() < 7) {
                                        resultado = 0 + resultado;
                                    }
                                    if (suma >= 0) {
                                        resultado = 0 + resultado;
                                        sumaNumeros.setText(resultado);
                                    } else {
                                        resultado = 1 + resultado;
                                        sumaNumeros.setText(resultado);
                                    }
                                }
                            }

                        }

                        if (valor1.charAt(0) == '1' && valor2.charAt(0) == '0') {
                            //bucle mientras sea menor al tamaño del string si es distinto de la pos 0 contador++
                            String cambio = "";
                            int cont = 0;
                            while (cont < 8) {
                                if (cont != 0) {
                                    cambio = cambio + valor1.charAt(cont);
                                }
                                cont++;
                            }
                            int numero1 = Integer.parseInt(cambio, 2);
                            numero1 = numero1 * -1;

                            String cambio2 = "";
                            int cont2 = 0;
                            while (cont2 < 8) {
                                if (cont2 != 0) {
                                    cambio2 = cambio2 + valor2.charAt(cont2);
                                }
                                cont2++;
                            }
                            int numero2 = Integer.parseInt(cambio2, 2);


                            int suma = numero1 + numero2;

                            String resultado = Integer.toBinaryString(suma);

                            if (resultado.length()>7){
                                Toast toast= Toast.makeText(getApplicationContext(),"Rango de bits superado",Toast.LENGTH_LONG);
                                toast.show();
                            }
                            else {
                                if(resultado.length() <= 7) {
                                    while (resultado.length() < 7) {
                                        resultado = 0 + resultado;
                                    }
                                    if (suma >= 0) {
                                        resultado = 0 + resultado;
                                        sumaNumeros.setText(resultado);
                                    } else {
                                        resultado = 1 + resultado;
                                        sumaNumeros.setText(resultado);
                                    }
                                }
                            }



                        }

                        if (valor1.charAt(0) == '0' && valor2.charAt(0) == '1') {
                            //bucle mientras sea menor al tamaño del string si es distinto de la pos 0 contador++
                            String cambio = "";
                            int cont = 0;
                            while (cont < 8) {
                                if (cont != 0) {
                                    cambio = cambio + valor1.charAt(cont);
                                }
                                cont++;
                            }
                            int numero1 = Integer.parseInt(cambio, 2);


                            String cambio2 = "";
                            int cont2 = 0;
                            while (cont2 < 8) {
                                if (cont2 != 0) {
                                    cambio2 = cambio2 + valor2.charAt(cont2);
                                }
                                cont2++;
                            }
                            int numero2 = Integer.parseInt(cambio2, 2);
                            numero2 = numero2 * -1;

                            int suma = numero1 + numero2;

                            String resultado = Integer.toBinaryString(suma);

                            if (resultado.length()>7){
                                Toast toast= Toast.makeText(getApplicationContext(),"Rango de bits superado",Toast.LENGTH_LONG);
                                toast.show();
                            }
                            else {
                                if(resultado.length() <= 7) {
                                    while (resultado.length() < 7) {
                                        resultado = 0 + resultado;
                                    }
                                    if (suma >= 0) {
                                        resultado = 0 + resultado;
                                        sumaNumeros.setText(resultado);
                                    } else {
                                        resultado = 1 + resultado;
                                        sumaNumeros.setText(resultado);
                                    }
                                }
                            }

                        }


                    }else {
                            Toast toast= Toast.makeText(getApplicationContext(),"Introduce un dato",Toast.LENGTH_LONG);
                            toast.show();
                        }
                }

                }
            });
            botonResta.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    //Realizamos la suma
                    if (radio_bN.isChecked()) {
                        String valor1 = numA.getText().toString();
                        String valor2 = numB.getText().toString();
                        if (valor1.equals("") == false && valor2.equals("") == false) {
                            int numero1 = Integer.parseInt(valor1, 2);
                            int numero2 = Integer.parseInt(valor2, 2);
                            int resta = numero1 - numero2;


                            if (resta >= 0) {
                                String resultado = Integer.toBinaryString(resta);
                                if (resultado.length() <= 8) {
                                    while (resultado.length() < 8) resultado = 0 + resultado;
                                    sumaNumeros.setText(resultado);
                                } else if (resultado.length() > 8) {
                                    Toast toast = Toast.makeText(getApplicationContext(), "Rango de bits superado", Toast.LENGTH_LONG);
                                    toast.show();
                                }


                            }
                                else {
                                    Toast toast= Toast.makeText(getApplicationContext(),"Resultado no valido",Toast.LENGTH_LONG);
                                    toast.show();
                                }

                        } else {
                            Toast toast= Toast.makeText(getApplicationContext(),"Introduce un dato",Toast.LENGTH_LONG);
                            toast.show();
                        }

                    }
                    else if(radio_syM.isChecked()){
                        String valor1 = numA.getText().toString();
                        String valor2 = numB.getText().toString();
                        if (valor1.equals("") == false && valor2.equals("") == false) {
                            while(valor1.length()<8) valor1=0+valor1;
                            while(valor2.length()<8) valor2=0+valor2;
                            if (valor1.charAt(0) == '1' && valor2.charAt(0) == '1') {
                                //bucle mientras sea menor al tamaño del string si es distinto de la pos 0 contador++
                                String cambio = "";
                                int cont = 0;
                                while (cont < 8) {
                                    if (cont != 0) {
                                        cambio = cambio + valor1.charAt(cont);
                                    }
                                    cont++;
                                }
                                int numero1 = Integer.parseInt(cambio, 2);
                                numero1 = numero1 * -1;

                                String cambio2 = "";
                                int cont2 = 0;
                                while (cont2 < 8) {
                                    if (cont2 != 0) {
                                        cambio2 = cambio2 + valor2.charAt(cont2);
                                    }
                                    cont2++;
                                }
                                int numero2 = Integer.parseInt(cambio2, 2);
                                numero2 = numero2 * -1;

                                int resta = numero1 - numero2;

                                if (resta>127 || resta<-127){
                                    Toast toast= Toast.makeText(getApplicationContext(),"Rango de bits superado",Toast.LENGTH_LONG);
                                    toast.show();
                                }
                                if(resta<0){
                                    resta=resta*-1;
                                    String resultado = Integer.toBinaryString(resta);
                                    if(resultado.length()<=7) {
                                        while (resultado.length() < 7) {
                                            resultado = 0 + resultado;
                                        }
                                        resultado = 1 + resultado;
                                        sumaNumeros.setText(resultado);
                                    }
                                }
                                else {
                                    String resultado = Integer.toBinaryString(resta);
                                    if(resultado.length() <= 7) {
                                        while (resultado.length() < 7) {
                                            resultado = 0 + resultado;
                                        }
                                        resultado = 0 + resultado;
                                        sumaNumeros.setText(resultado);

                                    }
                                }

                            }


                            if (valor1.charAt(0) == '0' && valor2.charAt(0) == '0') {
                                //bucle mientras sea menor al tamaño del string si es distinto de la pos 0 contador++
                                String cambio = "";
                                int cont = 0;
                                while (cont < 8) {
                                    if (cont != 0) {
                                        cambio = cambio + valor1.charAt(cont);
                                    }
                                    cont++;
                                }
                                int numero1 = Integer.parseInt(cambio, 2);


                                String cambio2 = "";
                                int cont2 = 0;
                                while (cont2 < 8) {
                                    if (cont2 != 0) {
                                        cambio2 = cambio2 + valor2.charAt(cont2);
                                    }
                                    cont2++;
                                }
                                int numero2 = Integer.parseInt(cambio2, 2);


                                int resta = numero1 - numero2;



                                if (resta>127 || resta<-127){
                                    Toast toast= Toast.makeText(getApplicationContext(),"Rango de bits superado",Toast.LENGTH_LONG);
                                    toast.show();
                                }
                                if(resta<0){
                                    resta=resta*-1;
                                    String resultado = Integer.toBinaryString(resta);
                                    if(resultado.length()<=7) {
                                        while (resultado.length() < 7) {
                                            resultado = 0 + resultado;
                                        }
                                        resultado = 1 + resultado;
                                        sumaNumeros.setText(resultado);
                                    }
                                }
                                else {
                                    String resultado = Integer.toBinaryString(resta);
                                    if(resultado.length() <= 7) {
                                        while (resultado.length() < 7) {
                                            resultado = 0 + resultado;
                                        }
                                        resultado = 0 + resultado;
                                        sumaNumeros.setText(resultado);

                                    }
                                }

                            }

                            if (valor1.charAt(0) == '1' && valor2.charAt(0) == '0') {
                                //bucle mientras sea menor al tamaño del string si es distinto de la pos 0 contador++
                                String cambio = "";
                                int cont = 0;
                                while (cont < 8) {
                                    if (cont != 0) {
                                        cambio = cambio + valor1.charAt(cont);
                                    }
                                    cont++;
                                }
                                int numero1 = Integer.parseInt(cambio, 2);
                                numero1 = numero1 * -1;

                                String cambio2 = "";
                                int cont2 = 0;
                                while (cont2 < 8) {
                                    if (cont2 != 0) {
                                        cambio2 = cambio2 + valor2.charAt(cont2);
                                    }
                                    cont2++;
                                }
                                int numero2 = Integer.parseInt(cambio2, 2);


                                int resta = numero1 - numero2;

                                if (resta>127 || resta<-127){
                                    Toast toast= Toast.makeText(getApplicationContext(),"Rango de bits superado",Toast.LENGTH_LONG);
                                    toast.show();
                                }
                                if(resta<0){
                                    resta=resta*-1;
                                    String resultado = Integer.toBinaryString(resta);
                                    if(resultado.length()<=7) {
                                        while (resultado.length() < 7) {
                                            resultado = 0 + resultado;
                                        }
                                        resultado = 1 + resultado;
                                        sumaNumeros.setText(resultado);
                                    }
                                }
                                else {
                                    String resultado = Integer.toBinaryString(resta);
                                    if(resultado.length() <= 7) {
                                        while (resultado.length() < 7) {
                                            resultado = 0 + resultado;
                                        }
                                        resultado = 0 + resultado;
                                        sumaNumeros.setText(resultado);

                                    }
                                }

                            }

                            if (valor1.charAt(0) == '0' && valor2.charAt(0) == '1') {
                                //bucle mientras sea menor al tamaño del string si es distinto de la pos 0 contador++
                                String cambio = "";
                                int cont = 0;
                                while (cont < 8) {
                                    if (cont != 0) {
                                        cambio = cambio + valor1.charAt(cont);
                                    }
                                    cont++;
                                }
                                int numero1 = Integer.parseInt(cambio, 2);


                                String cambio2 = "";
                                int cont2 = 0;
                                while (cont2 < 8) {
                                    if (cont2 != 0) {
                                        cambio2 = cambio2 + valor2.charAt(cont2);
                                    }
                                    cont2++;
                                }
                                int numero2 = Integer.parseInt(cambio2, 2);
                                numero2 = numero2 * -1;

                                int resta = numero1 - numero2;

                                if (resta>127 || resta<-127){
                                    Toast toast= Toast.makeText(getApplicationContext(),"Rango de bits superado",Toast.LENGTH_LONG);
                                    toast.show();
                                }
                                if(resta<0){
                                    resta=resta*-1;
                                    String resultado = Integer.toBinaryString(resta);
                                    if(resultado.length()<=7) {
                                        while (resultado.length() < 7) {
                                            resultado = 0 + resultado;
                                        }
                                        resultado = 1 + resultado;
                                        sumaNumeros.setText(resultado);
                                    }
                                }
                                else {
                                    String resultado = Integer.toBinaryString(resta);
                                    if(resultado.length() <= 7) {
                                        while (resultado.length() < 7) {
                                            resultado = 0 + resultado;
                                        }
                                        resultado = 0 + resultado;
                                        sumaNumeros.setText(resultado);

                                    }
                                }

                            }


                        }else {
                            Toast toast= Toast.makeText(getApplicationContext(),"Introduce un dato",Toast.LENGTH_LONG);
                            toast.show();
                        }
                    }
                }

            });


            botonMult.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    //Realizamos la suma
                    if (radio_bN.isChecked()) {
                        String valor1 = numA.getText().toString();
                        String valor2 = numB.getText().toString();
                        if (valor1.equals("") == false && valor2.equals("") == false) {
                            int numero1 = Integer.parseInt(valor1, 2);
                            int numero2 = Integer.parseInt(valor2, 2);
                            int mult = numero1 * numero2;
                            String resultado = Integer.toBinaryString(mult);
                            if (resultado.length() <= 8) {
                                while (resultado.length() < 8) resultado = 0 + resultado;
                                sumaNumeros.setText(resultado);
                            } else if (resultado.length() > 8) {
                                Toast toast = Toast.makeText(getApplicationContext(), "Rango de bits superado", Toast.LENGTH_LONG);
                                toast.show();
                            }

                        } else {
                            Toast toast= Toast.makeText(getApplicationContext(),"Introduce un dato",Toast.LENGTH_LONG);
                            toast.show();
                        }
                    }
                    else if(radio_syM.isChecked()){
                        String valor1 = numA.getText().toString();
                        String valor2 = numB.getText().toString();
                        if (valor1.equals("") == false && valor2.equals("") == false) {
                            while(valor1.length()<8) valor1=0+valor1;
                            while(valor2.length()<8) valor2=0+valor2;
                            if (valor1.charAt(0) == '1' && valor2.charAt(0) == '1') {
                                //bucle mientras sea menor al tamaño del string si es distinto de la pos 0 contador++
                                String cambio = "";
                                int cont = 0;
                                while (cont < 8) {
                                    if (cont != 0) {
                                        cambio = cambio + valor1.charAt(cont);
                                    }
                                    cont++;
                                }
                                int numero1 = Integer.parseInt(cambio, 2);
                                numero1=numero1*-1;


                                String cambio2 = "";
                                int cont2 = 0;
                                while (cont2 < 8) {
                                    if (cont2 != 0) {
                                        cambio2 = cambio2 + valor2.charAt(cont2);
                                    }
                                    cont2++;
                                }
                                int numero2 = Integer.parseInt(cambio2, 2);
                                numero2 = numero2 * -1;

                                int mult = numero1 * numero2;

                                String resultado = Integer.toBinaryString(mult);

                                if (resultado.length()>7){
                                    Toast toast= Toast.makeText(getApplicationContext(),"Rango de bits superado",Toast.LENGTH_LONG);
                                    toast.show();
                                }
                                else {
                                    if(resultado.length() <= 7) {
                                        while (resultado.length() < 7) {
                                            resultado = 0 + resultado;
                                        }
                                        if (mult >= 0) {
                                            resultado = 0 + resultado;
                                            sumaNumeros.setText(resultado);
                                        } else {
                                            resultado = 1 + resultado;
                                            sumaNumeros.setText(resultado);
                                        }
                                    }
                                }

                            }


                            if (valor1.charAt(0) == '0' && valor2.charAt(0) == '0') {
                                //bucle mientras sea menor al tamaño del string si es distinto de la pos 0 contador++
                                String cambio = "";
                                int cont = 0;
                                while (cont < 8) {
                                    if (cont != 0) {
                                        cambio = cambio + valor1.charAt(cont);
                                    }
                                    cont++;
                                }
                                int numero1 = Integer.parseInt(cambio, 2);


                                String cambio2 = "";
                                int cont2 = 0;
                                while (cont2 < 8) {
                                    if (cont2 != 0) {
                                        cambio2 = cambio2 + valor2.charAt(cont2);
                                    }
                                    cont2++;
                                }
                                int numero2 = Integer.parseInt(cambio2, 2);

                                int mult = numero1 * numero2;

                                String resultado = Integer.toBinaryString(mult);

                                if (resultado.length()>7){
                                    Toast toast= Toast.makeText(getApplicationContext(),"Rango de bits superado",Toast.LENGTH_LONG);
                                    toast.show();
                                }
                                else {
                                    if(resultado.length() <= 7) {
                                        while (resultado.length() < 7) {
                                            resultado = 0 + resultado;
                                        }
                                        if (mult >= 0) {
                                            resultado = 0 + resultado;
                                            sumaNumeros.setText(resultado);
                                        } else {
                                            resultado = 1 + resultado;
                                            sumaNumeros.setText(resultado);
                                        }
                                    }
                                }

                            }

                            if (valor1.charAt(0) == '1' && valor2.charAt(0) == '0') {
                                //bucle mientras sea menor al tamaño del string si es distinto de la pos 0 contador++
                                String cambio = "";
                                int cont = 0;
                                while (cont < 8) {
                                    if (cont != 0) {
                                        cambio = cambio + valor1.charAt(cont);
                                    }
                                    cont++;
                                }
                                int numero1 = Integer.parseInt(cambio, 2);
                                numero1 = numero1 * -1;

                                String cambio2 = "";
                                int cont2 = 0;
                                while (cont2 < 8) {
                                    if (cont2 != 0) {
                                        cambio2 = cambio2 + valor2.charAt(cont2);
                                    }
                                    cont2++;
                                }
                                int numero2 = Integer.parseInt(cambio2, 2);


                                int mult = numero1 * numero2;

                                String resultado = Integer.toBinaryString(mult);

                                if (resultado.length()>7){
                                    Toast toast= Toast.makeText(getApplicationContext(),"Rango de bits superado",Toast.LENGTH_LONG);
                                    toast.show();
                                }
                                else {
                                    if(resultado.length() <= 7) {
                                        while (resultado.length() < 7) {
                                            resultado = 0 + resultado;
                                        }
                                        if (mult >= 0) {
                                            resultado = 0 + resultado;
                                            sumaNumeros.setText(resultado);
                                        } else {
                                            resultado = 1 + resultado;
                                            sumaNumeros.setText(resultado);
                                        }
                                    }
                                }

                            }

                            if (valor1.charAt(0) == '0' && valor2.charAt(0) == '1') {
                                //bucle mientras sea menor al tamaño del string si es distinto de la pos 0 contador++
                                String cambio = "";
                                int cont = 0;
                                while (cont < 8) {
                                    if (cont != 0) {
                                        cambio = cambio + valor1.charAt(cont);
                                    }
                                    cont++;
                                }
                                int numero1 = Integer.parseInt(cambio, 2);

                                String cambio2 = "";
                                int cont2 = 0;
                                while (cont2 < 8) {
                                    if (cont2 != 0) {
                                        cambio2 = cambio2 + valor2.charAt(cont2);
                                    }
                                    cont2++;
                                }
                                int numero2 = Integer.parseInt(cambio2, 2);
                                numero2=numero2*-1;

                                int mult = numero1 * numero2;

                                String resultado = Integer.toBinaryString(mult);

                                if (resultado.length()>7){
                                    Toast toast= Toast.makeText(getApplicationContext(),"Rango de bits superado",Toast.LENGTH_LONG);
                                    toast.show();
                                }
                                else {
                                    if(resultado.length() <= 7) {
                                        while (resultado.length() < 7) {
                                            resultado = 0 + resultado;
                                        }
                                        if (mult >= 0) {
                                            resultado = 0 + resultado;
                                            sumaNumeros.setText(resultado);
                                        } else {
                                            resultado = 1 + resultado;
                                            sumaNumeros.setText(resultado);
                                        }
                                    }
                                }

                            }


                        }else {
                            Toast toast= Toast.makeText(getApplicationContext(),"Introduce un dato",Toast.LENGTH_LONG);
                            toast.show();
                        }
                    }
                }

            });
            botonDiv.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    //Realizamos la suma
                    if (radio_bN.isChecked()) {
                        String valor1 = numA.getText().toString();
                        String valor2 = numB.getText().toString();
                        if (valor1.equals("") == false && valor2.equals("") == false && valor2.equals("0") == false) {
                            int numero1 = Integer.parseInt(valor1, 2);
                            int numero2 = Integer.parseInt(valor2, 2);
                            int div = numero1 / numero2;
                            String resultado = Integer.toBinaryString(div);
                            if (resultado.length() <= 8) {
                                while (resultado.length() < 8) resultado = 0 + resultado;
                                sumaNumeros.setText(resultado);
                            } else if (resultado.length() > 8) {
                                Toast toast = Toast.makeText(getApplicationContext(), "Rango de bits superado", Toast.LENGTH_LONG);
                                toast.show();
                            }


                        } else if (valor2.equals("0")) {
                            Toast toast = Toast.makeText(getApplicationContext(), "Operacion no valida", Toast.LENGTH_LONG);
                            toast.show();
                        } else {
                            Toast toast = Toast.makeText(getApplicationContext(), "Introduce un dato", Toast.LENGTH_LONG);
                            toast.show();
                        }

                    } else if (radio_syM.isChecked()) {
                        String valor1 = numA.getText().toString();
                        String valor2 = numB.getText().toString();
                        if (valor1.equals("") == false && valor2.equals("") == false && valor2.equals("0") == false) {
                            while (valor1.length() < 8) valor1 = 0 + valor1;
                            while (valor2.length() < 8) valor2 = 0 + valor2;
                            if (valor1.charAt(0) == '1' && valor2.charAt(0) == '1') {
                                //bucle mientras sea menor al tamaño del string si es distinto de la pos 0 contador++
                                String cambio = "";
                                int cont = 0;
                                while (cont < 8) {
                                    if (cont != 0) {
                                        cambio = cambio + valor1.charAt(cont);
                                    }
                                    cont++;
                                }
                                int numero1 = Integer.parseInt(cambio, 2);
                                numero1 = numero1 * -1;

                                String cambio2 = "";
                                int cont2 = 0;
                                while (cont2 < 8) {
                                    if (cont2 != 0) {
                                        cambio2 = cambio2 + valor2.charAt(cont2);
                                    }
                                    cont2++;
                                }
                                int numero2 = Integer.parseInt(cambio2, 2);
                                numero2 = numero2 * -1;

                                int div = numero1 / numero2;

                                String resultado = Integer.toBinaryString(div);

                                if (resultado.length() > 7) {
                                    Toast toast = Toast.makeText(getApplicationContext(), "Rango de bits superado", Toast.LENGTH_LONG);
                                    toast.show();
                                } else {
                                    if (resultado.length() <= 7) {
                                        while (resultado.length() < 7) {
                                            resultado = 0 + resultado;
                                        }
                                        if (div >= 0) {
                                            resultado = 0 + resultado;
                                            sumaNumeros.setText(resultado);
                                        } else {
                                            resultado = 1 + resultado;
                                            sumaNumeros.setText(resultado);
                                        }
                                    }
                                }

                            }


                            if (valor1.charAt(0) == '0' && valor2.charAt(0) == '0') {
                                //bucle mientras sea menor al tamaño del string si es distinto de la pos 0 contador++
                                String cambio = "";
                                int cont = 0;
                                while (cont < 8) {
                                    if (cont != 0) {
                                        cambio = cambio + valor1.charAt(cont);
                                    }
                                    cont++;
                                }
                                int numero1 = Integer.parseInt(cambio, 2);


                                String cambio2 = "";
                                int cont2 = 0;
                                while (cont2 < 8) {
                                    if (cont2 != 0) {
                                        cambio2 = cambio2 + valor2.charAt(cont2);
                                    }
                                    cont2++;
                                }
                                int numero2 = Integer.parseInt(cambio2, 2);


                                int div = numero1 / numero2;

                                String resultado = Integer.toBinaryString(div);

                                if (resultado.length() > 7) {
                                    Toast toast = Toast.makeText(getApplicationContext(), "Rango de bits superado", Toast.LENGTH_LONG);
                                    toast.show();
                                } else {
                                    if (resultado.length() <= 7) {
                                        while (resultado.length() < 7) {
                                            resultado = 0 + resultado;
                                        }
                                        if (div >= 0) {
                                            resultado = 0 + resultado;
                                            sumaNumeros.setText(resultado);
                                        } else {
                                            resultado = 1 + resultado;
                                            sumaNumeros.setText(resultado);
                                        }
                                    }
                                }

                            }

                            if (valor1.charAt(0) == '1' && valor2.charAt(0) == '0') {
                                //bucle mientras sea menor al tamaño del string si es distinto de la pos 0 contador++
                                String cambio = "";
                                int cont = 0;
                                while (cont < 8) {
                                    if (cont != 0) {
                                        cambio = cambio + valor1.charAt(cont);
                                    }
                                    cont++;
                                }
                                int numero1 = Integer.parseInt(cambio, 2);
                                numero1 = numero1 * -1;

                                String cambio2 = "";
                                int cont2 = 0;
                                while (cont2 < 8) {
                                    if (cont2 != 0) {
                                        cambio2 = cambio2 + valor2.charAt(cont2);
                                    }
                                    cont2++;
                                }
                                int numero2 = Integer.parseInt(cambio2, 2);


                                int div = numero1 / numero2;

                                String resultado = Integer.toBinaryString(div);

                                if (resultado.length() > 7) {
                                    Toast toast = Toast.makeText(getApplicationContext(), "Rango de bits superado", Toast.LENGTH_LONG);
                                    toast.show();
                                } else {
                                    if (resultado.length() <= 7) {
                                        while (resultado.length() < 7) {
                                            resultado = 0 + resultado;
                                        }
                                        if (div >= 0) {
                                            resultado = 0 + resultado;
                                            sumaNumeros.setText(resultado);
                                        } else {
                                            resultado = 1 + resultado;
                                            sumaNumeros.setText(resultado);
                                        }
                                    }
                                }


                            }

                            if (valor1.charAt(0) == '0' && valor2.charAt(0) == '1') {
                                //bucle mientras sea menor al tamaño del string si es distinto de la pos 0 contador++
                                String cambio = "";
                                int cont = 0;
                                while (cont < 8) {
                                    if (cont != 0) {
                                        cambio = cambio + valor1.charAt(cont);
                                    }
                                    cont++;
                                }
                                int numero1 = Integer.parseInt(cambio, 2);


                                String cambio2 = "";
                                int cont2 = 0;
                                while (cont2 < 8) {
                                    if (cont2 != 0) {
                                        cambio2 = cambio2 + valor2.charAt(cont2);
                                    }
                                    cont2++;
                                }
                                int numero2 = Integer.parseInt(cambio2, 2);
                                numero2 = numero2 * -1;

                                int div = numero1 / numero2;

                                String resultado = Integer.toBinaryString(div);

                                if (resultado.length() > 7) {
                                    Toast toast = Toast.makeText(getApplicationContext(), "Rango de bits superado", Toast.LENGTH_LONG);
                                    toast.show();
                                } else {
                                    if (resultado.length() <= 7) {
                                        while (resultado.length() < 7) {
                                            resultado = 0 + resultado;
                                        }
                                        if (div >= 0) {
                                            resultado = 0 + resultado;
                                            sumaNumeros.setText(resultado);
                                        } else {
                                            resultado = 1 + resultado;
                                            sumaNumeros.setText(resultado);
                                        }
                                    }
                                }

                            }
                        } else {
                            Toast toast = Toast.makeText(getApplicationContext(), "Introduce un dato", Toast.LENGTH_LONG);
                            toast.show();
                        }
                    }
                }

            });


                botonOr.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if(radio_logica.isChecked()){
                            String valor1 = numA.getText().toString();
                            String valor2 = numB.getText().toString();
                            if (valor1.equals("") == false && valor2.equals("") == false) {
                                while (valor1.length() <= 8) valor1 = 0 + valor1;
                                while (valor2.length() <= 8) valor2 = 0 + valor2;
                                String resultado = "";
                                for (int i = 0; i < 9; i++) {
                                    if (valor1.charAt(i) == '0' && valor2.charAt(i) == '0')
                                        resultado =resultado+0;
                                    else if (valor1.charAt(i) == '1' && valor2.charAt(i) == '1')
                                        resultado =resultado+1;
                                    else resultado =resultado+1;
                                }
                                sumaNumeros.setText(resultado);
                            } else {
                                Toast toast = Toast.makeText(getApplicationContext(), "Introduce un dato", Toast.LENGTH_LONG);
                                toast.show();
                            }

                        }
                    }
                });

        botonAnd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(radio_logica.isChecked()){
                    String valor1 = numA.getText().toString();
                    String valor2 = numB.getText().toString();
                    if (valor1.equals("") == false && valor2.equals("") == false) {
                        while (valor1.length() <= 8) valor1 = 0 + valor1;
                        while (valor2.length() <= 8) valor2 = 0 + valor2;
                        String resultado = "";
                        for (int i = 0; i < 9; i++) {
                            if (valor1.charAt(i) == '0' && valor2.charAt(i) == '0')
                                resultado =resultado+0;
                            else if (valor1.charAt(i) == '1' && valor2.charAt(i) == '1')
                                resultado =resultado+1;
                            else resultado =resultado+0;
                        }
                        sumaNumeros.setText(resultado);
                    } else {
                        Toast toast = Toast.makeText(getApplicationContext(), "Introduce un dato", Toast.LENGTH_LONG);
                        toast.show();
                    }

                }
            }
        });

        botonXor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(radio_logica.isChecked()){
                    String valor1 = numA.getText().toString();
                    String valor2 = numB.getText().toString();
                    if (valor1.equals("") == false && valor2.equals("") == false) {
                        while (valor1.length() <= 8) valor1 = 0 + valor1;
                        while (valor2.length() <= 8) valor2 = 0 + valor2;
                        String resultado = "";
                        for (int i = 0; i < 9; i++) {
                            if (valor1.charAt(i)!=valor2.charAt(i)) resultado=resultado+1;
                            else resultado=resultado+0;
                        }
                        sumaNumeros.setText(resultado);
                    } else {
                        Toast toast = Toast.makeText(getApplicationContext(), "Introduce un dato", Toast.LENGTH_LONG);
                        toast.show();
                    }

                }
            }
        });


    }
}

