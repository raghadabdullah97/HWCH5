import kotlin.random.Random
import kotlin.random.nextInt

// All the code in ch5 :


/* fun main(args: Array<String>) {

    // p67 , Ex1 :
    /* val numLetters = "good morning " .count({numLetters -> //print (number of letters)
        numLetters == 'o' })

    println(numLetters) */

    //================================================================

    //P68 , Ex2 :
    /* println( // call to println. Inside the parentheses
            {
                val currentYear = 2018
                "Welcome to SimVillage, Mayor! copyright( $currentYear)"  }()  )

*/
    //============================================================================================

    //P69 , Ex3 :
// "Fun Type " :
    /* val greetingFunction: () -> String = { //declare a variable with its name followed by a colon and its type.
        val currentYear = 2018
        "Welcome to SimVillage, Mayor! (copyright $currentYear)"
    }

    println(greetingFunction()) */

    //=============================================================================================

    //P 71 , Ex4 :
    // " Fun arguments " :

    /* val greetingFunction: (String) -> String = { playerName ->  //The parameters an anonymous function accepts are indicated by type in the function type
definition and then named in the anonymous function’s definition.
        val currentYear = 2018
        "Welcome to SimVillage, $playerName! (copyright $currentYear)" }
    println(greetingFunction("Guyal")) */

    //=============================================================================================

    //P72 , Ex5 :
// "The it keyword" :


    /* val greetingFunction: (String) -> String = {
        val currentYear = 2018
        "Welcome to SimVillage, $it! (copyright $currentYear)" //defining anonymous functions that accept exactly one argument, the it keyword is available as
a convenient alternative to specifying the parameter name
    }
    println(greetingFunction("Guyal")) */

    //=================================================================================================

     //P73 , Ex6 :
     // "Accepting multiple arguments " :


    /* val greetingFunction: (String, Int) -> String = { playerName, numBuildings ->
        val currentYear = 2018
        println("Adding $numBuildings houses") //The expression now declares two parameters, playerName and numBuildings, and accepts two
arguments when called
        "Welcome to SimVillage, $playerName! (copyright $currentYear)"
    }
    println(greetingFunction("Guyal", 2)) */
    //===============================================================================================


 */



    //P74 , Ex7 :
// " Type inference support " :



   /* val greetingFunction = { playerName: String, numBuildings: Int ->
        val currentYear = 2018
        println("Adding $numBuildings houses")
        "Welcome to SimVillage, $playerName! (copyright $currentYear)"
    }
    println(greetingFunction("Guyal", 2)) */ // greetingFunction variable to use type inference by including types for each parameter in the anonymous function.

    //======================================================================================= */







    //P75 , Ex8 :
// " Defining a fun that accepts a fun  " :

//creat main fun :
/*fun main() {
    /* val greetingFunction = { playerName: String, numBuildings: Int ->
        val currentYear = 2018
        println("Adding $numBuildings houses")
        "Welcome to SimVillage, $playerName! (copyright $currentYear)"
    }

    runSimulation("Guyal", greetingFunction) //call
}

fun runSimulation(playerName: String, greetingFunction: (String, Int) -> String) { //take shape fun main
    val numBuildings = Random.nextInt(1..3)
    println(greetingFunction(playerName, numBuildings))
 */
//===========================================================================

//P76 , Ex9 :

 // all changes were on how it is called

   /* runSimulation("Guyal") { playerName, numBuildings ->
        val currentYear = 2018
        println("Adding $numBuildings houses")
        "Welcome to SimVillage, $playerName! (copyright $currentYear)"
    }}

fun runSimulation(playerName: String, greetingFunction: (String, Int) -> String) {
    val numBuildings = Random.nextInt(1..3)
    println(greetingFunction (playerName, numBuildings))
}  */ //form main
//=========================================================================================
*/





// P77 , Ex 10 :
// from Decompile :
/*public final class MainKt {
    public static final void runSimulation(@NotNull String playerName, @NotNull Function2 greetingFunction) {
        int $i$f$runSimulation = 0;
        Intrinsics.checkNotNullParameter(playerName, "playerName");
        Intrinsics.checkNotNullParameter(greetingFunction, "greetingFunction");
        Random var10000 = (Random)Random.Default;
        byte var4 = 1;
        int numBuildings = RandomKt.nextInt(var10000, new IntRange(var4, 3));
        Object var6 = greetingFunction.invoke(playerName, numBuildings);
        boolean var5 = false;
        System.out.println(var6);
    }
}*/
// copmplate Ex10 :
/* inline fun runSimulation(
    playerName: String,
    costPrinter: (Int) -> Unit,


    greetingFunction: (String, Int) -> String
) {
    val numBuildings = Random.nextInt(1..3)
    costPrinter(numBuildings)

    println(greetingFunction(playerName, numBuildings))
}
fun printConstructionCost(numBuildings: Int) {
    val cost = 500
    println("construction cost: ${cost * numBuildings}")
}
fun main() {
    runSimulation("Guyal", ::printConstructionCost) { playerName, numBuildings ->
        val currentYear = 2018
        println("Adding $numBuildings houses")
        "Welcome to SimVillage, $playerName! (copyright $currentYear)"
    }
} */



//======================================================================================================



//P80 , Ex11 :
//"Fun type as return type" :

fun main() {
    runSimulation()

}

fun runSimulation() {
    val greetingFunction = configureGreetingFunction()
    println(greetingFunction("Guyal"))
}
fun configureGreetingFunction(): (String) -> String {
    val structureType = "hospitals"
    var numBuildings = 5
    return { playerName: String ->
        val currentYear = 2018
        numBuildings += 1
        println("Adding $numBuildings $structureType")
        "Welcome to SimVillage, $playerName! (copyright $currentYear)"
    }
}
























