import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import kotlin.system.measureTimeMillis

val userDao = UserDao()
val firstSourceDao = FirstSourceDao()
val secondSourceDao = SecondSourceDao()

//fun main() = runBlocking {
//    val time = measureTimeMillis {
//        for (i in 1..1000) {
//            launch {
//                getUserData()
//                delay(1000L)
//                getUserDataFromOtherSide()
//            }
//        }
//    }
//    println(time)
//}


fun syncSomeInfo() = runBlocking {
    val time = measureTimeMillis {
        val users = userDao.getAllUserInfo()
        users.forEach { userInfo ->
            launch {
                val actualData = firstSourceDao.getDataActual(userInfo.login).associateBy { it.ticketId }
                val syncedData = secondSourceDao.getAlreadySyncData(userInfo.login)
                syncedData.forEach {
                    if (!actualData.containsKey(it.ticketId)) {
                        //Do it some think
                    }
                }
            }
        }
    }
//    logger.info { "syncInfo spend with coroutine $time" }
}

fun main() {
    val time = measureTimeMillis {
        for (i in 1..1000) {
            getUserData()
            getUserDataFromOtherSide()
        }
    }
    println(time)
}


fun getUserData() {

}

fun getUserDataFromOtherSide() {

}