package com.neluam.factoriaabstracta

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.neluam.factoriaabstracta.factory.FactoryGenerator

class MainActivity : AppCompatActivity() {

    private val TAG = "MainActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val fillingFactory = FactoryGenerator.getFactory("FIL")
        val filling = fillingFactory!!.getFilling("TOM")
        Log.d(TAG, filling!!.name() + filling.calories())

        val breadFactory = FactoryGenerator.getFactory("BRE")
        val bread = breadFactory!!.getBread("BAG")
        Log.d(TAG, bread!!.name() + bread.calories())

        val drinkFactory = FactoryGenerator.getFactory("DRI")
        val drink = drinkFactory!!.getDrink("COK")
        Log.d(TAG, drink!!.name() + drink.calories())

    }
}