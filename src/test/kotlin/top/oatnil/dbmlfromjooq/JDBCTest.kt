package top.oatnil.dbmlfromjooq

import org.junit.jupiter.api.Test
import java.sql.DriverManager
import java.sql.SQLException


class JDBCTest {

    @Test
    fun `test connection`() {
        val jdbcUrl = "jdbc:postgresql://localhost:5433/dvdrental"
        val username = "db-user"
        val password = "my-password"
        try {
            val connection = DriverManager.getConnection(jdbcUrl, username, password)
            val sql = "SELECT * FROM actor;"
            val statement = connection.createStatement()
            val res = statement.executeQuery(sql)
            println(res)
        } catch (e: SQLException) {
            System.err.format("SQL State: %s\n%s", e.sqlState, e.message)
        }
    }
}
