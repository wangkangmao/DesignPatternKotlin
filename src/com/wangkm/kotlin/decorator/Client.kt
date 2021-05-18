package com.wangkm.kotlin.decorator


fun main(){
    val star:Component = Star()
    val decorator = ConcreteDecorator(star)
    decorator.movie()
}