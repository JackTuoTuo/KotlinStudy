package com.functions

import java.io.OutputStream

/**
 * <pre>
 *     author : Tuo
 *     e-mail : 839539179@qq.com
 *     time   : 2018/7/1 10:51
 *     desc   : 函数科里化  即将一个多参数的函数 变换成 单参数的函数
 *     version: 1.0
 * </pre>
 */

fun hello(x: String, y: Int, z: Double): Boolean {
    println(x)
    println(y)
    println(z)
    return true
}


fun curryingHello(x: String): (y: Int) -> (z: Double) -> Boolean {

    println(x)
    return fun(y: Int): (z: Double) -> Boolean {
        println(y)
        return fun(z: Double): Boolean {
            println(z)
            return true
        }
    }
}


fun log(tag: String, target: OutputStream, message: Any?) {
    target.write("【${tag}】$message\n".toByteArray())
}


//fun log(tag: String)
//        = fun(target: OutputStream)
//        = fun(message: Any?)
//                = target.write("【${tag}】$message\n".toByteArray())


fun <P1, P2, P3, R> Function3<P1, P2, P3, R>.currying() =
        fun(p1: P1) = fun(p2: P2) = fun(p3: P3) = this(p1, p2, p3)


fun main(args: Array<String>) {
    hello("1", 2, 3.0)

    curryingHello("1")(2)(3.0)



    log("Tuo", System.out, "帅")

//    log("Tuo")(System.out)("帅")


    ::log.currying()("Tuo")(System.out)("帅")

}