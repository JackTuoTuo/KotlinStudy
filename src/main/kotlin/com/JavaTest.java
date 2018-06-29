package com;

import com.classandinterface.Latitude;
import com.innerclass.View;

/**
 * <pre>
 *     author : Tuo
 *     e-mail : 839539179@qq.com
 *     time   : 2018/6/28 17:15
 *     desc   : java 调 kotlin 测试
 *     version: 1.0
 * </pre>
 */
public class JavaTest {

    public static void main(String... args) {

        Latitude latitude = Latitude.ofDouble(3.0);
        Latitude copy = Latitude.Companion.ofLatitude(latitude);


        new View().setOnclickListener(() -> {

        });
    }
}
