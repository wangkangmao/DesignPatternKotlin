package com.wangkm.kotlin.templatemethod

abstract class AbstractClass {

    protected var mIsNeedUnlock = true

    protected abstract fun unlock()

    protected abstract fun ride()

    protected open fun isNeedUnlock(isNeedUnlock:Boolean){
        this.mIsNeedUnlock = isNeedUnlock
    }

    /**
     * 模板方法，负责调度基本方法，子类不可实现
     */
    fun use(){
        if(mIsNeedUnlock){
            unlock()
        }else{
            println("------- 锁坏了，不用解锁 ------")
        }
        ride()
    }
}