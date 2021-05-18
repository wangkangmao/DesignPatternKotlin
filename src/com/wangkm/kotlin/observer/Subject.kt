package com.wangkm.kotlin.observer

/**
 * 被订阅的主题
 */
abstract class Subject {

    /**
     * 观察者对象的集合
     */
    private val observerList:MutableList<Observer> = ArrayList()

    /**
     * 观察者登记
     */
    fun attach(observer: Observer){
        observerList.add(observer)
        println("增加了观察者:     ${observer.getName()}")
    }

    /**
     * 删除观察者
     */
    fun detach(observer: Observer){
        observerList.remove(observer)
        println("删除了观察者:     ${observer.getName()}")
    }

    /**
     * 通知所有观察者
     */
    fun notifyObserver(){
        observerList.forEach {
            it.update("灰太狼要搞事情了！")
        }
    }



}