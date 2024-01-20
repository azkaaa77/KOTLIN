fun main(){
  val fruits = arrayOf<String>("Apple","Mango","Banana","Orange","Apple")
  val foods = arrayOf<String>("KFC","Burger","Pizza","Potato Chip")

  println("-----------------------------------------------")
  println("Latihan menghapus elemen dari array : M Azka F")
  println("-----------------------------------------------")

  println("Data array sebelum di hapus : ")
  for(item in fruits){
    print(item + " | ")
  }
  println()

  for(item in foods){
    print(item + " | ")
  }
  println()

  val result1=fruits.drop(2)//menghilangkan 2 indeks elemen pertama
  val result2=foods.dropLast(2)//menghilangkan 2 indeks elemen terakhir

  println("\nData Array sesudah di hapus : ")
  for(item in result1){
    print(item+ " | ")
  }
  println()
  
  for(item in result2){
    print(item+ " | ")
  }
}  