package bot

import java.util.Scanner

val scanner = Scanner(System.`in`) // Do not change this line

fun main() {
   greet("OceanOS", "2021") // change it as you need
   remindName()
   guessAge()
   count()
   test()
   end()
}

fun greet(assistantName: String, birthYear: String) {
   println("Mahalo! My name is ${assistantName}.")
   println("I was created in ${birthYear}.")
   println("Please, remind me your name.")
}

fun remindName() {
   val name = scanner.nextLine()
   println("That's a very unique name, ${name}!")
}

fun guessAge() {
   println("Let me guess your age.")
   println("Enter remainders of dividing your age by 3, 5 and 7.")
   val rem3 = scanner.nextInt()
   val rem5 = scanner.nextInt()
   val rem7 = scanner.nextInt()
   val age = (rem3 * 70 + rem5 * 21 + rem7 * 15) % 105
   println("Is your age ${age}? Hope I guessed lucky!")
}

fun count() {
   println("Now I will prove to you that I can count to any number you want.")
   val num = scanner.nextInt()
   for (i in 0..num) {
      print(i)
      println("!")
   }
}

fun test() {
   println("Let's test your programming knowledge.")
   println("Why do we use methods?")

   println("1. To repeat a statement multiple times.")
   println("2. To decompose a program into several small subroutines.")
   println("3. To determine the execution time of a program.")
   println("4. To interrupt the execution of a program.")

   do {
      val i = scanner.nextInt()
      if (i != 2) {
         println("Please, try again.")
      }
   } while (i != 2)
}

fun end() {
   println("Congratulations, you got it! Have a nice day!") // Do not change this text
}