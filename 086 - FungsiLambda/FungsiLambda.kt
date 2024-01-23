fun main(){

  println("----------------------------------")
  println("Latihan Fungsi Lambda : M Azka F")
  println("----------------------------------")

  //Ini adalah fungsi lambda ke 1
  val upperCase = {str:String -> str.uppercase()}
  
  //Ini adalah fungsi lambda ke 2 akan mengembalikan nilai penjumlahan
  val jumlahkan = {a:Int,b:Int -> a + b}

  //Ini adalah fungsi tanpa nama
  val menyapa = {println("Hello Dunia !")}

  println(upperCase("Hello, Dunia!"))

  println(jumlahkan(5,5))

  menyapa()
}