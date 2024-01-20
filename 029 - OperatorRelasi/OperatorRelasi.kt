fun main(){
var operand1:Int; var operand2:Int; var hasilOperasi:Boolean

println("------------------------------")
println("Latihan Operator Relasi / Perbandingan : M Azka F")
println("------------------------------")

operand1 = 10; operand2 = 20;
hasilOperasi = (operand1 < operand2)
println("Operasi Relasi < :\nHasil Operasi,$operand1 < $operand2 = $hasilOperasi\n")

operand1 = 20; operand2 = 20;
hasilOperasi = (operand1 > operand2)
println("Operasi Relasi > :\nHasil Operasi,$operand1 > $operand2 = $hasilOperasi\n")

operand1 = 30; operand2 = 20;
hasilOperasi = (operand1 >= operand2)
println("Operasi Relasi >= :\nHasil Operasi,$operand1 >= $operand2 = $hasilOperasi\n")

operand1 = 40; operand2 = 20;
hasilOperasi = (operand1 <= operand2)
println("Operasi Relasi <= :\nHasil Operasi,$operand1 <= $operand2 = $hasilOperasi\n")

operand1 = 50; operand2 = 50;
hasilOperasi = (operand1 == operand2)
println("Operasi Relasi == :\nHasil Operasi,$operand1 == $operand2 = $hasilOperasi\n")

operand1 = 50; operand2 = 50;
hasilOperasi = (operand1 != operand2)
println("Operasi Relasi != :\nHasil Operasi,$operand1 != $operand2 = $hasilOperasi\n")
}