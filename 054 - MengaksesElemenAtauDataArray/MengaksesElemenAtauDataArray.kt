fun main(){
  val fruits = arrayOf<String>("Apple","Mango","Banana","Orange")
  val gender = charArrayOf('l','p')
  val data2 = arrayOf(
    arrayOf("One :","Pepaya"),
    arrayOf("Two :", "Kelapa")
  )

  println("----------------------------------------------------")
  println("Latihan mengakses elemen atau data array : M Azka F")
  println("----------------------------------------------------")
  println("Buah : "+fruits[0])
  println("Buah : "+fruits[3])
  println("Jenis kelamin : "+gender[0])
  println()

  print( data2 [0][0])//baris ke 0 kolom ke 0
  println( data2 [0][1])//baris ke 0 kolom ke 1
  print( data2 [1][0])//baris ke 1 kolom ke 0
  println( data2 [1][1])//baris ke 1 kolom ke 1
}
