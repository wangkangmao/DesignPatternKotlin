package com.wangkm.kotlin.singleton

class EagerSingleton private constructor() {

    companion object {
        private val mSingleton: EagerSingleton = EagerSingleton()

        fun getInstance(): EagerSingleton {
            return mSingleton
        }
    }
}