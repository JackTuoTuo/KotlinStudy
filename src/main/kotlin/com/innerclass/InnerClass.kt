package com.innerclass

/**
 * <pre>
 *     author : Tuo
 *     e-mail : 839539179@qq.com
 *     time   : 2018/6/29 14:38
 *     desc   : Kotlin 默认内部类为 静态内部类  非静态内部类 要加 inner关键字
 *     version: 1.0
 * </pre>
 */

open class InnerClass {

    val a: Int = 0


    class Inner {
        fun hello() {
            println(InnerClass().a)
        }
    }

    inner class UnStaticInner {

        val a: Int = 1
        fun hello() {
            println(a)
        }

        fun hello2(){
            println(this@InnerClass.a)
        }
    }
}

interface OnClickListener{
    fun onClick()
}

class View {

    var onclickListener: OnClickListener? = null

}

fun main(args: Array<String>) {

    val inner = InnerClass.Inner()

    val unstaticInner = InnerClass().UnStaticInner()


    View().onclickListener=object :InnerClass(),OnClickListener{
        override fun onClick() {

        }
    }
}