package com.wangkm.kotlin.mediator

class SituationA : Colleague {

    constructor(mediator: Mediator) : super(mediator)

    // 请求支援
    fun aRequestSupport() {
        super.mMediator?.execute("aRequestSupport")
    }
}