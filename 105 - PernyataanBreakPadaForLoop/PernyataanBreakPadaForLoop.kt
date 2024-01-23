fun main(){

  println("-------------------------------------------------")
  println("Latihan Pernyatan Break pada For Loop : M Azka F")
  println("-------------------------------------------------")

  for(i in 1..10){
    println(i)
    if(i == 5){//Jika i samadengan 5 maka pengulangan akan berhenti
      break
    }
  }
}