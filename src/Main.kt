/*
    ..-18.4     >> weak
    18.5-24.9   >> normal
    25-..       >> overweight
    bmi = w / (h * h)
 */

fun main() {
    val height : Float = 1.79F
    val weight : Int = 71
    val bmi : Float = weight / (height * height)
    println("Your BMI is $bmi")
    var res : String = ""
    if (bmi <= 18.4)
        res = "weak"
    else if (bmi <= 24.9)
        res = "normal"
    else
        res = "overweight"
    println("You are in $res range.")
}