package top.oatnil.dbmlfromjooq.core

import top.oatnil.dbmlfromjooq.core.Column.Companion.toColumn
import java.beans.Introspector
import java.beans.PropertyDescriptor
import java.lang.reflect.Method

fun Class<*>.toTableColumns(): List<Column> {
    return Introspector.getBeanInfo(this)
        .propertyDescriptors
        .filterNot { listOf("class", "value", "table").contains(it.name) }
        .map { it.toColumn() }
}

data class Column(
    val name: String,
    val dataType: String,
    val dataGetter: Method
) {
    companion object {
        fun PropertyDescriptor.toColumn(): Column {
            val dataType = propertyType.simpleName
            return Column(name, dataType, readMethod)
        }
    }
}