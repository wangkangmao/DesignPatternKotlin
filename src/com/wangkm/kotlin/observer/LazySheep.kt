package com.wangkm.kotlin.observer

class LazySheep: Observer {

    override fun getName(): String {
        return "懒羊羊"
    }

    override fun update(msg: String) {
        println("懒羊羊收到通知： $msg")
    }
}