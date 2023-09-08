package com.neluam.factoriaabstracta

class BreadFactory: AbstractFactory() {
    override fun getBread(breadType: String?): Bread? {
        if (breadType == null) return null
        return when (breadType) {
            "BAG" -> Baguette()
            "ROL" -> Roll()
            "SLI" -> Sliced()
            else -> null
        }
    }

    override fun getFilling(fillingType: String?): Filling? = null
    override fun getDrink(drinkType: String?): Drink? = null
}