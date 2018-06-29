package com.classandinterface

/**
 * <pre>
 *     author : Tuo
 *     e-mail : 839539179@qq.com
 *     time   : 2018/6/28 16:11
 *     desc   : 方法重写冲突问题
 *     version: 1.0
 * </pre>
 */


interface A {
    fun x(): Int = 1
}

interface B {
    fun x(): Int = 0
}

open class D {
    open fun x() = -1
}

class C(private val y: Int) : A, B, D() {

    override fun x(): Int {

        return when {
            y > 0 -> 0
            y < 0 -> super<A>.x()
            y < -200 -> super<D>.x()
            else -> super<B>.x()
        }
    }
}


fun main(args: Array<String>) {
    println(C(100).x())
}