package com.functions

/**
 * <pre>
 *     author : Tuo
 *     e-mail : 839539179@qq.com
 *     time   : 2018/6/29 17:19
 *     desc   : kotlin 内置高阶函数 map(一维集合变换) flatMap(二维集合打平变换) reduce(累加,求和) let with apply
 *     version: 1.0
 * </pre>
 */

fun main(args: Array<String>) {

    // 一维集合

    val list = intArrayOf(1, 2, 3, 4, 5, 6)


    val list2 = ArrayList<Int>()

    list.forEach {
        list2.add(it * 2 + 3)
    }


    val list3 = list.map {
        it * 2 + 3
    }

    val list4 = list.map(Int::toDouble)


    // 二维集合


    val arraylist = listOf(1..10, 2..5)

    val list5 = arraylist.flatMap { it.map { "number$it" } }


    println(list5.reduce { acc, s -> acc + s })

    println(list2)
    println(list3)
    println(arraylist)

    println(list5)
}