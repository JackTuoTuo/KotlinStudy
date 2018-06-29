package com.sealedclass

/**
 * <pre>
 *     author : Tuo
 *     e-mail : 839539179@qq.com
 *     time   : 2018/6/29 15:37
 *     desc   : 密封类:子类有限的类 必须定义在同一个文件中 或者内部类中
 *     version: 1.0
 * </pre>
 */


sealed class PlayCmd {
    class Play(val url: String, val position: Long = 0) : PlayCmd()

    class Seek(val position: Long) : PlayCmd()

    object Pause : PlayCmd()

    object Resume : PlayCmd()

    object Stop : PlayCmd()
}


enum class PlayState {
    IDEA
}