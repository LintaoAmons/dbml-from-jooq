package top.oatnil.dbmlfromjooq.core

import org.jooq.DSLContext
import org.jooq.Record
import org.jooq.Table
import org.jooq.impl.TableImpl
import org.springframework.stereotype.Component

@Component
class DbmlFromJooqTool(val dslContext: DSLContext) {
    fun generate(tables: List<TableImpl<*>>): String {
        return tables.joinToString("\n") { it.generateDBML(dslContext).render() }
    }

    companion object {
        fun generate(records: List<Record>) {
            TODO()
        }
    }


    private fun <R : Record?> Table<R>.selectAnyOne(): R {

        return dslContext.selectFrom(this)
            .limit(1)
            .fetchOptional()
            .orElse(null)
    }
}