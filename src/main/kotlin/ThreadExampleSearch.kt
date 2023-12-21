import kotlinx.coroutines.delay
import java.net.URL


    fun main() {
        for (i in 1..100000){
            Thread{
                println(i)
                Thread.sleep(10000L)
            }.start()
        }
//        val urls = listOf(
//            "http://example.com/resource1",
//            "http://example.com/resource2",
//            "http://example.com/resource3",
//            "http://example.com/resource4",
//            "http://example.com/resource5"
//        )
//        val results = mutableListOf<String>()
//        val threads = urls.map { url ->
//            Thread {
//                val content = URL(url).readText()
//                synchronized(results) {
//                    results.add(content)
//                }
//            }
//        }
//        threads.forEach { it.start() }
//        threads.forEach { it.join() }
    }

