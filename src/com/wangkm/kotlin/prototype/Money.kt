package com.wangkm.kotlin.prototype

import java.io.*

 class Money : Cloneable, Serializable {

    private var faceValue = 0

    private var area: Area? = null

    constructor(faceValue: Int, area: Area) {
        this.faceValue = faceValue
        this.area = area
    }

    fun getFaceValue(): Int {
        return faceValue
    }

    fun setFaceValue(faceValue: Int) {
        this.faceValue = faceValue
    }

    fun getArea(): Area {
        return area!!
    }

    fun setArea(area: Area) {
        this.area = area
    }

    public override fun clone(): Money {

        // 深拷贝
        var cloneMoney: Money? = null

        try {
            cloneMoney = deepClone() as Money
        } catch (e: IOException) {
            e.printStackTrace()
        } catch (e: ClassNotFoundException) {
            e.printStackTrace()
        }

        return cloneMoney!!
    }


     private fun deepClone()  : Any?  {
//         try {
//             // 将对象写到流里
//
//         } catch (e: IOException) {
//             e.printStackTrace()
//         } catch (e: ClassNotFoundException) {
//             e.printStackTrace()
//         }

         val bos = ByteArrayOutputStream()
         val oos = ObjectOutputStream(bos)
         oos.writeObject(this)

         // 从流里面读出来
         val bis = ByteArrayInputStream(bos.toByteArray())
         val ois = ObjectInputStream(bis)
         return ois.readObject()

     }



}