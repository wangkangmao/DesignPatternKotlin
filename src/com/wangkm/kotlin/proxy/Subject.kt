package com.wangkm.kotlin.proxy

interface Subject {
    fun movie()
    fun getAgent(): Subject
}