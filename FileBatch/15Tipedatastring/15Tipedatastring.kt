fun main(){
    val escapedString : String ="ini adalah escaped String\n"
    val rawString :String

    rawString =
    """ini akan menjadi string lebih dari satu baris dan tidak boleh meiliki katakter escaped didalamnya.""";

    var nama = "zaki yusron"
    var nilaiString1 ="2"
    var nilaiString2 ="2"
     
    println("latihan tipe data string : $nama\n")

    print(escapedString)
    println(rawString+"\n\n")
    println("ketika nilai string di tambah dengan nilai string")
    println("maka akan menjadi gabungan string")
    println(nilaiString1 + nilaiString2)
    println("----------")
}