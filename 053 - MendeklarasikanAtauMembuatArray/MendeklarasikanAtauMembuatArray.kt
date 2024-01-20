fun main(){
  val buah = arrayOf<String>("Kelapa","Rambutan")
  val nomer = arrayOf<Int>(2,3,4)
  val logika = arrayOf<Boolean>(true, (2>1),false)
  val gender = arrayOf<Char>('l','p')

  println("------------------------------------------------------")
  println("Latihan mendeklarasikan atau membuat array : M Azka F")
  println("------------------------------------------------------")

  println("Array String: ")
  print(buah[0]);print(" ");print(buah[1])
  println()

  println("\nArray Int: ")
  print(nomer[0]);print(" ");print(nomer[1]);print(" ");print(nomer[2])
  println()

  println("\nArray Boolean: ")
  print(logika[0]);print(" ");print(logika[1]);print(" ");print(logika[2])
  println()

  println("\nArray Char: ")
  print(gender[0]);print(" ");print(gender[1])
  println()

}