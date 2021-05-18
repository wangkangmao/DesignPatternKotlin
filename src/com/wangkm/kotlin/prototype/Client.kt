package com.wangkm.kotlin.prototype

fun main(){
    val area = Area()
    area.setUnit("人民币")

    //  原型实例，，100RMB的钞票
    val money = Money(100,area)


    try {
        val cloneMoney = money.clone()
        cloneMoney.setFaceValue(200)
        cloneMoney.getArea().setUnit("美元")

        println("原型实例的面值：  " + money.getFaceValue() + "   " +  money.getArea().getUnit())
        println("拷贝实例的面值：  " + cloneMoney.getFaceValue() + "   " +  cloneMoney.getArea().getUnit())


    }catch (e:CloneNotSupportedException){
        e.printStackTrace()
    }

}