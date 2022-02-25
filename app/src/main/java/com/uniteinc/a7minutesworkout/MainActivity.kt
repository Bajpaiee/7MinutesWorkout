package com.uniteinc.a7minutesworkout

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.uniteinc.a7minutesworkout.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private var binding: ActivityMainBinding? =null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding?.root)
//Exercise button
        binding?.flStart?.setOnClickListener{
           val intent = Intent(this,ExerciseActivity::class.java)
            startActivity(intent)
        }
 //BMI button
        binding?.flBMI?.setOnClickListener{
            val intent = Intent(this,BMIActivity::class.java)
            startActivity(intent)
        }
//history button
        binding?.flHistory?.setOnClickListener{
            val intent = Intent(this,HistoryActivity::class.java)
            startActivity(intent)
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        binding = null
    }
}
