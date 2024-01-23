fun main(){
  val usia : Int = 13

  println("----------------------------------------------")
  println("Latihan Percabangan IF ELSE IF ELSE: M Azka F")
  println("----------------------------------------------")

  val hasil = if(usia > 19){
    "Dewasa"
  }else if(usia > 12 && usia <20){
    "Remaja"
  }else{
    "Anak anak"
  }
  print("Nilai hasil : ")
  println(hasil)
}