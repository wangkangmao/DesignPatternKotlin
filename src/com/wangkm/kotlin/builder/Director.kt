package com.wangkm.kotlin.builder

/**
 * 导演
 */
class Director {

    private var mBuild : IBuilder? = null

    constructor(builder: IBuilder){
        this.mBuild = builder
    }

    /**
     * 构造顺序
     */
    fun construct(): Production {
        mBuild?.buildPart1()
        mBuild?.buildPart2()
        return mBuild?.build()!!
    }

}