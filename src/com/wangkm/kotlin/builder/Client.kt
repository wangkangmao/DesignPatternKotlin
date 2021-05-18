package com.wangkm.kotlin.builder

/**
 * 建造者模式
 */
fun main() {

    // 兰博基尼
    val builderA= BuilderA()
    val directorA = Director(builderA)
    directorA?.construct()

    // 法拉利
    val builderB = BuilderB()
    val directorB = Director(builderB)
    directorB?.construct()

}
