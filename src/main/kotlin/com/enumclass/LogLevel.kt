package com.enumclass

/**
 * <pre>
 *     author : Tuo
 *     e-mail : 839539179@qq.com
 *     time   : 2018/6/29 15:08
 *     desc   : 枚举类: 实例有限的类
 *     version: 1.0
 * </pre>
 */
enum class LogLevel(val id: Int) {

    VERBOSE(0), DEBUG(1), INFO(2), WARN(3), ERROR(4);

    fun getTag(): String {
        return "$id $name"
    }


    /**
     * ordinal 顺序
     */
    override fun toString(): String {
        return "$name $ordinal"
    }
}


fun main(args: Array<String>) {
    println(LogLevel.VERBOSE.getTag())

    println(LogLevel.valueOf("DEBUG"))

    LogLevel.values().map(::println)
}