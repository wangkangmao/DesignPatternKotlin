package com.wangkm.kotlin.factory

class IceCreamFactory : Factory {
    override fun factory(): Product {
        return IceCream()
    }
}