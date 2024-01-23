fun main(){
  val usia : Int = 20

  println("------------------------------------------- ")
  println("Latihan Percabangan IF Bersarang : M Azka F")
  println("--------------------------------------------")

  val hasilCek = if(usia > 12){
    if(usia > 12 && usia <20){
    "Remaja"
  }else{
    "Dewasa"
  }
  }else{
    "Anak anak"
  }

  print("Nilai hasil : ")
  println(hasilCek)

}