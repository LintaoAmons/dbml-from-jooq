package top.oatnil.dbmlfromjooq.core

import org.jooq.DSLContext
import org.jooq.Record
import org.jooq.impl.TableImpl
import org.springframework.stereotype.Component

@Component
class DbmlFromJooqTool(val dslContext: DSLContext) {
    fun generate(tables: List<TableImpl<*>>): String {
        return tables.joinToString("\n") { it.generateDBML(dslContext).render() }
    }

    companion object {
        fun generate(records: List<Record?>): String {
            return records
                .mapNotNull { if (it == null) println("there's record == null"); it }
                .joinToString("\n") { it.generateDBML().render() }
        }
    }
}