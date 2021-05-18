package com.wangkm.kotlin.chinaofresponsibility

abstract class Handler {

    private var mNextHandler: Handler? = null
    private var mLevel: Int = 0


    constructor(level: Int) {
        this.mLevel = level
    }

    /**
     * 处理请求传递，子类不可重写
     */
    fun handleMessage(demand: Demand) {

        if (mLevel == demand.demandLevel()) {
            this.report(demand)
        } else {
            if (this.mNextHandler != null) {
                println(this::class.simpleName + ":   事情太严重了。需报告上一级")
                this.mNextHandler?.handleMessage(demand)
            } else {
                println("我就是老大，我处理了！！")
            }
        }

    }

    fun setNextHandler(handler: Handler) {
        this.mNextHandler = handler
    }

    abstract fun report(demand: Demand)

}