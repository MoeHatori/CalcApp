package jp.techacademy.moe.hatori.calcapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import android.content.Intent

class MainActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button1.setOnClickListener(this)
        button2.setOnClickListener(this)
        button3.setOnClickListener(this)
        button4.setOnClickListener(this)
    }

    override fun onClick(v: View) {

        val intent = Intent(this, SecondActivity::class.java)
        val value1= editTextA.text.toString()
        val value2= editTextB.text.toString()
        val resultcal :Double


        if (v.id == R.id.button1) {
            if(value1.length == 0 || value2.length == 0){

                textError.text = "数値を入力してください！"

            }else{
                resultcal = value1.toDouble() + value2.toDouble()
                intent.putExtra("VALUE1",resultcal.toString())
                startActivity(intent)
            }

        } else if ( v.id == R.id.button2){
            if(value1.length == 0 || value2.length == 0){

                textError.text = "数値を入力してください！"

            }else{
                resultcal = value1.toDouble() - value2.toDouble()
                intent.putExtra("VALUE1",resultcal.toString())
                startActivity(intent)
            }

        }else if ( v.id == R.id.button3){
            if(value1.length == 0 || value2.length == 0){

                textError.text = "数値を入力してください！"

            }else{
                resultcal = value1.toDouble() * value2.toDouble()
                intent.putExtra("VALUE1",resultcal.toString())
                startActivity(intent)
            }
        }else if ( v.id == R.id.button4){
            if(value1.length == 0 || value2.length == 0){

                textError.text = "数値を入力してください！"

            }else{
                resultcal = value1.toDouble() / value2.toDouble()
                intent.putExtra("VALUE1",resultcal.toString())
                startActivity(intent)
            }
        }



    }


}