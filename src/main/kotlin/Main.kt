fun main() {
    var person=Human("kaitlin",25,60)
    person.eat(3)
   println( person.weight)

    person.Speak("my name is Juliet")
    person.birthday(1)
    println(person.age)

    var userDetail=User("Juliet","Olieng","anyangojolieng@gmail.com",718492299,"juliet254")
    println(userDetail.firstName)
    println(userDetail.email)
}
//question one
class Human(var name:String,var age:Int,var weight:Int) {
    //part one
    fun eat(foodWeight: Int) {
       weight+= foodWeight

       println("i am eating $foodWeight kgs of food")
    }
    //part two
    fun Speak(speech: String) {
        println(speech)
    }
    //part three
    fun birthday(birthday: Int){
         age += birthday
    }
}


        // question two

data class User(var firstName:String, var lastName:String,var email:String,var phoneNumber:Int,var passWord:String){

}
