package top.oatnil.dbmlfromjooq.core

import org.jooq.Record

fun Record.tableName(): String {
    return this::class.java.simpleName.replace("Record", "")
}

fun Record.columns(): List<Column> {
    return this::class.java.toTableColumns()
}

