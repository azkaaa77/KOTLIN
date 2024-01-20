fun main(){
  println("-----------------------------------------")
  println("Latihan review Array 2Dimensi: M Azka F")
  println("-----------------------------------------")

  //Deklarasi array langsung isi 2 baris 2 kolom
  val data1=arrayOf(intArrayOf(1, 4),intArrayOf(2, 5))
  val data2=arrayOf(arrayOf("One : ", "Pepaya"),arrayOf("Two : ", "Kelapa"))
  val data3=arrayOf(charArrayOf('1','b'),charArrayOf('2','c'))
  val data4=arrayOf(booleanArrayOf(5 > 2,false),booleanArrayOf(false,true))
  
  //Deklarasi array tanpa isi, 2 baris 2 kolom
  val data5=Array(2) {IntArray(2)}
  val data6=Array(2) {arrayOfNulls<String>(2)}
  val data7=Array(2) {CharArray(2)}
  val data8=Array(2) {BooleanArray(2)}
  //isi data array data 5
  data5[0][0]= 1 //baris ke 0 kolom ke 0
  data5[0][1]= 5 //baris ke 0 kolom ke 1
  data5[1][0]= 2 //baris ke 1 kolom ke 0
  data5[1][1]= 6 //baris ke 1 kolom ke 1
  
  //isi data array data 6
  data6[0][0]= "01. " //baris ke 0 kolom ke 0
  data6[0][1]= "Keju " //baris ke 0 kolom ke 1
  data6[1][0]= "02. " //baris ke 1 kolom ke 0
  data6[1][1]= "Kentang " //baris ke 1 kolom ke 1
  
  //isi data array data 7
  data7[0][0]= '1' //baris ke 0 kolom ke 0
  data7[0][1]= 'l' //baris ke 0 kolom ke 1
  data7[1][0]= '2' //baris ke 1 kolom ke 0
  data7[1][1]= 'p' //baris ke 1 kolom ke 1
  
  //isi data array data 8
  data8[0][0]= true //baris ke 0 kolom ke 0
  data8[0][1]= true //baris ke 0 kolom ke 1
  data8[1][0]= true //baris ke 1 kolom ke 0
  data8[1][1]= true //baris ke 1 kolom ke 1
  
  //bentuk lain tanpa isi,deklarasi Array
  val data9:Array<IntArray>
  val data10:Array<Array<String?>>
  val data11:Array<CharArray>
  val data12:Array<BooleanArray>

  //inisiasi jml.elemen array dan isi array data9
  data9 = Array(2) {IntArray(2)}
  data9[0][0]= 1 //baris ke 0 kolom ke 0
  data9[0][1]= 32 //baris ke 0 kolom ke 1
  data9[1][0]= 2 //baris ke 1 kolom ke 0
  data9[1][1]= 31 //baris ke 1 kolom ke 1

  //inisiasi jml.elemen array dan isi array data10
  data10 = Array(2) {arrayOfNulls(2)}
  data10[0][0]= "01. "//baris ke 0 kolom ke 0
  data10[0][1]= "Leci" //baris ke 0 kolom ke 1
  data10[1][0]= "02. " //baris ke 1 kolom ke 0
  data10[1][1]= "Rambutan" //baris ke 1 kolom ke 1

  //inisiasi jml.elemen array dan isi array data11
  data11 = Array(2) {CharArray(2)}
  data11[0][0]= '1' //baris ke 0 kolom ke 0
  data11[0][1]= 'A' //baris ke 0 kolom ke 1
  data11[1][0]= '2' //baris ke 1 kolom ke 0
  data11[1][1]= 'O' //baris ke 1 kolom ke 1

  //inisiasi jml.elemen array dan isi array data12
  data12 = Array(2) {BooleanArray(2)}
  data12[0][0]= false //baris ke 0 kolom ke 0
  data12[0][1]= true //baris ke 0 kolom ke 1
  data12[1][0]= false //baris ke 1 kolom ke 0
  data12[1][1]= true //baris ke 1 kolom ke 1

  //tampilkan Array data 1
  println("Tampilkan isi Array data1 :")
  for(baris in data1.indices) {
    for (kolom in data1[0].indices) {
      print(data1[baris][kolom])
      print(" ")
    }
    println("")
  }
  
  println("\nTampilkan isi Array data2 :")
  for(baris in data2.indices) {
    for (kolom in data2[0].indices) {
      print(data2[baris][kolom])
      print(" ")
    }
    println("")
  }
  
  println("\nTampilkan isi Array data3 :")
  for(baris in data3.indices) {
    for (kolom in data3[0].indices) {
      print(data3[baris][kolom])
      print(" ")
    }
    println("")
  }
  
  println("\nTampilkan isi Array data4 :")
  for(baris in data4.indices) {
    for (kolom in data4[0].indices) {
      print(data4[baris][kolom])
      print(" ")
    }
    println("")
  }
  
  println("\nTampilkan isi Array data5 :")
  for(baris in data5.indices) {
    for (kolom in data5[0].indices) {
      print(data5[baris][kolom])
      print(" ")
    }
    println("")
  }
  
  println("\nTampilkan isi Array data6 :")
  for(baris in data6.indices) {
    for (kolom in data6[0].indices) {
      print(data6[baris][kolom])
      print(" ")
    }
    println("")
  }
  
  println("\nTampilkan isi Array data7:")
  for(baris in data7.indices) {
    for (kolom in data7[0].indices) {
      print(data7[baris][kolom])
      print(" ")
    }
    println("")
  }
  
  println("\nTampilkan isi Array data8 :")
  for(baris in data8.indices) {
    for (kolom in data8[0].indices) {
      print(data8[baris][kolom])
      print(" ")
    }
    println("")
  }
  
  println("\nTampilkan isi Array data9 :")
  for(baris in data9.indices) {
    for (kolom in data9[0].indices) {
      print(data9[baris][kolom])
      print(" ")
    }
    println("")
  }
  
  println("\nTampilkan isi Array data10 :")
  for(baris in data10.indices) {
    for (kolom in data10[0].indices) {
      print(data10[baris][kolom])
      print(" ")
    }
    println("")
  }
  
  println("\nTampilkan isi Array data11 :")
  for(baris in data11.indices) {
    for (kolom in data11[0].indices) {
      print(data11[baris][kolom])
      print(" ")
    }
    println("")
  }
  
  println("Tampilkan isi Array data12 :")
  for(baris in data12.indices) {
    for (kolom in data12[0].indices) {
      print(data12[baris][kolom])
      print(" ")
    }
    println("")
  }
  
}