package com.dataclass

import com.annotions.PoKo
import com.google.gson.Gson

/**
 * <pre>
 *     author : Tuo
 *     e-mail : 839539179@qq.com
 *     time   : 2018/6/29 10:36
 *     desc   : 数据类
 *     version: 1.0
 * </pre>
 */

@PoKo
data class County(val id: Int, val name: String)




fun main(args: Array<String>) {

    val county = County(1, "中国")
    println(county)

    println(county.component1())

    val (id, name) = county

    println(id)
    println(name)


    val json = Gson().toJson(county)


    println(json)


    val temp = Gson().fromJson(json, County::class.java)

    println(temp)


}