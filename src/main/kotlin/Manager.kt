/**
 * <pre>
 *     author : Tuo
 *     e-mail : 839539179@qq.com
 *     time   : 2018/6/28 15:51
 *     desc   : 接口代理
 *     version: 1.0
 * </pre>
 */


interface Driver {
    fun driver()
}

interface Write {
    fun write()
}


class Manager : Driver, Write {
    override fun driver() {
        println("经理自己开车")
    }

    override fun write() {
        println("经理自己写ppt")
    }
}


class CarDriver : Driver {
    override fun driver() {
        println("司机开车呢")
    }

}

class PPTWrite : Write {
    override fun write() {
        println("写手写PPT呢")
    }

}


class SeniorManager(private val driver: Driver, private val write: Write)
    : Driver by driver, Write by write


fun main(args: Array<String>) {
    val driver = CarDriver()

    val write = PPTWrite()

    val manager = Manager()
    manager.driver()
    manager.write()


    val seniorManager = SeniorManager(driver, write)

    seniorManager.driver()
    seniorManager.write()
}