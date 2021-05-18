package com.wangkm.kotlin.templatemethod

class CodeBicycle :AbstractClass() {


    override fun unlock() {
        println("-----------------   密码开锁  ----------")
    }

    override fun ride() {
        println(javaClass.simpleName + "骑起来很拉风")
    }

    public override fun isNeedUnlock(isNeedUnlock:Boolean){
        this.mIsNeedUnlock = isNeedUnlock
    }
}