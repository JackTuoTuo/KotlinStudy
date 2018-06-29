/**
 * <pre>
 *     author : Tuo
 *     e-mail : 839539179@qq.com
 *     time   : 2018/6/28 16:57
 *     desc   :
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
        val TAG: String = "Latitude"

    }
}


fun main(args: Array<String>) {

    val l = Latitude.ofDouble(3.0)

    val copy = Latitude.ofLatitude(l)

    Latitude.TAG

}