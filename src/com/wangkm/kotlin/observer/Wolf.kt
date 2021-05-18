package com.wangkm.kotlin.observer

import com.wangkm.kotlin.observer.Subject

class Wolf: Subject() {

    fun invade(){
        println("灰太狼:  我要搞事情了！")
        notifyObserver()
    }
}