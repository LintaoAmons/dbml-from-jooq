package top.oatnil.dbmlfromjooq.demo

import org.jooq.DSLContext
import org.springframework.stereotype.Component
import top.oatnil.dbmlfromjooq.core.columns
import top.oatnil.dbmlfromjooq.core.selectAny
import top.oatnil.dbmlfromjooq.core.tableName
import top.oatnil.dbmlfromjooq.demo.generated.tables.references.ACTOR

@Component
class Usecase(val dslContext: DSLContext) {
    fun demo() {
        val actorRecord = ACTOR.selectAny(dslContext)
        println(actorRecord?.columns())
        println(actorRecord?.tableName())
    }

}

// table -> dbml

