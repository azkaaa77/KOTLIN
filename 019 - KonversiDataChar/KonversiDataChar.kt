fun main() {
    var nilai:Char='*'
    val nilaiByte:Byte = nilai.code.toByte()
    val nilaiDouble:Double = nilai.code.toDouble()
    val nilaiLong:Long = nilai.code.toLong()
    val nilaiShort:Short = nilai.code.toShort()
    val nilaiString:String = nilai.toString()

    println("-----------------------------------------")
    println("Latihan Konversi Data Character : M Azka F\n")
    println("Nilai Char : $nilai")
    println("Nilai Byte: $nilaiByte")
    println("Nilai Double: $nilaiDouble")
    println("Nilai Long: $nilaiLong")
    println("Nilai Short: $nilaiShort")
    println("Nilai String: $nilaiString")
    println("-----------------------------------------")
}