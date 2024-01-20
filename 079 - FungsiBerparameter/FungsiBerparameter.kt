fun main(){
  val a=10
  val b=20

  println("--------------------------------------")
  println("Latihan Fungsi Berparameter: M Azka F")
  println("--------------------------------------")

  //Memanggil fungsi berparameter
  printJumlahkan(a, b)
  printJumlahkan(5, 5)
  }
  //Membuat fungsi sendiri berparameter (a dan b adalah parameter fumgsi)
  fun printJumlahkan(a:Int, b:Int){
    println("\nHasil Penjumlahan $a + $b : "+(a+b))
}