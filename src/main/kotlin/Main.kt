import kotlinx.coroutines.*
import java.time.LocalDate
import java.time.LocalDateTime
import kotlin.coroutines.Continuation

fun main() {
    GlobalScope.launch {
        delay(1000L)
        println("I am on Habr!")
    }
    println("Mama,")
    Thread.sleep(2000L)
}
//Mama,
//I am on Habr!


fun main() {
    runBlocking {
        delay(1000L)
        println("I am on Habr,")
    }
    println("Mama!")
}
//I am on Habr!
//Mama,

suspend fun main(){
    val result1 = GlobalScope.async {
        delay(1000L)
        "Mama!"
    }
    val result2 = GlobalScope.async {
        delay(1000L)
        "I am on Habr!"
    }
    println(result1.await())
    println(result2.await())
//}
//Mama!
//I am on Habr!


//fun main() = runBlocking {
//    val myScope = CoroutineScope(Dispatchers.Default)
//    myScope.launch {
//        println("Hello Habr from coroutine!")
//    }
//    myScope.cancel()
//}
// Hello Habr from coroutine!
