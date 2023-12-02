import java.io.File

fun main(args: Array<String>) {
    readFilePart1(fileName = "src/main/resources/day01.txt")
}
fun readFilePart1(fileName: String){
    var sum=0;
    File(fileName).forEachLine { it ->
        val (digits,_) = it.partition { it.isDigit() }
        println(it+" "+ digits+" "+digits[0]+digits[digits.length-1]);
        sum+=(digits[0].digitToInt()*10+digits[digits.length-1].digitToInt());
    }
    println(sum);
}
fun readFilePart2(fileName: String){
    var sum=0;

    File(fileName).forEachLine { it ->
        val (digits,_) = it.partition { it.isDigit() }

    }
}

fun hasADigit(word: String){
    val StringToInt=HashMap<String,Int>()
    StringToInt["one"]=1;
    StringToInt["two"]=2;
    StringToInt["three"]=3;
    StringToInt["four"]=4;
    StringToInt["five"]=5;
    StringToInt["six"]=6;
    StringToInt["seven"]=7;
    StringToInt["eigth"]=8;
    StringToInt["nine"]=9;
wo
    StringToInt.forEach(


    )
}