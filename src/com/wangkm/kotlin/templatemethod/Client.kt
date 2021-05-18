package com.wangkm.kotlin.templatemethod

fun main(){

    val scanBicycle = ScanBicycle()
    scanBicycle.isNeedUnlock(true)
    scanBicycle.use()

    val codeBicycle = CodeBicycle()
    codeBicycle.isNeedUnlock(false)
    codeBicycle.use()


}

