fun main() {
    var nilai:String="26"
    val nilaiByte:Byte = nilai.toByte()
    val nilaiInt:Int = nilai.toInt()
    val nilaiDouble:Double = nilai.toDouble()
    val nilaiLong:Long = nilai.toLong()
    val nilaiShort:Short = nilai.toShort()
    val nilaiBoolean:Boolean = nilai.toBoolean()
    val nilaiChar:Char = nilai.first()

    val nilaiString1:String="5"
    val nilaiString2:String="5"
    val operasiString:String=(nilaiString1 + nilaiString2)

    val operasiInt:Int=((nilaiString1.toInt())) + ((nilaiString2.toInt()))

    val nilaiStringLogika:String = "true"
    val operasiBoolean:Boolean = nilaiStringLogika.toBoolean()
    
    println("-----------------------------------------------------")
    println("Latihan Konversi Tipe Data String : M Azka F\n")
    println("Nilai String: $nilai")
    println("Nilai Byte: $nilaiByte")
    println("Nilai Int: $nilaiInt")
    println("Nilai Double: $nilaiDouble")
    println("Nilai Long: $nilaiLong")
    println("Nilai Short: $nilaiShort")
    println("Nilai Boolean: $nilaiBoolean")
    println("Nilai Char: $nilaiChar")

    println("\nOperasi String: $operasiString")
    println("Operasi Int: $operasiInt")
    println("Operasi Boolean: $operasiBoolean")
}