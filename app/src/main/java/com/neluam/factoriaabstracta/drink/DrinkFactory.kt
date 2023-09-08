package com.neluam.factoriaabstracta.drink

import com.neluam.factoriaabstracta.factory.AbstractFactory
import com.neluam.factoriaabstracta.bread.Bread
import com.neluam.factoriaabstracta.filling.Filling

class DrinkFactory: AbstractFactory() {
    override fun getBread(breadType: String?): Bread? = null
    override fun getFilling(fillingType: String?): Filling? = null
    override fun getDrink(drinkType: String?): Drink? {
        if (drinkType == null) return null
        return when (drinkType) {
            "COK" -> Coke()
            "BEE" -> Beer()
            else -> null
        }
    }
}