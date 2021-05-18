package com.wangkm.kotlin.chinaofresponsibility

import com.wangkm.kotlin.chinaofresponsibility.Demand

class DemandA : Demand {
    override fun demandLevel(): Int {
        return 1
    }

    override fun detail(): String {
        return "我先吃披萨"
    }
}