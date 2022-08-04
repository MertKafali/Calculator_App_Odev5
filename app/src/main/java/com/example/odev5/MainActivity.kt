package com.example.odev5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.odev5.databinding.ActivityMainBinding
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    private lateinit var tasarim:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        tasarim = ActivityMainBinding.inflate(layoutInflater)
        setContentView(tasarim.root)




        var num:String = "0"
        var num1 = 0
        var num2 = 0
        var result = 0

        tasarim.txtInputs.text = num.toString()
        tasarim.txtResult.text = result.toString()

        tasarim.buttonClear.setOnClickListener {
            num = "0"
            num1 = 0
            num2 = 0
            result = 0
            tasarim.txtInputs.text = num
            tasarim.txtResult.text = result.toString()
            Snackbar.make(it,"Cleared!",Snackbar.LENGTH_SHORT).show()
        }
        tasarim.buttonDel.setOnClickListener {
            if (num.length > 1){
                val n = 1
                val numDeleted = num.dropLast(n)
                num = numDeleted
                println("Original String  : " + num)
                println("Resulting String : " + numDeleted)
                tasarim.txtInputs.text = num
            }else{
                num = "0"
                tasarim.txtInputs.text = num
            }

        }
        tasarim.buttonAdd.setOnClickListener {
            if (tasarim.txtInputs.text != num + "+"){
                num1 = num.toInt()
                tasarim.txtInputs.text = num + "+"
                num = "0"
            }
        }
        tasarim.buttonEquals.setOnClickListener {
            if (num != "0"){
                num2 = num.toInt()
                result = num1 + num2
                tasarim.txtResult.text = result.toString()
                num = result.toString()
            }

        }

        tasarim.button0.setOnClickListener {
            if(num != "0"){
                num += "0"
            }
            else{
                num = "0"
            }
            tasarim.txtInputs.text = num.toString()
        }
        tasarim.button1.setOnClickListener {
            if(num != "0"){
                num += "1"
            }
            else{
                num = "1"
            }
            tasarim.txtInputs.text = num.toString()
        }
        tasarim.button2.setOnClickListener {
            if(num != "0"){
                num += "2"
            }
            else{
                num = "2"
            }
            tasarim.txtInputs.text = num.toString()
        }
        tasarim.button3.setOnClickListener {
            if(num != "0"){
                num += "3"
            }
            else{
                num = "3"
            }
            tasarim.txtInputs.text = num.toString()
        }
        tasarim.button4.setOnClickListener {
            if(num != "0"){
                num += "4"
            }
            else{
                num = "4"
            }
            tasarim.txtInputs.text = num.toString()
        }
        tasarim.button5.setOnClickListener {
            if(num != "0"){
                num += "5"
            }
            else{
                num = "5"
            }
            tasarim.txtInputs.text = num.toString()
        }
        tasarim.button6.setOnClickListener {
            if(num != "0"){
                num += "6"
            }
            else{
                num = "6"
            }
            tasarim.txtInputs.text = num.toString()
        }
        tasarim.button7.setOnClickListener {
            if(num != "0"){
                num += "7"
            }
            else{
                num = "7"
            }
            tasarim.txtInputs.text = num.toString()
        }
        tasarim.button8.setOnClickListener {
            if(num != "0"){
                num += "8"
            }
            else{
                num = "8"
            }
            tasarim.txtInputs.text = num.toString()
        }
        tasarim.button9.setOnClickListener {
            if(num != "0"){
                num += "9"
            }
            else{
                num = "9"
            }
            tasarim.txtInputs.text = num.toString()
        }


    }
}