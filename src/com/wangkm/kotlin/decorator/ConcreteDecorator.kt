package com.wangkm.kotlin.decorator

class ConcreteDecorator:Component {

    private var mStar:Component? = null
    constructor(concreteDecorator: Component){
        mStar = concreteDecorator
    }


    override fun movie() {
        println(javaClass.simpleName + "：拍电影各种道具加身，还得化妆")
        mStar?.movie()
    }
}