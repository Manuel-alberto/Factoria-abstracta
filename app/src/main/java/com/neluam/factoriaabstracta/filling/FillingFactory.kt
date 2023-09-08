package com.neluam.factoriaabstracta.filling

import com.neluam.factoriaabstracta.factory.AbstractFactory
import com.neluam.factoriaabstracta.bread.Bread
import com.neluam.factoriaabstracta.drink.Drink

class FillingFactory: AbstractFactory() {
    override fun getBread(breadType: String?): Bread? = null
    override fun getFilling(fillingType: String?): Filling? {
        if (fillingType == null) return null
        return when (fillingType) {
            "CHE" -> Chesse()
            "TOM" -> Tomato()
            "JAM" -> Jam()
            else -> null
        }
    }

    override fun getDrink(drinkType: String?): Drink? = null
}