package com.wangkm.kotlin.factory

fun main() {

    // 生产雪糕
    val iceCreamFactory = IceCreamFactory()
    val iceCream = iceCreamFactory.factory()
    iceCream.product()

    // 生产披萨
    val pizzaFactory = PizzaFactory()
    val pizza = pizzaFactory.factory()
    pizza.product()

}