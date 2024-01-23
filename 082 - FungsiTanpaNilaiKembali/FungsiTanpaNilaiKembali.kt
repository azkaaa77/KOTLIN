fun main(){
  val a:Int=10;
  val b:Int=20;

  println("---------------------------------------------")
  println("Latihan Fungsi Tanpa Nilai Kembali: M Azka F")
  println("---------------------------------------------")

  //Memanggil Fungsi
  printJumlahkan(a,b)
  printJumlahkan(5,5)
  }

  //Contoh lain fungsi tanpa nilai return / kembali
  //adalah fungsi bertipe Unit
  fun printJumlahkan(a:Int,b:Int):Unit{
    println("\nHasil Penjumlahan $a + $b : "+(a+b))
  }