class UserDao {
    fun getAllUserInfo(): List<UserInfo> {
        return listOf(UserInfo("login"))
    }
}

data class UserInfo(
    val login: String
)