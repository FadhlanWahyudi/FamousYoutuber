package com.example.famousyoutuber;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class DetailMovie extends AppCompatActivity {
    ImageView gambar;
    TextView nama, tgl;

    public static final String KEY_MOVIE = "KEY";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_movie2);
        gambar = findViewById(R.id.gambar);
        nama = findViewById(R.id.nama);
        tgl = findViewById(R.id.tgl);


        String idDetail = getIntent().getStringExtra(KEY_MOVIE);

        Toast.makeText(this, idDetail, Toast.LENGTH_SHORT).show();

        if (idDetail.equals("ATTA HALILINTAR")) {
            gambar.setImageResource(R.drawable.atta);
            nama.setText("Muhammad Attamimi Halilintar");
            tgl.setText("20 November 1994 (usia 24 tahun),");


        } else if (idDetail.equals("JESS NO LIMIT")) {
            gambar.setImageResource(R.drawable.jess);
            nama.setText("Tobias Justin");
            tgl.setText("Jakarta, 05 Februari 1996");


        } else if (idDetail.equals("RIA RICIS")) {
            gambar.setImageResource(R.drawable.riaricis);
            nama.setText(" Ria Yunita");
            tgl.setText("Batam, 1 Juli 1995");

        } else if (idDetail.equals("MIAWAUG")) {
            gambar.setImageResource(R.drawable.miaw);
            nama.setText("Reggy Prabowo");
            tgl.setText("Tanggal lahir belum di ketahui");



        } else if (idDetail.equals("YUDIST ARDHANA")) {
            gambar.setImageResource(R.drawable.yudist);
            nama.setText("Yudistira Ardhana ");
            tgl.setText("Denpasar 13 Oktober 1987");



        } else if (idDetail.equals("SAIIH HALILINTAR")) {
            gambar.setImageResource(R.drawable.saih);
            nama.setText("Muhammad Saaih Halilintar");
            tgl.setText("Malaysia, 16 Maret 2002");



        }
        else if (idDetail.equals("RRQ LEMON")) {
            gambar.setImageResource(R.drawable.lemon);
            nama.setText("Muhammad Ikhsan");
            tgl.setText("Banda Aceh 30 Desember 1998");



        }
        else if (idDetail.equals("THORIQ HALILINTAR")) {
            gambar.setImageResource(R.drawable.thoriq);
            nama.setText("Muhammad Thariq Halilintar");
            tgl.setText("29 Januari 1999");



        }
        else if (idDetail.equals("FATEH HALILINTAR")) {
            gambar.setImageResource(R.drawable.fateh);
            nama.setText("Muhammad Al Fateh Halilintar");
            tgl.setText("25 Februari 2006");



        }
        else if (idDetail.equals("YOSHIOLO")) {
            gambar.setImageResource(R.drawable.yosh);
            nama.setText("Yoshi Setyawan");
            tgl.setText("Tanggal lahir belum di ketahui");



        }
    }
}


