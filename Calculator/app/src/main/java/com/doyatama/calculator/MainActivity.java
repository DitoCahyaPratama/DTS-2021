package com.doyatama.calculator;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    EditText enterAngka;
    Button buttonTambah, buttonKurang, buttonBagi, buttonKali, buttonSama;
    Button buttonClear;
    Button button1, button2, button3,button4,button5,button6,button7,button8,button9,button0;
    public static double nilai = 0;
    public static String operasi = "";
    public static double hasil=0.0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        operasihitung();
    }

    void operasihitung(){
        enterAngka = findViewById(R.id.editText2);
        button0 = findViewById(R.id.button0);
        button0.setOnClickListener(this);
        button1 = findViewById(R.id.button1);
        button1.setOnClickListener(this);
        button2 = findViewById(R.id.button2);
        button2.setOnClickListener(this);
        button3 = findViewById(R.id.button3);
        button3.setOnClickListener(this);
        button4 = findViewById(R.id.button4);
        button4.setOnClickListener(this);
        button5 = findViewById(R.id.button5);
        button5.setOnClickListener(this);
        button6 = findViewById(R.id.button6);
        button6.setOnClickListener(this);
        button7 = findViewById(R.id.button7);
        button7.setOnClickListener(this);
        button8 = findViewById(R.id.button8);
        button8.setOnClickListener(this);
        button9 = findViewById(R.id.button9);
        button9.setOnClickListener(this);

        buttonTambah = findViewById(R.id.buttonTambah);
        buttonTambah.setOnClickListener(this);
        buttonKali= findViewById(R.id.buttonKali);
        buttonKali.setOnClickListener(this);
        buttonKurang = findViewById(R.id.buttonKurang);
        buttonKurang.setOnClickListener(this);
        buttonBagi= findViewById(R.id.buttonBagi);
        buttonBagi.setOnClickListener(this);
        buttonSama= findViewById(R.id.buttonSama);
        buttonSama.setOnClickListener(this);
        buttonClear= findViewById(R.id.buttonC);
        buttonClear.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button0:
                enterAngka.setText(enterAngka.getText().toString().trim() + "0");
                break;

            case R.id.button1:
                enterAngka.setText(enterAngka.getText().toString().trim() + "1");
                break;

            case R.id.button2:
                enterAngka.setText(enterAngka.getText().toString().trim() + "2");
                break;

            case R.id.button3:
                enterAngka.setText(enterAngka.getText().toString().trim() + "3");
                break;

            case R.id.button4:
                enterAngka.setText(enterAngka.getText().toString().trim() + "4");
                break;

            case R.id.button5:
                enterAngka.setText(enterAngka.getText().toString().trim() + "5");
                break;

            case R.id.button6:
                enterAngka.setText(enterAngka.getText().toString().trim() + "6");
                break;

            case R.id.button7:
                enterAngka.setText(enterAngka.getText().toString().trim() + "7");
                break;

            case R.id.button8:
                enterAngka.setText(enterAngka.getText().toString().trim() + "8");
                break;

            case R.id.button9:
                enterAngka.setText(enterAngka.getText().toString().trim() + "9");
                break;

            case R.id.buttonTambah:
                if (enterAngka.getText().toString().isEmpty())
                {
                    Toast.makeText(this, "Masukkan angka", Toast.LENGTH_SHORT).show();
                }else {
                    nilai = Double.parseDouble(enterAngka.getText().toString().trim());
                    operasi = "tambah";
                    enterAngka.setText("");
                }
                break;

            case R.id.buttonKurang:
                if (enterAngka.getText().toString().isEmpty())
                {
                    Toast.makeText(this, "Masukkan angka", Toast.LENGTH_SHORT).show();
                }else {
                    nilai = Double.parseDouble(enterAngka.getText().toString().trim());
                    operasi = "kurang";
                    enterAngka.setText("");
                }
                break;

            case R.id.buttonBagi:
                if (enterAngka.getText().toString().isEmpty())
                {
                    Toast.makeText(this, "Masukkan angka", Toast.LENGTH_SHORT).show();
                }else {
                    nilai = Double.parseDouble(enterAngka.getText().toString().trim());
                    operasi = "bagi";
                    enterAngka.setText("");
                }
                break;

            case R.id.buttonKali:
                if (enterAngka.getText().toString().isEmpty())
                {
                    Toast.makeText(this, "Masukkan angka", Toast.LENGTH_SHORT).show();
                }else {
                    operasi = "kali";
                    nilai = Double.parseDouble(enterAngka.getText().toString().trim());
                    enterAngka.setText("");
                }
                break;

            case R.id.buttonC:
                nilai = 0;
                hasil = 0.0;
                enterAngka.setText("");
                break;

            case R.id.buttonSama:
                if(operasi.equals("tambah")) {
                    if (enterAngka.getText().toString().isEmpty())
                    {
                        Toast.makeText(this, "Masukkan angka", Toast.LENGTH_SHORT).show();
                    }else {
                        hasil = nilai + Double.parseDouble(enterAngka.getText().toString().trim());
                    }
                }

                if(operasi.equals("kurang"))
                {
                    if (enterAngka.getText().toString().isEmpty())
                    {
                        Toast.makeText(this, "Masukkan angka", Toast.LENGTH_SHORT).show();
                    }else {
                        hasil = nilai - Double.parseDouble(enterAngka.getText().toString().trim());
                    }
                }

                if(operasi.equals("bagi"))
                {
                    if (enterAngka.getText().toString().isEmpty())
                    {
                        Toast.makeText(this, "Masukkan angka", Toast.LENGTH_SHORT).show();
                    }else {
                        hasil = nilai / Double.parseDouble(enterAngka.getText().toString().trim());
                    }
                }

                if(operasi.equals("kali"))
                {
                    if (enterAngka.getText().toString().isEmpty())
                    {
                        Toast.makeText(this, "Masukkan angka", Toast.LENGTH_SHORT).show();
                    }else {
                        hasil = nilai * Double.parseDouble(enterAngka.getText().toString().trim());
                    }
                }
                int total = (int) hasil;
                if (total == hasil){
                    enterAngka.setText(String.valueOf((int) hasil));
                }else {
                    enterAngka.setText(String.valueOf(hasil));
                }
                break;
        }
    }
}
