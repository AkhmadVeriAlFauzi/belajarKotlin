package pertemuan2

fun main() {
    val namaDepan: String = "Veri"
    val namaBelakang = "Al Fauzi"
    var usia = 15
    usia = 20

    println("Hallo nama saya $namaDepan $namaBelakang Usia saya $usia") // $ merupakan string template

    //Nullable
    val text: String? = null
    var textLength = text?.length
    println(textLength)

    // Char
    // -- ++ , increment / decrement
    var vocal = 'A'
    println("Vocal = $vocal")
    println("Vocal = " + vocal++ )
    println("Vocal = " + vocal++ )
    println("Vocal = " + vocal-- )
    println("Vocal = " + vocal-- )

    val integerList = listOf(4,2,1,5,1,2)
    val integerSet = setOf(4,2,1,5,1,2)
    val capital = mapOf(
        "Jakarta" to "Indonesia",
        "London" to "England",
        "New Delhi" to "India"
    )

    println(integerList)
    println(integerList[4])
    println(integerSet)

    println(capital)
    println(capital["Jakarta"])

    val anyList = mutableListOf('A', "Kotlin",3,true)

    anyList.add('D')
    anyList.add(0, 12)
    println("MutableList = $anyList")


    //var = nilainya bisa diubah (imutable), jika ada 2 data ygg dideklarasikan itu bisa dan yg dibaca yg paling terakhir
    //val = nilainya tidak bisa diubah (mutable), tidak bisa melakukan seperti var, atau erorr
}