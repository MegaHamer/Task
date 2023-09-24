import kotlin.math.log

fun main() {
    //countChar() //подсчитывает количество подряд идущих одинаковых символов во введенной строке
    //twoTask() //подсчитывает количество различных символов во введенной строке
    //threeTask() //преобразует введенное пользователем натуральное число из 10-ичной системы в двоичную
    //fourTask() //пользователь, введя два числа и символ операции, узнает результат
    //fiveTask() //пользователь, введя целое число n и основание степени x узнает, существует ли целочисленный показатель степени y для которого выполняется равенство
    sixTask() //пользователь вводит две различных цифры. На выходе приложение выдает, если это возможно, из введенных цифр, нечетное число
}

fun sixTask(){
    print("Введите 2 цифры в строчку: ")
    val text = readln().filter { it.isDigit() }
    var ch1 =(text[0].toString()+text[1]).toInt()
    var ch2 =(text[1].toString()+text[0]).toInt()
    if (ch1.toInt() %2 == 1){
        print("Вывод: $ch1")
        if (ch2.toInt()%2 ==1){
            println(", $ch2")
        }
    }else{
        if (ch2%2==1){
            println("Вывод: $ch2")
        }
        else{
            println("Создать нечетное число невозможно")
        }
    }

}

fun fiveTask(){
    print("Введите целое число n:")
    val n=readln()
    print("Введите основание степени x: ")
    val x = readln()
    val y = log(n.toDouble(), x.toDouble())

    val prov = y.toInt().toDouble()
    if (prov == y){
        println("Loq$x $n = ${prov.toInt()}")
    } else{
        println("Целочисленный показатель не существует")
    }
}

fun fourTask(){
    print("Введите 2 числа и симовл опреации(+, -, /, *): ")
    val text = readln()
    var num1 = ""
    var num2 = ""
    var boo = true
    var tt= 0
    var op=""
    for (char in text.replace(" ", "")) {
        if (char.isDigit()) {
            if (boo) {
                num1 += char
            } else {
                num2 += char
            }
        } else if (char in setOf('+', '-', '*', '/')) {
            op += char
            boo = false
        }
    }
    var res=0
    when (op){
        "+"->res= num1.toInt() +num2.toInt()
        "-"->res= num1.toInt() -num2.toInt()
        "/"->res= num1.toInt() /num2.toInt()
        "*"->res= num1.toInt() *num2.toInt()
    }
    println("Результат: $res")
}

fun threeTask(){
    print("Введите число в 10 с.с.: ")
    val ten = readln().toInt()
    val two = ten.toString(2)
    println("Число $ten в двоичной с.с. - $two")
}

fun twoTask(){
    print("Введите строку символов: ")
    val text = readln()
    var count = 0
    for (i in 'A' .. 'Z'){
        for (k in 0 .. text.length - 1){
            if (i.uppercase() == text[k].uppercase()){
                count++
            }
        }
        if (count > 0){
            println("$i - $count")
            count = 0
        }

    }
}

fun countChar(){
    print("Введите строку символов:")
    val text = readln()
    var count =1
    var itogStr =""
    var currentChar = text[0]

    for (i in text.substring(1) ) {
        if (currentChar == i){
            count++
        }else{
            if (count>1){
                itogStr+="$currentChar$count"
            }else{
                itogStr+="$currentChar"
            }
            currentChar=i
            count=1
        }
    }
    if (count>1){
        itogStr+="$currentChar$count"
    }else{
        itogStr+="$currentChar"
    }

    println("Результат - $itogStr")
}