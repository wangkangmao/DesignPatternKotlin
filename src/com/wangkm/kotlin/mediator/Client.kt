package com.wangkm.kotlin.mediator

/**
 * 中介者模式
 */
fun  main(){

    val mediator = Command()
    println(" ----- A被攻打，请求支援")
    val situationA = SituationA(mediator)
    situationA.aRequestSupport()
}