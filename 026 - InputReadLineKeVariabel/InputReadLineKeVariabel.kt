fun main(){
    var nama:String
    var jenisKelamin:Char
    var usia:Int
    var alamat :String

    println("---------------------------")
    println("Latihan Input Data Ke Variabel : M Azka F")
    println("---------------------------")
    println("INPUT DATA: ")

    print("Input Nama: ")
    val InputDataNama = readLine()

    print("Input Jenis Kelamin(L/P): ")
    val InputDataJenisKelamin = readLine()

    print("Input Usia: ")
    val InputDataUsia = readLine()

    print("Input Alamat: ")
    val InputDataAlamat = readLine()

    nama = InputDataNama?:"Nama Belum Di Input"
    try{jenisKelamin = InputDataJenisKelamin?.get(0)?:'L'}catch(e:StringIndexOutOfBoundsException){jenisKelamin ='L'}
    try{usia = InputDataUsia?.toInt()?:0}catch(e:NumberFormatException){usia=0}
    alamat = InputDataAlamat?:"Alamat Belum Di Input"
    
    println("\n-----------------------------")
    println("\nBIODATA SINGKAT")
    println("Nama : $nama")
    println("Jenis Kelamin : $jenisKelamin")
    println("Usia : $usia")
    println("Alamat : $alamat")
    println("-----------------------------")
}