fun main(){
  println("-----------------------------------")
  println("Latihan Fungsi Rekursif : M Azka F")
  println("-----------------------------------")

  //Memanggil fungsi yang mengandung rekursif
  tampilkanAngka(10)
  }

  //Contoh fungsi rekursif
  //adalah fungsi bertipe Unit
  fun tampilkanAngka(batas:Int,i:Int=1){
    println("Perulangan ke "+i)

    if (i < batas){
      //Disini lah rekursifitas itu terjadi
      tampilkanAngka(batas,i+1)
  }
}