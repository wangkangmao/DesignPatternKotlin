package com.wangkm.kotlin.mediator

abstract class Mediator {

    protected var mSituationA:SituationA? = null
    protected var mSituationB:SituationB? = null
    protected var mSituationC:SituationC? = null

    constructor(){
        mSituationA = SituationA(this)
        mSituationB = SituationB(this)
        mSituationC = SituationC(this)
    }


    /**
     * 事件的业务流程处理
     */
    abstract fun execute(method:String)
}