fun main(){
  val hari = 2

  println("-----------------------------------------------------")
  println("Latihan Percabangan When Dengan Blok Kode : M Azka F")
  println("-----------------------------------------------------")

  when(hari){
    1 -> {
      println("Hari pertama dalam seminggu")
      println("Senin")
  }
    2 -> {
      println("Hari kedua dalam seminggu")
      println("Selasa")
  }
    3 -> {
      println("Hari ketiga dalam seminggu")
      println("Rabu")
  }
    4 -> println("Kamis")
    5 -> println("Jumat")
    6 -> println("Sabtu")
    7 -> println("Minggu")
    else -> println("Hari tidak valid.")
  }   

}