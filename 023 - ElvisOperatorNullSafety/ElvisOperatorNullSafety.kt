fun main(){
    var nama:String?=null
    var uang:String?=null

    println("------------------------------")
    println("Latihan Operator Elvis (Null Safety): M Azka F")
    println("------------------------------")

    println("Nama : $nama")
    println("Nomer : $uang")

    val ambilNilaiNama:String = nama?:"M Azka F"
    val ambilNilaiUang:Int= uang?.toInt()?:80000000

    println("Nama : $ambilNilaiNama")
    println("Nomer : $ambilNilaiUang")

    println("------------------------------")
}