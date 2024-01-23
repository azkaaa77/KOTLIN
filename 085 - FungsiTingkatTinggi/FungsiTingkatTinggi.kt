fun main(){
  val a:Int=5;
  val b:Int=7;

  println("-----------------------------------------")
  println("Latihan Fungsi Tingkat Tinggi : M Azka F")
  println("-----------------------------------------")

  //Pemanggilan fungsi
  val result = calculate(a,b, :: sum)
  println("Hasil $a + $b :"+result)
  }
  //Fungsi penjumlahan
  fun sum(a:Int,b:Int) = a+b

  //Contoh fungsi berparameter yang memanggil fungsi didalam parameternya
  fun calculate(a:Int,b:Int, operation:(Int,Int)->Int):Int{
    return operation(a,b)
  }