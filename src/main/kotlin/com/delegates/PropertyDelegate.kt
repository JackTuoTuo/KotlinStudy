package com.delegates

import kotlin.reflect.KProperty

/**
 * <pre>
 *     author : Tuo
 *     e-mail : 839539179@qq.com
 *     time   : 2018/6/29 10:09
 *     desc   : 属性代理
 *     version: 1.0
 * </pre>
 */

class Delegate {

    val str: String by lazy(LazyThreadSafetyMode.NONE) {
        "hello"
    }

    val hello by X()


    var hello2 by X()
}


class X {


    private var value: String? = "hello x"

    operator fun getValue(thisRef: Any?, property: KProperty<*>): String {

        println("getValue-$thisRef $property")

        return value ?: ""
    }

    operator fun setValue(thisRef: Any?, property: KProperty<*>, value: String) {

        println("setValue-$thisRef $property-$value")
        this.value = value
    }

}


fun main(args: Array<String>) {

    val delegate = Delegate()

    println(delegate.hello)
    println(delegate.hello2)


    delegate.hello2 = "wo shi ni jie ge"

    println(delegate.hello2)

}


