package com.neluam.factoriaabstracta.factory

import com.neluam.factoriaabstracta.bread.Bread
import com.neluam.factoriaabstracta.drink.Drink
import com.neluam.factoriaabstracta.filling.Filling

abstract class AbstractFactory {
    abstract fun getBread(breadType: String?): Bread?
    abstract fun getFilling(fillingType: String?): Filling?
    abstract fun getDrink(drinkType: String?): Drink?
}