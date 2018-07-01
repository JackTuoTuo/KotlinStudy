package com.functions

import java.util.function.Function

/**
 * <pre>
 *     author : Tuo
 *     e-mail : 839539179@qq.com
 *     time   : 2018/6/29 16:44
 *     desc   : 高阶函数
 *     version: 1.0
 * </pre>
 */


class Hello {

    fun world(action: () -> Unit) {
        action()
    }

}


fun main(args: Array<String>) {


    args.forEach { }

    val method = Hello::world



    Hello().world { println("helloWord") }


    args.filter(String::isNotEmpty)

    val pdf = PrintPDF()

    args.forEach(pdf::print)
    args.forEach(PrintPDF()::print)


}


class PrintPDF {

    fun print(any: Any) {
        kotlin.io.print(any)
    }
}