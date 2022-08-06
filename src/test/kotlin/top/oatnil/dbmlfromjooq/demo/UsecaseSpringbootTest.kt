package top.oatnil.dbmlfromjooq.demo

import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
internal class UsecaseSpringbootTest {
    @Autowired
    lateinit var usecase: Usecase

    @Test
    fun `testDemo`() {
        usecase.demo()
    }
}