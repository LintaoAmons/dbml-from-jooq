package top.oatnil.dbmlfromjooq.core

import org.jooq.DSLContext
import org.jooq.Record
import org.jooq.Table
import org.springframework.stereotype.Component

@Component
class DbmlFromJooqTool(val dslContext: DSLContext) {
    fun generate(packageName: String): String {
        return "todo"
    }


    private fun <R : Record?> Table<R>.selectAnyOne(): R {

        return dslContext.selectFrom(this)
            .limit(1)
            .fetchOptional()
            .orElse(null)
    }
}