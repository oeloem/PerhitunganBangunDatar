package com.example.oeloem.perhitunganbangundatar;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainPersegi extends AppCompatActivity {
    EditText p, l;
    Button cek;
    TextView hasil;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_persegi);


        p = (EditText)findViewById(R.id.panjang);
        l = (EditText)findViewById(R.id.lebar);
        cek = (Button) findViewById(R.id.button);
        hasil = (TextView)findViewById(R.id.txt_hasil);
        cek.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v){

                if(p.length()==0 && l.length()==0){
                    Toast.makeText(getApplication(),"Panjang dan Lebar tidak boleh Kosong",Toast.LENGTH_LONG).show();
                }

                else if (p.length()==0){
                    Toast.makeText(getApplication(),"Panjang tidak boleh kososng", Toast.LENGTH_LONG).show();
                }

                else if (l.length()==0){
                    Toast.makeText(getApplication(),"Lebar tidak boleh kosong",Toast.LENGTH_LONG).show();
                }
                else{

                    String isipanjang = p.getText().toString();
                    String isilebar = l.getText().toString();
                    double p = Double.parseDouble(isipanjang);
                    double l = Double.parseDouble(isilebar);
                    double hs = PersegiPanjang(p,l);
                    String output = String.valueOf(hs);
                    hasil.setText(output.toString());
                }
            }
        });
    }
    public double PersegiPanjang(double p, double l) {return p*l;}
}

