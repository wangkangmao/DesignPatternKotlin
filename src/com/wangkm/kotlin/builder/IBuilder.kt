package com.wangkm.kotlin.builder

/**
 * 建造者接口
 */
interface IBuilder {

    fun buildPart1()
    fun buildPart2()
    fun build(): Production

}