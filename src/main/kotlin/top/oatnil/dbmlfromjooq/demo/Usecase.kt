package top.oatnil.dbmlfromjooq.demo

import org.jooq.DSLContext
import org.springframework.stereotype.Component
import top.oatnil.dbmlfromjooq.demo.generated.DefaultSchema.Companion.DEFAULT_SCHEMA

@Component
class Usecase(val dslContext: DSLContext) {
    fun demo() {
        val actorRecord = dslContext.selectFrom(DEFAULT_SCHEMA.ACTOR)
            .limit(1)
            .fetchAny()
        println(actorRecord)
    }
}
