package com.wangkm.kotlin.chinaofresponsibility

class Boss: Handler {


    constructor():super(2)

    override fun report(demand: Demand) {
        println("需求：   ${demand.detail()}")
        println(javaClass.simpleName + "  : 这个需辩论胜出者做决定求不干")
    }
}