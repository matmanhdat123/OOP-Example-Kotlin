package Packed_Oop_Example

import HinhChuNhat


object DemoJava {

    @JvmStatic
    fun main(args: Array<String>) {
        val HCN = HinhChuNhat()
        HCN.rong = 3
        HCN.dai = 4
        println("HCN co chieu rong: " + HCN.rong)
        println("HCN co chieu dai: " + HCN.dai)
    }
}
