package com.wangkm.kotlin.builder

class BuilderA : IBuilder {

    private val production = Production()

    override fun buildPart1() {
        println("构造兰博基尼的第一部分")
        production.part1 = "This is part1 of Lanborghini"
    }

    override fun buildPart2() {
        println("构造兰博基尼的第二部分")
        production.part2 = "This is part2 of Lanborghini"
    }

    override fun build(): Production {
        println("哇喔！！ 兰博基尼已造好！")
        return production
    }
}