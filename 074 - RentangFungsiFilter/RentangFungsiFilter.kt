fun main(){
  val a = 1..10
  val f = a.filter {T -> T % 2 == 0}

  println("-----------------------------------------")
  println("Latihan Rentang Fungsi Filter : M Azka F")
  println("-----------------------------------------")

  println(f)
}