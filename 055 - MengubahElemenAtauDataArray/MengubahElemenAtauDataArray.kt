fun main(){
  val fruits = arrayOf<String>("Apple","Mango","Banana","Orange")
  val data1 = arrayOf(
    arrayOf("One :","Pepaya"),
    arrayOf("Two :", "Kelapa")
  )

  println("----------------------------------------------------")
  println("Latihan mengubah elemen atau data array : M Azka F")
  println("----------------------------------------------------")

  println("Data Sebelum di ubah / diatur :")
  println("Data Indeks [0]    : "+fruits[0])
  println("Data Indeks [0][1] : "+data1[0][1])

  fruits[0]="Water Mellon"

  data1[0][1]="Coconut"
  
  println("\nData Sesudah di ubah / diatur : ")
  println("Data Indeks [0]    : "+fruits[0])
  println("Data Indeks [0][1] : "+data1[0][1])
  
}
