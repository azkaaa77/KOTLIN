fun main(){
  val x = 20
  val y = 10
  val z = 10

  println("---------------------------------------------------")
  println("Latihan Percabangan When Dengan Expresi : M Azka F")
  println("---------------------------------------------------")

  when(x){
    (y+z) -> print("y + z = x = $x (Kondisi sesuai)")
    else -> print("Kondisi tidak sesuai")
  }
}