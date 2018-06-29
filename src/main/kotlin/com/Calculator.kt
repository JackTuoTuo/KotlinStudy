package com

/**
 * <pre>
 *     author : Tuo
 *     e-mail : 839539179@qq.com
 *     time   : 2018/6/28 10:35
 *     desc   : 计算器小例子
 *     version: 1.0
 * </pre>
 */


fun main(args: Array<String>) {

    args.forEach(::println)

    while (true) {

        println("请输入算式如 3 + 4")

        val input = readLine() ?: break

        try {

            val splits = input.trim().split(" ")
            val arg1 = splits[0].toDouble()
            val op = splits[1]
            val arg2 = splits[2].toDouble()

            println(Operator(op).apply(arg1, arg2))

        } catch (e: Exception) {
            println("确定你输入的格式是正确的？")
        }

        println("再来一发[Y]")

        val str = readLine()

        if (str == null || str.toLowerCase() != "y") break

    }

}


class Operator(op: String) {

    val opFun: (left: Double, right: Double) -> Double

    init {
        opFun = when (op) {
            "+" -> { l, r -> l + r }
            "-" -> { l, r -> l - r }
            "*" -> { l, r -> l * r }
            "/" -> { l, r -> l / r }
            else -> throw UnsupportedOperationException(op)
        }
    }


    fun apply(left: Double, right: Double) = opFun(left, right)
}