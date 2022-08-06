package top.oatnil.dbmlfromjooq.demo

import org.jooq.DSLContext
import org.springframework.stereotype.Component
import top.oatnil.dbmlfromjooq.core.columns
import top.oatnil.dbmlfromjooq.core.tableName
import top.oatnil.dbmlfromjooq.demo.generated.DefaultSchema.Companion.DEFAULT_SCHEMA
import top.oatnil.dbmlfromjooq.demo.generated.tables.records.ActorRecord

@Component
class Usecase(val dslContext: DSLContext) {
    fun demo() {
        val actorRecord: ActorRecord = dslContext.selectFrom(DEFAULT_SCHEMA.ACTOR)
            .limit(1)
            .fetchAny()!!
        println(actorRecord.columns())
        println(actorRecord.tableName())
    }
}
