import java.util.*

fun main(){

  println("---------------------------------------------------- ---")
  println("Latihan mengakses seluruh Class pada Package : M Azka F")
  println("--------------------------------------------------------")

  //Membuat objek/variabel
  val rand = Random()
  //membuat objek/variabel scanner baru
  val inputKeyboard = Scanner(System.`in`)

  print("NOMER ACAK\n")
  print("Masukan Nilai MIN : ")
  //Menggunakan scanner dan menyimpan apa yang diketik kedalam variabel nilai_awal
  val nilai_awal = inputKeyboard.nextInt()
  
  print("Masukan Nilai MAX : ")
  //Menggunakan scanner dan menyimpan apa yang diketik kedalam variabel nilai_akhir
  val nilai_akhir = inputKeyboard.nextInt()

  //Menggunakan objek/variabel rand untuk mengambil nilai acak
  val nomerAcak = rand.nextInt(nilai_akhir - nilai_awal + 1)+nilai_awal
  println("Nilai Acak : $nomerAcak")
}