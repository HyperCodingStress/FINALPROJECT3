package com.example.finalproject3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    Button btn0,btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btnTambah,btnKurang,btnBagi,btnPersen,btnKali,btnHapus,btnTitik,btnHasil;
    TextView text;
    public static double nilaiSekarang  = 0;
    public static String operasiSekarang  = "";
    public static double hasil = 0.0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        btn0 = findViewById(R.id.nol);
        btn1 = findViewById(R.id.satu);
        btn2 = findViewById(R.id.dua);
        btn3 = findViewById(R.id.tiga);
        btn4 = findViewById(R.id.empat);
        btn5 = findViewById(R.id.lima);
        btn6 = findViewById(R.id.enam);
        btn7 = findViewById(R.id.tujuh);
        btn8 = findViewById(R.id.delapan);
        btn9 = findViewById(R.id.sembilan);
        btnTambah = findViewById(R.id.tambah);
        btnBagi = findViewById(R.id.bagi);
        btnPersen = findViewById(R.id.modulus);
        btnKurang = findViewById(R.id.kurang);
        btnTitik = findViewById(R.id.titik);
        btnKali = findViewById(R.id.kali);
        btnHapus = findViewById(R.id.del);
        btnHasil = findViewById(R.id.answer);
        text = findViewById(R.id.angkaMasuk);

        btn0.setOnClickListener(this);
        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
        btn5.setOnClickListener(this);
        btn6.setOnClickListener(this);
        btn7.setOnClickListener(this);
        btn8.setOnClickListener(this);
        btn9.setOnClickListener(this);
        btnTambah.setOnClickListener(this);
        btnBagi.setOnClickListener(this);
        btnPersen.setOnClickListener(this);
        btnKurang.setOnClickListener(this);
        btnTitik.setOnClickListener(this);
        btnKali.setOnClickListener(this);
        btnHapus.setOnClickListener(this);
        btnHasil.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.nol:
                text.setText(text.getText().toString().trim() +"0");
                break;
            case R.id.satu:
                text.setText(text.getText().toString().trim() +"1");
                break;
            case R.id.dua:
                text.setText(text.getText().toString().trim() +"2");
                break;
            case R.id.tiga:
                text.setText(text.getText().toString().trim() +"3");
                break;
            case R.id.empat:
                text.setText(text.getText().toString().trim() +"4");
                break;
            case R.id.lima:
                text.setText(text.getText().toString().trim() +"5");
                break;
            case R.id.enam:
                text.setText(text.getText().toString().trim() +"6");
                break;
            case R.id.tujuh:
                text.setText(text.getText().toString().trim() +"7");
                break;
            case R.id.delapan:
                text.setText(text.getText().toString().trim() +"8");
                break;
            case R.id.sembilan:
                text.setText(text.getText().toString().trim() +"9");
                break;
            case R.id.titik:
                text.setText(text.getText().toString().trim() +".");
                break;
            case R.id.del:
                text.setText("");
                break;
            case R.id.tambah:
                operasiSekarang = "tambah";
                nilaiSekarang = Double.parseDouble(text.getText().toString());
                text.setText("");
                break;
            case R.id.bagi:
                operasiSekarang = "bagi";
                nilaiSekarang = Double.parseDouble(text.getText().toString());
                text.setText("");
                break;
            case R.id.kurang:
                operasiSekarang = "kurang";
                nilaiSekarang = Double.parseDouble(text.getText().toString());
                text.setText("");
                break;
            case R.id.kali:
                operasiSekarang = "kali";
                nilaiSekarang = Double.parseDouble(text.getText().toString());
                text.setText("");
                break;
            case R.id.modulus:
                operasiSekarang = "modulus";
                nilaiSekarang = Double.parseDouble(text.getText().toString());
                text.setText("");
                break;
            case R.id.answer:
                if (text.getText().toString().isEmpty()){
                    Toast.makeText(MainActivity.this, "Isi terlebih dahulu",Toast.LENGTH_LONG);
                }else {
                    if (operasiSekarang.equals("tambah")) {
                        hasil = nilaiSekarang + Double.parseDouble(text.getText().toString().trim());
                    }
                    if (operasiSekarang.equals("kurang")) {
                        hasil = nilaiSekarang - Double.parseDouble(text.getText().toString().trim());
                    }
                    if (operasiSekarang.equals("kali")) {
                        hasil = nilaiSekarang * Double.parseDouble(text.getText().toString().trim());
                    }
                    if (operasiSekarang.equals("modulus")) {
                        hasil = nilaiSekarang % Double.parseDouble(text.getText().toString().trim());
                    }
                    if (operasiSekarang.equals("bagi")) {
                        hasil = nilaiSekarang / Double.parseDouble(text.getText().toString().trim());
                    }
                    int nilaiTemp = (int) hasil;
                    if (nilaiTemp == hasil) {
                        text.setText(String.valueOf(hasil));
                    } else {
                        text.setText(String.valueOf((int) hasil));
                    }
                }

                break;
        }
    }
}