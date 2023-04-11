fun main() {
println(numbers)
    println(num)
    println(numb)
    println(nu)
    println(letter)
    println(student)
    println(age)
    println(weight)
    println(citizenshipKenya)
    //OPERATERS
//Arithematic operaters
    var number1=23
    var number2=50
    var sum=number1+number2
    println(sum)
    var multication=number1*number2
    println(multication)
    var modulus=number1%number2
    println(modulus)
    var subtraction=number1-number2
    println(subtraction)
    var divition=number1/number2
    println(divition)
//Assignment Operators
    var age=19
    ++age
    println(age)
    var age1=30
    --age1
    println(age1)
    var a=124
    var b=432
    println(a<b)
    println(a>b)
    println(a>=b)
    println(a!=b)
    mutiple()
    addition(23,20.7)
    name("Ann","Anyango")
    names("Ada")
    println( remainder(30,20))
    println(addit(30,30))
    println(addit(21,20))

}
//1.NUMBERS DATA TYPES
//when using Byte the numbers should be in a renge of (-128_127)but when it exides it gives out an error
var numbers:Byte=122
var num:Short=1234
var numb:Int=23434
var nu:Long=345678
//CHARACTER(char)
//STRNGS(Strings)
var letter : String = "mkn"


////
//You are creating an app to capture student records. Some of the data you will
//capture includes full name, age, phone number, weight in kg and citizen. For the
//citizen field you will track whether a student is a Kenyan or not.
 var student:String="Ann"
var age:Byte=20
var phone:String="0721345667"
var weight:Double=60.5
var citizenshipKenya:Boolean=true

fun mutiple(){
    var a=21
    var b =34
    var multiple=b*a
    println(multiple)
}
fun addition(num1:Int,num2:Double){
    var sum=num1+num2
    println(sum)

}
fun name(nam1:String,nam2: String){
    var names=nam1+nam2
    println(names)


}
//Create and invoke a function that takes in a name and prints out “Hello ${name}” e.g
//given “Ada” it will print out “Hello Ada” (2 points)
//Create and invoke a function that given 2 numbers returns the remainder of their
//division (3 points)
//Create and invoke function that returns the sum of any given 4 numbers (3 points)
//Create and invoke a function that prints out an interesting fact about yourself
fun names(name:String){
println("Hello" + name)
}
fun remainder(numb1: Int,numb2: Int): Int{
    var remainder=numb1%numb2
    return remainder
}
fun addit(numbe1: Int,numbe2: Int): Int {
    var sums = numbe1 + numbe2
    return sums

}
//Strings



