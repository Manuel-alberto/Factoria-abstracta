package com.neluam.factoriaabstracta

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