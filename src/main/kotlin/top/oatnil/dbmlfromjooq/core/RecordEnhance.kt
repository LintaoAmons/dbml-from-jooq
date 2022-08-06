package top.oatnil.dbmlfromjooq.core

import org.jooq.DSLContext
import org.jooq.Record
import top.oatnil.dbmlfromjooq.core.ColumnDefinition.Companion.toColumnDefinition
import java.beans.Introspector


fun Record.tableName(): String {
    return this::class.java.simpleName.replace("Record", "")
}

fun Record.columns(): List<Column> {
    return this::class.java.toColumns(this)
}

//fun Class<out Record>.selectAnyOne(dslContext: DSLContext): Record? {
//    return dslContext.selectFrom(this.tableName())
//        .limit(1)
//        .fetchAny()
//}

fun Class<out Record>.toColumnDefinitions(): List<ColumnDefinition> {
    return Introspector.getBeanInfo(this)
        .propertyDescriptors
        .filterNot { listOf("class", "value", "table", "SQLTypeName", "qualifier").contains(it.name) }
        .map { it.toColumnDefinition() }
}

fun Class<out Record>.toColumns(dataSource: Record): List<Column> {
    return this.toColumnDefinitions()
        .map { it.toColumn(dataSource) }
}
