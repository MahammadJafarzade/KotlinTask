//TIP Press <shortcut raw="SHIFT"/> twice to open the Search Everywhere dialog and type <b>show whitespaces</b>,
// then press <shortcut raw="ENTER"/>. You can now see whitespace characters in your code.
fun main() {
    var student1=Student("Mahammad", "Jafarzade", "999")
    val studentDetails = student1.ogrenciBilgileri(student1)
    println(studentDetails)

    var ders1=Ders("Math","5646")
    val dersDetallari=ders1.dersBilgileri(ders1)
    println(dersDetallari)
}

class Student(var ad:String, var soyad:String,var numara:String){
    fun ogrenciBilgileri(student:Student):String    {
        return("ad:${student.ad},soyad:${student.soyad},numara:${student.numara}")
    }
}
class Ders(var dersAd:String,var kredi:String){
    fun dersBilgileri(ders:Ders):String{
        return("Dersin adi:${ders.dersAd},kredi:${ders.kredi}")
    }
}
