package com.rizalfadiaalfikri.pertemuan3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Success extends AppCompatActivity {
    TextView txt_nama, txt_email, txt_alamat, txt_nik, txt_notelpn, txt_jenis_vaksin, txt_jenis_kelamin;
    String nama, alamat, email, nik, notelpn, jenis_vaksin, jenis_kelamin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_success);

        txt_nama = findViewById(R.id.txt_nama);
        txt_email = findViewById(R.id.txt_email);
        txt_alamat = findViewById(R.id.txt_alamat);
        txt_nik = findViewById(R.id.txt_nik);
        txt_notelpn = findViewById(R.id.txt_notelpn);
        txt_jenis_vaksin = findViewById(R.id.txt_jenis_vaksin);
        txt_jenis_kelamin = findViewById(R.id.txt_jenis_kelamin);

        Intent intent = getIntent();
        nama = intent.getStringExtra("nama");
        email = intent.getStringExtra("email");
        alamat = intent.getStringExtra("alamat");
        nik = intent.getStringExtra("nik");
        notelpn = intent.getStringExtra("notelpn");
        jenis_vaksin = intent.getStringExtra("jenis_vaksin");
        jenis_kelamin = intent.getStringExtra("jenis_kelamin");

        txt_nama.setText("Nama : " + nama.toString());
        txt_email.setText("Email : " + email.toString());
        txt_alamat.setText("Alamat : " + alamat.toString());
        txt_nik.setText("NIK : " + nik.toString());
        txt_notelpn.setText("No Telepon : " + notelpn.toString());
        txt_jenis_vaksin.setText("Jenis Vaksin : " + jenis_vaksin.toString());
        txt_jenis_kelamin.setText("Jenis Kelamin : " + jenis_kelamin.toString());

    }
}