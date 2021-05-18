package com.wangkm.kotlin.prototype

import java.io.Serializable

class Area:Cloneable,Serializable {

    // 钞票单位
    private var unit = ""

    fun getUnit():String{
        return unit
    }

    fun setUnit(unit:String){
        this.unit = unit
    }

    override fun clone(): Area {
        val cloneArea:Area = super.clone() as Area
        return cloneArea
    }
}