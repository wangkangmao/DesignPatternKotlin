package com.wangkm.kotlin.builder

class BuilderB : IBuilder {

    private val production = Production()

    override fun buildPart1() {
        println("构造法拉利的第一部分")
        production.part1 = "This is part of Ferrari"
    }

    override fun buildPart2() {
        println("构造法拉利的第二部分")
        production.part2 = "This is part of Ferrari"
    }

    override fun build(): Production {
        println("咻咻！法拉利已造好！")
        return production
    }
}