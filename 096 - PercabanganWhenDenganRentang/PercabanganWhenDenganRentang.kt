fun main(){
  val hari : Int = 2

  println("---------------------------------------------------")
  println("Latihan Percabangan When Dengan Rentang : M Azka F")
  println("---------------------------------------------------")

  when(hari){
    in 1..5 -> println("Hari ke $hari adalah,Harinya masuk Sekolah")
    else -> println("Hari ke $hari adalah,Harinya Libur")
  }
}