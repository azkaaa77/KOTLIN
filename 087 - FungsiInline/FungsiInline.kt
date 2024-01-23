fun main(){

  println("---------------------------------")
  println("Latihan Fungsi Inline : M Azka F")
  println("---------------------------------")

  myFunction( {println("Inline function parameter\n")})
  myFunction( {jumlahkan(5,6)})
}

//inline fungsi
  inline fun myFunction(isiFungsi:()->Unit){
    println("I am Inline function - A")
    isiFungsi()
  }

  fun jumlahkan(a:Int, b:Int)=println("Hasil $a + $b :"+(a + b))