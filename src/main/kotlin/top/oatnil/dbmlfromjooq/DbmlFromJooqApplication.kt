package top.oatnil.dbmlfromjooq

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.CommandLineRunner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import top.oatnil.dbmlfromjooq.demo.Usecase

@SpringBootApplication
class DbmlFromJooqApplication : CommandLineRunner {
    @Autowired
    lateinit var usecase: Usecase

    override fun run(vararg args: String?) {
        usecase.demo()
    }
}

fun main(args: Array<String>) {
    runApplication<DbmlFromJooqApplication>(*args)
}
