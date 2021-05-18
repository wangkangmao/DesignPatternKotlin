package com.wangkm.kotlin.chinaofresponsibility

import com.wangkm.kotlin.chinaofresponsibility.Demand

class DemandB: Demand {
    override fun demandLevel(): Int {
        return 2
    }

    override fun detail(): String {
        return "我想吃热狗"
    }
}