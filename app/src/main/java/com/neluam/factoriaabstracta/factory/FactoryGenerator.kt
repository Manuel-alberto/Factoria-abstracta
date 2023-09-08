package com.neluam.factoriaabstracta.factory

import com.neluam.factoriaabstracta.bread.BreadFactory
import com.neluam.factoriaabstracta.drink.DrinkFactory
import com.neluam.factoriaabstracta.filling.FillingFactory

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