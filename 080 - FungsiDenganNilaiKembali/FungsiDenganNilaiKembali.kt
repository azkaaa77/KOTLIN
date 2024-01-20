fun main(){
  val a=10
  val b=20

  println("----------------------------------------------")
  println("Latihan Fungsi Dengan Nilai Kembali: M Azka F")
  println("----------------------------------------------")

  val result=sumTwo(a,b)
  println("Nilai $a + $b :"+result)
  }
  //Fungsi yang akan mengembalikan nilai
  fun sumTwo(a:Int, b:Int):Int{
    val x = a+b
    return x
}