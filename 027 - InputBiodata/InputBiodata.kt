fun main() {
    var nama_lengkap:String; var jenis_kelamin:String; var usia:Byte; var alamat:String; var sekolah:String;
    var kelas:String; var hobby:String; var cita_cita:String; var email:String; var medsos:String;

    println("-----------------------------------------------------")
    println("Latihan Input Data Biodata: M Azka F")
    println("-----------------------------------------------------")
    println("----------------FORM INPUT BIODATA-------------------")

    print("Isi Nama Lengkap : "); val input_nama_lengkap=readLine();
    nama_lengkap = input_nama_lengkap ?:"Nama Belum Di isi"

    print("Isi Jenis Kelamin : "); val input_jenis_kelamin=readLine();
    jenis_kelamin = input_jenis_kelamin ?:"Jenis Kelamin Belum Di isi"

    print("Isi Usia : "); val input_usia=readLine();
    usia = input_usia?.toByte()?:0

    print("Isi Alamat : "); val input_alamat=readLine();
    alamat = input_alamat ?:"Alamat Belum Di isi"

    print("Isi Sekolah : "); val input_sekolah=readLine();
    sekolah = input_sekolah ?:"Sekolah Belum Di isi"

    print("Isi Kelas : "); val input_kelas=readLine();
    kelas = input_kelas ?:"Kelas Belum Di isi"

    print("Isi Hobby: "); val input_hobby=readLine();
    hobby = input_hobby ?:"Hobby Belum Di isi"

    print("Isi Cita-Cita : "); val input_cita_cita=readLine();
    cita_cita = input_cita_cita ?:"Cita-Cita Belum Di isi"

    print("Isi E-mail : "); val input_email=readLine();
    email = input_email ?:"E-mail Belum Di isi"

    print("Isi Media Sosial : "); val input_medsos=readLine();
    medsos = input_medsos ?:"Media Sosial Belum Di isi"
    
    println("\n-----------------------------------------------------")
    println("Biodata Teman Baru, Telah Ditambahkan")
    println("-----------------------------------------------------")
    println("Nama Lengkap : $nama_lengkap")
    println("Jenis Kelamin : $jenis_kelamin")
    println("Usia : $usia")
    println("Alamat : $alamat")
    println("Sekolah : $sekolah")
    println("Kelas : $kelas")
    println("Hobby : $hobby")
    println("Cita-Cita : $cita_cita")
    println("E-mail : $email")
    println("Media Sosial : $medsos")
    println("-----------------------------------------------------")
}