import myPackage.*
import myPackage.Sub.UtilKtSub

fun main(args: Array<String>) {
    val kt = UtilKt()
    kt.SayHello()

    val ktsub = UtilKtSub()
    ktsub.SayHello()
}