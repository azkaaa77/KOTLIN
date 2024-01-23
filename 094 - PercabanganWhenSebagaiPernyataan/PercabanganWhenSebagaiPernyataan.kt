fun main(){
  val day : Int = 2

  println("------------------------------------------------------")
  println("Latihan Percabangan When sebagai pernyataan: M Azka F")
  println("------------------------------------------------------")

  when(day){
    1->println("Senin")
    2->println("Selasa")
    3->println("Rabu")
    4->println("Kamis")
    5->println("Jumat")
    6->println("Sabtu")
    7->println("Minggu")
    else -> println("Hari tidak valid.")
  }
}