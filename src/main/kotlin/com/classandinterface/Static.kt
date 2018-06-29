package com.classandinterface

/**
 * <pre>
 *     author : Tuo
 *     e-mail : 839539179@qq.com
 *     time   : 2018/6/28 16:57
 *     desc   : 伴生对象 类比 java的静态工具类方法
 *     version: 1.0
 * </pre>
 */


class Latitude private constructor(val value: Double) {

    companion object {

        /**
         * 方便java调用  @JvmStatic
         */
        @JvmStatic
        fun ofDouble(double: Double): Latitude {
            return Latitude(double)
        }

        fun ofLatitude(latitude: Latitude): Latitude {
            return Latitude(latitude.value)
        }


        /**
         * 方便java调用   @JvmField
         */
        @JvmField
        val TAG: String = "com.classandinterface.Latitude"

    }
}


fun main(args: Array<String>) {

    val l = Latitude.ofDouble(3.0)

    val copy = Latitude.ofLatitude(l)

    Latitude.TAG

}