fun main(){
  println("-----------------------------------------")
  println("Latihan review Array 1Dimensi: M Azka F")
  println("-----------------------------------------")

  //Deklarasi array langsung isi
  val data1=intArrayOf(1,2,3,4)
  val data2=arrayOf("Jeruk","Pepaya","Anggur","Kelapa")
  val data3=charArrayOf('l','p')
  val data4=booleanArrayOf(5 > 2,false)
  
  //Deklarasi array tanpa isi
  val data5=IntArray(2)
  val data6=arrayOfNulls<String>(2)
  val data7=CharArray(2)
  val data8=BooleanArray(2)
  //isi data array data 5
  data5[0]=5
  data5[1]=6
  //isi data array data 6
  data6[0]="Keju"
  data6[1]="Kentang"
  //isi data array data 7
  data7[0]='l'
  data7[1]='p'
  //isi data array data 8
  data8[0]=true
  data8[1]=5 == 5

  //bentuk lain tanpa isi,deklarasi Array
  val data9:IntArray
  val data10:Array<String?>
  val data11:CharArray
  val data12:BooleanArray

  //inisiasi jml.elemen array dan isi array data9
  data9=IntArray(2)
  data9[0]=34
  data9[1]=31

  //inisiasi jml.elemen array dan isi array data10
  data10=arrayOfNulls(2)
  data10[0]="Leci"
  data10[1]="Rambutan"

  //inisiasi jml.elemen array dan isi array data11
  data11=CharArray(2)
  data11[0]='A'
  data11[1]='O'

  //inisiasi jml.elemen array dan isi array data12
  data12=BooleanArray(2)
  data12[0]=false
  data12[1]=true

  //tampilkan Array
  println("Tampilkan isi Array data1 :")
  for(i in data1.indices) {
    println(data1[i])
  }
  
  println("\nTampilkan isi Array data2 :")
  for(i in data2.indices) {
    println(data2[i])
  }
  
  println("\nTampilkan isi Array data3 :")
  for(i in data3.indices) {
    println(data3[i])
  }
  
  println("\nTampilkan isi Array data4 :")
  for(i in data4.indices) {
    println(data4[i])
  }
  
  println("\nTampilkan isi Array data5 :")
  for(i in data5.indices) {
    println(data5[i])
  }
  
  println("\nTampilkan isi Array data6 :")
  for(i in data6.indices) {
    println(data6[i])
  }
  
  println("\nTampilkan isi Array data7 :")
  for(i in data7.indices) {
    println(data7[i])
  }
  
  println("\nTampilkan isi Array data8 :")
  for(i in data8.indices) {
    println(data8[i])
  }
  
  println("\nTampilkan isi Array data9 :")
  for(i in data9.indices) {
    println(data9[i])
  }
  
  println("\nTampilkan isi Array data10 :")
  for(i in data10.indices) {
    println(data10[i])
  }
  
  println("\nTampilkan isi Array data11 :")
  for(i in data11.indices) {
    println(data11[i])
  }
  
  println("\nTampilkan isi Array data12 :")
  for(i in data12.indices) {
    println(data12[i])
  }
}