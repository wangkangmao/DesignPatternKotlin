package com.wangkm.kotlin.singleton

class LazySingleton private constructor() {

    companion object {
        @Volatile
        private var mSingleton: LazySingleton? = null

        fun newInstance(): LazySingleton {
            if(mSingleton == null){
                synchronized(LazySingleton::class){
                    if(mSingleton == null){
                        mSingleton = LazySingleton()
                    }
                }
            }
            return mSingleton!!
        }
    }

}