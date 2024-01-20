fun main(){
    var nama:String? = "M Azka F"
    val panjangKarakter:Int
    println("-------------------------------------------")
    println("Latihan Opertor not-null Asseration (Null Safety) : M Azka F")
    println("-------------------------------------------\n")
    panjangKarakter = nama!!.length

    println("Panjang Karater dari Variabel Nama : $nama")
    println("Panjang Karater : $panjangKarakter")

    println("-------------------------------------------")
}