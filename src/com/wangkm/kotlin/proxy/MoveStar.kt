package com.wangkm.kotlin.proxy

class MoveStar:Subject {
    override fun movie() {
        println(javaClass.simpleName + " : 经纪人接了一部电影，我负责拍就好")

    }

    override fun getAgent(): Subject {
        return Agent(this)
    }
}