package com.wangkm.kotlin.observer

fun main() {

    val wolf = Wolf()

    val pleasantSheep = PleasantSheep()
    wolf.attach(pleasantSheep)

    val lazySheep = LazySheep()
    wolf.attach(lazySheep)

    wolf.invade()

    println("---------")
    wolf.detach(pleasantSheep)
    wolf.invade()
}