package top.oatnil.dbmlfromjooq.demo

import org.jooq.DSLContext
import org.jooq.Record
import org.jooq.Table
import org.springframework.stereotype.Component
import top.oatnil.dbmlfromjooq.core.columns
import top.oatnil.dbmlfromjooq.core.tableName
import top.oatnil.dbmlfromjooq.demo.generated.tables.references.ACTOR

@Component
class Usecase(val dslContext: DSLContext) {
    fun demo() {
        val actorRecord = ACTOR.selectAny()
        println(actorRecord?.columns())
        println(actorRecord?.tableName())
    }

    private fun <R : Record> Table<R>.selectAny(): R? {
        return dslContext.selectFrom(this)
            .limit(1)
            .fetchAny()
    }
}

// table -> dbml

