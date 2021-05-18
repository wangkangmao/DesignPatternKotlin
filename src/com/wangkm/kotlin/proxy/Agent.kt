package com.wangkm.kotlin.proxy

class Agent : Subject {

    private var mMoveStar: Subject? = null

    constructor(subject: Subject) {
        this.mMoveStar = subject
    }


    override fun movie() {
        println(javaClass.simpleName + ": 剧本很好，电影接下了")
        mMoveStar?.movie()
    }

    override fun getAgent(): Subject {
        return this
    }
}