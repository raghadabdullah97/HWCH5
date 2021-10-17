// Exceptions 1
/* val x = 10
val z = 0
fun main() {
    println(x/z) // now if run the code i see our code crashed and i am getting an arithmetic exception
} */

//=============


// Exceptions 2

fun main() {
   try {  // is divided by zero so what happens is you create a try block and inside try block you put the code , that may raise an exception now if any exception is raised inside the try block the exception of the try block will stope from that line and you will immediately go inside catch block so here
       println(2/0)
       println("hello")
       println("hello2")
   }catch ( e: ArithmeticException){
       println("inside catch block ")
println(e.message)

   }


}
