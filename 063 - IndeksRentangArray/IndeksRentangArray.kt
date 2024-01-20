fun main (){
val dataBuah=arrayOf(
  arrayOf("1. ","Apel"),
  arrayOf("2. ","Jeruk"),
  arrayOf("3. ","Mangga")
)

  println("-----------------------------------------")
  println("Latihan indeks rentang Array : M Azka F")
  println("-----------------------------------------")

  println("Indeks rentang dari data Array fruits : "+(dataBuah.indices))
  println("Indeks rentang BARIS dari data Array fruits dataBuah : "+(dataBuah.indices))
  println("Indeks rentang KOLOM dari data Array fruits dataBuah : "+(dataBuah[0].indices))
}