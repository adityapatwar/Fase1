package com.example.aditya.fase1

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var scoreFirstTeam:Int = 0;
    var scoreSecondTeam:Int =0;


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val firstTeam = intent.getStringExtra("firstTeam")
        val secondTeam = intent.getStringExtra("secondTeam")

        txt_first_team.text=firstTeam;
        txt_second_team.text=secondTeam;

        Log.d( "CheckActivitylifeCycle", "onCreate was here!")

        updateScore(1);
        updateScore(2);

        two_point_first_team.setOnClickListener{
            addpoint(1,2)
            updateScore(1);
            Log.d( "CheckActivitylifeCycle", "add!")
        }
        three_point_first_team.setOnClickListener {
            addpoint(1,3)
            updateScore(1);
            Log.d( "CheckActivitylifeCycle", "add!")
        }
        two_point_second_team.setOnClickListener{
            addpoint(2,2)
            updateScore(2);
            Log.d( "CheckActivitylifeCycle", "add!")
        }
        three_point_second_team.setOnClickListener {
            addpoint(2,3)
            updateScore(2);
            Log.d( "CheckActivitylifeCycle", "add!")
        }
        btn_changeTeam.setOnClickListener {
            var pindahMain: Intent = Intent(applicationContext,HomeActivity::class.java)
            //data data

            startActivity(pindahMain)
        }

    }
    override fun onStart() {
        super.onStart()
        Log.d( "CheckActivitylifeCycle", "Onstart was here!")
    }

    override fun onPause() {
        super.onPause()
        Log.d( "CheckActivitylifeCycle", "onPause was here!")
    }

    override fun onResume() {
        super.onResume()
        Log.d( "CheckActivitylifeCycle", "onResume was here!")
    }

    override fun onStop() {
        super.onStop()
        Log.d( "CheckActivitylifeCycle", "onStop was here!")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d( "CheckActivitylifeCycle", "onDestroy was here!")
    }
    //add score
    fun addpoint(team: Int, point: Int){
        if (team == 1){
            scoreFirstTeam = scoreFirstTeam + point;
        } else
        {
            scoreSecondTeam = scoreSecondTeam + point;
        }
    }
//update score team
    fun updateScore(team:Int){
    if (team == 1){
        score_first_team.text = scoreFirstTeam.toString()
    } else
    {
        score_second_team.text = scoreSecondTeam.toString()
    }

}


}
