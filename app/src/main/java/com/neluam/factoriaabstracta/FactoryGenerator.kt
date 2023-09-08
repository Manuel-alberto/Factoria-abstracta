package com.neluam.factoriaabstracta

object FactoryGenerator {
    fun getFactory(factoryType: String?): AbstractFactory? {
        if (factoryType == null) return null
        return when (factoryType) {
            "BRE" -> BreadFactory()
            "FIL" -> FillingFactory()
            "DRI" -> DrinkFactory()
            else -> null
        }
    }
}