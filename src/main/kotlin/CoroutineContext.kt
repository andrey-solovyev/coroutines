import kotlinx.coroutines.*

fun main() = runBlocking(CoroutineName("Custom 1")) {
    println("CoroutineName: ${coroutineContext[CoroutineName]?.name} -> Started")
    // CoroutineName: Custom 1 -> Started

    launch {
        delay(1000)
        println("CoroutineName: ${coroutineContext[CoroutineName]?.name} -> Running first launch")
        // CoroutineName: Custom 1 -> Running first launch
    }

    launch(CoroutineName("Custom 2")) {
        delay(1000)
        println("CoroutineName: ${coroutineContext[CoroutineName]?.name} -> Running second launch")
        // CoroutineName: Custom 2 -> Running second launch
    }
    println("CoroutineName: ${coroutineContext[CoroutineName]?.name} -> Finish")
    // CoroutineName: Custom 1 -> Finish
}