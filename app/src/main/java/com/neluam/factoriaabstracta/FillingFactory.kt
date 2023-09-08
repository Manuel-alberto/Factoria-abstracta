package com.neluam.factoriaabstracta

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