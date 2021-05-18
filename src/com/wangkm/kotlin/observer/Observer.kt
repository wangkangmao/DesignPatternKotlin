package com.wangkm.kotlin.observer

/**
 * 观察者
 */
interface Observer {

    fun getName():String

    fun update(msg:String)
}