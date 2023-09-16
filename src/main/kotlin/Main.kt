fun main() {
    //countChar()
    twoTask()
}

fun twoTask(){

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