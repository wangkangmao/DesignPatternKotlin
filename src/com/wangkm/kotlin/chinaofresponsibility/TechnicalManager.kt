package com.wangkm.kotlin.chinaofresponsibility

class TechnicalManager : Handler {

    constructor() : super(1)


    override fun report(demand: Demand) {
        println("需求：    ${demand.detail()}")
        println(javaClass.simpleName + "  : 这个需求不干")
    }
}