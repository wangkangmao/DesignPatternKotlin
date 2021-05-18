package com.wangkm.kotlin.proxy

fun main(){

    val moveStar = MoveStar()
    val proxy = moveStar.getAgent()
    proxy.movie()
}
