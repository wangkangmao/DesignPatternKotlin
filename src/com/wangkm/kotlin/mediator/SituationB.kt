package com.wangkm.kotlin.mediator

class SituationB :Colleague {

    constructor(mediator: Mediator):super(mediator)

    fun bRequestSupport(){
        super.mMediator?.execute("bRequestSupport")
    }

    fun bSupport(isSupport:Boolean){
        if(isSupport){
            println("SituationB：Copy that，还有五秒钟到达战场")
        }else{
            println("-------B也正在被攻打--------")
            println("SituationB：支援你妹，我也正在被攻打")
        }
    }
}