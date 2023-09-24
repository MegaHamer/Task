fun main() {
    //countChar()
    //twoTask()
    threeTask()
}

fun threeTask(){
    print("Введите число в 10 с.с.: ")
    val ten = readln().toInt()
    val two = ten.toString(2)
    println("Число $ten в двоичной с.с. - $two")
}

fun twoTask(){
    print("Введите строку символов: ")
    var text = readln()
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
    var text = readln()
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