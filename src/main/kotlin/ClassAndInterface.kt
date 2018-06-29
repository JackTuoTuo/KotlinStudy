/**
 * <pre>
 *     author : Tuo
 *     e-mail : 839539179@qq.com
 *     time   : 2018/6/28 14:51
 *     desc   :
 *     version: 1.0
 * </pre>
 */

interface InputDevice {
    fun input(event: Any)
}

interface USBInputDevice : InputDevice

interface BLEInputDevice : InputDevice


class USBMouse : USBInputDevice {
    override fun input(event: Any) {
        println("use 鼠标 插入")
    }
}


class BLEMouse : BLEInputDevice {
    override fun input(event: Any) {

    }

}


class Computer {

   private fun addUSBInputDevice(usbInputDevice: USBInputDevice) {
        println("插入 usb 输入设备")
    }

    private fun addBLEInputDevice(bleInputDevice: BLEInputDevice) {
        println("插入 ble 输入设备")
    }


    fun addInputDevice(inputDevice: InputDevice) {
        when (inputDevice) {
            is USBInputDevice -> addUSBInputDevice(inputDevice)
            is BLEInputDevice -> addBLEInputDevice(inputDevice)
            else -> {
                throw IllegalArgumentException("输入设备类型不支持")
            }
        }
    }
}


fun main(args: Array<String>) {

    Computer().addInputDevice(USBMouse())

}

