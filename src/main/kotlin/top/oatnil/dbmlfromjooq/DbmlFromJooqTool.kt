package top.oatnil.dbmlfromjooq

import org.jooq.DSLContext
import org.jooq.Record
import org.jooq.impl.TableImpl
import top.oatnil.dbmlfromjooq.core.generateDBML

class DbmlFromJooqTool(private val dslContext: DSLContext) {
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