package com.example.mylatihantop1ch3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

//    Mendeklarisan Atribut
    lateinit var edtUmur : EditText
    lateinit var edtTbadan : EditText
    lateinit var edtBbadan : EditText
    lateinit var btnHitung : Button
    lateinit var btnReset : Button
    lateinit var tvhasilUmur : TextView
    lateinit var tvhasilTinggi : TextView
    lateinit var tvhasilBbadan : TextView
    lateinit var tvhasilBmi : TextView
    lateinit var tvKategori : TextView
    lateinit var btnlanjut : Button



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        Pemanggilan id View dari Xml
        edtUmur = findViewById(R.id.ed_umur)
        edtTbadan = findViewById(R.id.ed_tbadan)
        edtBbadan = findViewById(R.id.ed_Bbadan)
        btnHitung = findViewById(R.id.btn_hitung)
        btnReset = findViewById(R.id.btn_Reset)
        tvhasilUmur = findViewById(R.id.tv_umurHasil)
        tvhasilTinggi = findViewById(R.id.tv_TinggiHasil)
        tvhasilBbadan = findViewById(R.id.tv_BBHasil)
        tvhasilBmi = findViewById(R.id.tv_BMiHasil)
        tvKategori = findViewById(R.id.tv_KategoriHasil)
        btnlanjut = findViewById(R.id.btn_lanjut)



//        Kasih event OnClick
        edtUmur.setOnClickListener{}
        edtTbadan.setOnClickListener{}
        edtBbadan.setOnClickListener{}
        //        Pindah ke halaman latihan 2
        btnlanjut.setOnClickListener{
            var btnlanjut = Intent(this,Latihan2Activity::class.java)
            startActivity(btnlanjut)
        }
        btnHitung.setOnClickListener{
            tvhasilUmur.text = edtUmur.text
            var tinggiBadan = edtTbadan.text.toString().toDouble()/100
            var beratBadan  = edtBbadan.text.toString().toInt()
            var BMI = beratBadan / tinggiBadan  * tinggiBadan

            tvhasilTinggi.text = edtTbadan.text
            tvhasilBbadan.text = edtBbadan.text
            tvhasilBmi.text = BMI.toString()


            val Kategori : String
            if (BMI in 0.0..16.0){
                Kategori = "Terlalu Kurus"
            }else if (BMI in 16.0..17.0) {
                Kategori = "Cukup Kurus"
            }else if (BMI in 17.0..18.5) {
                Kategori = "sedikit kurus"
            }else if (BMI in 18.5..25.0) {
                Kategori = "Normal"
            }else if (BMI in 25.0..30.0){
                Kategori = "Gemuk"
            }else if (BMI in 30.0..35.0){
                Kategori = "Obesitas Kelas 1"
            }else if (BMI in 35.0..40.0) {
                Kategori = "Obesitas kelas 2"
            }else if (BMI > 40 ) {
                Kategori = "Obesitas Kelas 3"
            }else Kategori = "Tidak falid "
            tvKategori.text = Kategori
        }

        btnReset.setOnClickListener{}
    }

}