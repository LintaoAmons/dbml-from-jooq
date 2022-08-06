package top.oatnil.dbmlfromjooq.demo

import org.jooq.DSLContext
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import org.mockito.InjectMocks
import org.mockito.Mock
import org.mockito.junit.jupiter.MockitoExtension

@ExtendWith(MockitoExtension::class)
internal class UsecaseUnitTest {
    @Mock
    lateinit var dslContext: DSLContext

    @InjectMocks
    lateinit var usecase: Usecase

    @Test
    fun `testDemo`() {
        usecase.demo()

    }
}