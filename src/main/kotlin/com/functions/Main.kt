package com.functions

import java.io.File

/**
 * <pre>
 *     author : Tuo
 *     e-mail : 839539179@qq.com
 *     time   : 2018/7/1 11:49
 *     desc   : 统计字符个数
 *     version: 1.0
 * </pre>
 */

fun main(args: Array<String>) {

    val map = HashMap<Char, Int>()


    File("build.gradle").readText().toCharArray().filterNot(Char::isWhitespace).forEach {
        val count = map[it]
        if (count == null) map[it] = 1
        else map[it] = count + 1
    }

    map.forEach(::println)



    File("build.gradle").readText().toCharArray().filterNot(Char::isWhitespace)
            .groupBy { it }
            .map { it.key to  it.value.count() }
            .forEach(::println)


}