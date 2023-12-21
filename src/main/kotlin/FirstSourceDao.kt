class FirstSourceDao {
    fun getDataActual(login: String): List<TicketInfo> {
        return listOf(TicketInfo(1L))
    }
}

class SecondSourceDao {
    fun getAlreadySyncData(login: String): List<TicketInfo> {
        return listOf(TicketInfo(2L))
    }
}

data class TicketInfo(
    val ticketId: Long
)