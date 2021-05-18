package com.wangkm.kotlin.decorator

class Star:Component {
    override fun movie() {
        println(javaClass.simpleName + "  ：化了妆迷倒一片妹纸，拍起来电影特别带劲")
    }
}