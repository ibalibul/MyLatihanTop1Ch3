package com.example.mylatihantop1ch3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import org.w3c.dom.Text

class Latihan2Activity : AppCompatActivity() {

//    Mendeklarisakan Atribut

    lateinit var edNama : EditText
    lateinit var edtNim : EditText
    lateinit var etdNilaiUas : EditText
    lateinit var etdNilaiUts : EditText
    lateinit var etdNilaiTugas : EditText
    lateinit var btnHitungMahasiswa : Button
    lateinit var btnResetMahasiswa : Button
    lateinit var tvhasilTinggi1 : TextView
    lateinit var tvBbadan1 :TextView
    lateinit var tvUas : TextView
    lateinit var tvUts : TextView
    lateinit var tvTotal2 : TextView
    lateinit var tv_hasilRatarata : TextView
    lateinit var tv_nilaiHuruf : TextView
    lateinit var tv_lulus : TextView
    lateinit var tvhasilumur1 : TextView



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_latihan2)

//        Panggil Id dari Xml
        edNama = findViewById(R.id.ed_Nama)
        edtNim = findViewById(R.id.etd_Nim)
        etdNilaiUas = findViewById(R.id.etd_NilaiUas)
        etdNilaiUts = findViewById(R.id.ed_NilaiUts)
        etdNilaiTugas = findViewById(R.id.etd_NilaiTugas)
        tvhasilTinggi1 = findViewById(R.id.tv_TinggiHasil1)
        tvBbadan1 = findViewById(R.id.tv_BBHasil1)
        tvUas = findViewById(R.id.tv_Uas2)
        tvUts = findViewById(R.id.tv_hasiluts)
        tvTotal2 =findViewById(R.id.tv_HasilTotal2)
        tv_hasilRatarata =findViewById(R.id.tv_HasilRatarata)
        tv_nilaiHuruf = findViewById(R.id.tv_HasilRatarata1)
        tvhasilumur1 = findViewById(R.id.tv_umurHasil1)
        tv_lulus = findViewById(R.id.tv_hasillulus)
        btnHitungMahasiswa = findViewById(R.id.btn_hitungMahasiswa)
        btnResetMahasiswa = findViewById(R.id.btn_Reset)


//        Kasih Event on Click
        edNama.setOnClickListener{}
        btnHitungMahasiswa.setOnClickListener{
            tvhasilumur1.text = edNama.text
            tvBbadan1.text = edtNim.text

        }


    }
}