package com.wangkm.kotlin.strategy

class Context {

    private var mStrategy: Strategy? = null

    fun factory(strategyType: String) {
        mStrategy = if (strategyType == "WIN") {
            ConcreteStrategyB()
        } else {
            ConcreteStrategyA()
        }
    }

    /**
     * 调用策略
     */
    fun contextInterface() {
        mStrategy?.algorithmLogic()
    }

}