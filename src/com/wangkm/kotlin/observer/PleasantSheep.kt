package com.wangkm.kotlin.observer

import com.wangkm.kotlin.observer.Observer

class PleasantSheep : Observer {

    override fun getName(): String {
        return "喜羊羊"
    }

    override fun update(msg: String) {
        println("喜羊羊收到消息   $msg")
    }
}