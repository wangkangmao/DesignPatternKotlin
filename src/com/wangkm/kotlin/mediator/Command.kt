package com.wangkm.kotlin.mediator

import java.util.*


class Command:Mediator() {



    override fun execute(method: String) {
//        println("SituationA：这里是A战区，现在被敌方攻打，请求支援")
        if(method == "aRequestSupport"){
            aRequestSupport()
        }else if(method == "bRequestSupport"){
            bRequestSupport()
        }

    }

    private fun aRequestSupport(){
        println("SituationA：这里是A战区，现在被敌方攻打，请求支援")
        val isBSupport = isSupport()
        super.mSituationB?.bSupport(isBSupport)
        if(!isBSupport){
            println("-------A又向C请求支援--------")
            val isASupport = isSupport()
            super.mSituationC?.cSupport(isASupport)
            if(!isASupport){
                println("------ 自己看着办吧 ------")
            }
        }
    }

    // B请求支援
    private fun bRequestSupport(){
        println("\t\tSystem.out.println(\"这里是B的请求支援\");\n")
    }


    private fun isSupport():Boolean{
        val rand = Random()
        return rand.nextBoolean()
    }
}