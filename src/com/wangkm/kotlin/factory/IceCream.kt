package com.wangkm.kotlin.factory

class IceCream: Product {

    override fun product() {

        /**
         * 具体的业务逻辑
         */
        System.out.println("雪糕做好了！！")
    }
}