package com.rizalfadiaalfikri.pertemuan3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText ed_nama, ed_email, ed_alamat, ed_notelpn, ed_nik;
    Button btn_submit;
    Spinner spinner, spinner2;
    String jenis_vaksin, jenis_kelamin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ed_nama = findViewById(R.id.ed_nama);
        ed_alamat = findViewById(R.id.ed_alamat);
        ed_notelpn = findViewById(R.id.ed_nohp);
        ed_nik = findViewById(R.id.ed_nik);
        ed_email = findViewById(R.id.ed_email);
        btn_submit = findViewById(R.id.btn_submit);
        spinner = findViewById(R.id.jenis_vaksin);
        spinner2 = findViewById(R.id.jenis_kelamin);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                jenis_vaksin = spinner.getSelectedItem().toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
        spinner2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                jenis_kelamin = spinner2.getSelectedItem().toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
        btn_submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Success.class);
                intent.putExtra("nama", ed_nama.getText().toString());
                intent.putExtra("email", ed_email.getText().toString());
                intent.putExtra("alamat", ed_alamat.getText().toString());
                intent.putExtra("notelpn", ed_notelpn.getText().toString());
                intent.putExtra("nik", ed_nik.getText().toString());
                intent.putExtra("jenis_vaksin", jenis_vaksin);
                intent.putExtra("jenis_kelamin", jenis_kelamin);
                intent.setFlags(intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(intent);
            }
        });

    }
}