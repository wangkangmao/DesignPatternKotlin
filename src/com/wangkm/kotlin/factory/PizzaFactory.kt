package com.wangkm.kotlin.factory

class PizzaFactory : Factory {

    override fun factory(): Product {
        return Pizza()
    }
}