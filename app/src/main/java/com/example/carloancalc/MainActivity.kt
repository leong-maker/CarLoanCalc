package com.example.carloancalc

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener() {
            val carprice = carpricetext.text.toString()
            val downpay = paymenttext.text.toString()
            val caramount: Double = carprice.toDouble() - downpay.toDouble()

            val carloan = caramount.toString()
            val interest1 = interesttext.text.toString()
            val period = periodtext.text.toString()
            val interestAmount: Double = carloan.toDouble() * interest1.toDouble() * period.toDouble()


            val interestt = interestAmount.toString()
            val repay: Double = (carloan.toDouble() + interestt.toDouble() / period.toDouble() / 12)

            val caramounttext = findViewById<TextView>(R.id.carloan)
            val interestAmounttext = findViewById<TextView>(R.id.interest)
            val repaytext = findViewById<TextView>(R.id.monthlyreplacement)

            caramounttext.text = "RM %.2f".format(caramount)
            interestAmounttext.text = "RM %.2f".format(interestAmount)
            repaytext.text = "RM %.2f".format(repay)
        }
    }
}
