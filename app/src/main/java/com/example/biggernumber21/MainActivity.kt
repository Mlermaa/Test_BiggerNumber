package com.example.biggernumber21

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    var leftNumber: Int = Random.nextInt(0,100)
    var rightNumber: Int = Random.nextInt(0,100)




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        val bl = findViewById<Button>(R.id.buttonLeft)
        val br = findViewById<Button>(R.id.buttonRight)


        br.setOnClickListener{
            if (rightNumber>leftNumber) {
                Toast.makeText(this,"Has Ganado",Toast.LENGTH_LONG).show()
                println("Has ganado")
            }else{
                Toast.makeText(this,"Has perdido",Toast.LENGTH_LONG).show()
                println("Has perdido")
            }

            val leftNumber: Int = Random.nextInt(0,100)
            val rightNumber: Int = Random.nextInt(0,100)
        }

        bl.setOnClickListener{
            if (rightNumber>leftNumber) {
                Toast.makeText(this,"Has Ganado",Toast.LENGTH_LONG).show()
                println("Has ganado")
            }else{
                Toast.makeText(this,"Has perdido",Toast.LENGTH_LONG).show()
                println("Has perdido")
            }
        }


    }
}
