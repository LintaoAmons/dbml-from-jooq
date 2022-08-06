package top.oatnil.dbmlfromjooq.core

import org.jooq.Record
import java.beans.PropertyDescriptor
import java.lang.reflect.Method

data class Column(
    val name: String,
    val dataType: String,
    val dataValue: Any,
)

data class ColumnDefinition(
    val name: String,
    val dataType: String,
    val dataGetter: Method
) {
    companion object {
        fun PropertyDescriptor.toColumnDefinition(): ColumnDefinition {
            val dataType = propertyType.simpleName
            return ColumnDefinition(name, dataType, readMethod)
        }
    }

    fun toColumn(sampleDataSource: Record): Column {
        return Column(
            name = name,
            dataType = dataType,
            dataValue = dataGetter.invoke(sampleDataSource)
        )
    }
}