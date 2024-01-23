fun main(){
  val a = 4

  println("----------------------------------------")
  println("Latihan Fungsi Rekursif Ekor : M Azka F")
  println("----------------------------------------")

  val result=factoria(a)
  println(result)
}

  //Fungsi reskursif
  fun factoria(a:Int,accum:Int=1):Int{
    val result = a * accum //operasi factorial
    return if (a <= 1){
      result
    }else{
      //Reskursif ekor
      factoria(a - 1,result)
   } 
}

