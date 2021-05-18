package com.wangkm.kotlin.mediator

class SituationC:Colleague {

    constructor(mediator: Mediator):super(mediator)

    fun cRequestSupport(){
        super.mMediator?.execute("cRequestSupport")
    }

    fun cSupport(isSupport:Boolean){
        if(isSupport){
            println(javaClass.simpleName + "：Copy that，还有五秒钟到达战场")
        }else{
            println(javaClass.simpleName + "：不好意思，来迟一步了，正在前往别的战区支援")
        }
    }
}