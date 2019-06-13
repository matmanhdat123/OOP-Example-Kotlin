open class Bank {
    open val rateOfInterest: Int
        get() = 0
}

class VCB : Bank() {
    override val rateOfInterest: Int
        get() = 8
}

class AGR : Bank() {
    override val rateOfInterest: Int
        get() = 7
}

class CTG : Bank() {
    override val rateOfInterest: Int
        get() = 9
}

object Test3 {
    @JvmStatic
    fun main(args: Array<String>) {
        val b1 = VCB()
        val b2 = AGR()
        val b3 = CTG()
        println("VCB lai suat la: " + b1.rateOfInterest)
        println("AGR lai suat la: " + b2.rateOfInterest)
        println("CTG lai suat la: " + b3.rateOfInterest)
    }
}  