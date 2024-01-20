fun main(){
  val fruits = arrayOf<String>("Apple","Mango","Banana","Orange")

  println("--------------------------------------------------------------------")
  println("Latihan mengakses array dengan fungsi [get() dan set ()] : M Azka F")
  println("--------------------------------------------------------------------")

  println (fruits.get(0))
  println (fruits.get(3))

  //Tetapkan nilai pada indeks ke-3
  fruits.set(3, "Guava")
  println(fruits.get(3))
}  