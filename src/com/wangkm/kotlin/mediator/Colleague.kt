package com.wangkm.kotlin.mediator

abstract class Colleague {

    protected var mMediator:Mediator? = null

    constructor(mediator: Mediator){
        this.mMediator = mediator
    }
}