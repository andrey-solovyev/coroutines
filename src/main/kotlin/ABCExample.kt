import kotlinx.coroutines.delay
import java.time.LocalDateTime

suspend fun main() {
    a()
}

suspend fun a() {
    println("Start work fun a() ${LocalDateTime.now()}")
    b()
    println("Finish work fun a() ${LocalDateTime.now()}")
}

suspend fun b() {
    println("Start work fun b() ${LocalDateTime.now()}")
    c()
    println("Finish work fun b() ${LocalDateTime.now()}")
}

suspend fun c() {
    println("Start work fun c() ${LocalDateTime.now()}")
    delay(3000L)
    println("Finish work fun c() ${LocalDateTime.now()}")
}


//Start work fun a() 2023-12-02T14:17:51.659107600
//Start work fun b() 2023-12-02T14:17:51.660107
//Start work fun c() 2023-12-02T14:17:51.660107
//Finish work fun c() 2023-12-02T14:17:54.678067900
//Finish work fun b() 2023-12-02T14:17:54.679070100
//Finish work fun a() 2023-12-02T14:17:54.679070100