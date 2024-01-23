fun main(){
  val hari : Int = 2

  println("---------------------------------------------------------")
  println("Latihan Percabangan When Dengan Multi Kondisi : M Azka F")
  println("---------------------------------------------------------")

  when(hari){
    1,2,3,4,5 -> println("Hari ke $hari adalah,Harinya Bekerja")
    else -> println("Hari ke $hari adalah,Harinya Libur")
  }
}