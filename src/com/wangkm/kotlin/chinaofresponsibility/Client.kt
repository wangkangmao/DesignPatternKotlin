package com.wangkm.kotlin.chinaofresponsibility


fun main(args: Array<String>) {

    val demandA = DemandA() // 请求等级低
    val demandB = DemandB() // 请求等级高

    val boss = Boss()
    val technicalManager = TechnicalManager()
    technicalManager.setNextHandler(boss)

    technicalManager.handleMessage(demandA)
    println("----------------------------")
    technicalManager.handleMessage(demandB)

}


