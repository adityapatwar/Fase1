package com.example.aditya.fase1

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_home.*

class HomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        btnNext.setOnClickListener{
            val firstTeam = edtFirstTeam.text.toString();
            val secondTeam = edtSecondTeam.text.toString();

            if(firstTeam.length == 0 || secondTeam.length == 0){
                //Belum menulis nama team
                Toast.makeText(applicationContext,"SIlahkan memasukan nama tim dahulu", Toast.LENGTH_LONG).show()
            }else{
                //Sudah menulis nama team
                var pindah:Intent = Intent(applicationContext,MainActivity::class.java)
                //data data
                pindah.putExtra("firstTeam",firstTeam)
                pindah.putExtra("secondTeam",secondTeam)
                startActivity(pindah)
                finish();
            }
        }
    }
}
