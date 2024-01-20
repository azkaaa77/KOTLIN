fun main(){
  val fruits = arrayOf<String>("Apple","Mango","Banana","Orange")
  val dataBuah = arrayOf(
    arrayOf("1. ","Apel"),
    arrayOf("2. ", "Jeruk")
  )

  println("---------------------------------------")
  println("Latihan loop melalui array : M Azka F")
  println("---------------------------------------")

  //loop array 1D
  for(item in fruits){
      println(item)
    }
    println()

  //loop array 2D
  for(baris in dataBuah.indices){
    for(kolom in dataBuah[0].indices){
      print(dataBuah[baris][kolom]);print(" ")
    }
    println()
  }
}