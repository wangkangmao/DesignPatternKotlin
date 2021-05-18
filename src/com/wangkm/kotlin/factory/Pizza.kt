package com.wangkm.kotlin.factory

class Pizza: Product {

    override fun product() {

        /**
         * 具体的业务逻辑
         */
        System.out.println("披萨做好了！")
    }
}