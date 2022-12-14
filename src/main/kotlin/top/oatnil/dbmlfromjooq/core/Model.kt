package top.oatnil.dbmlfromjooq.core

import org.jooq.Record
import top.oatnil.dbmlfromjooq.core.render.BasicRender
import top.oatnil.dbmlfromjooq.core.render.Render
import java.beans.PropertyDescriptor
import java.lang.reflect.Method

data class DBML(
    val tableName: String,
    val columns: List<Column>?,
    var render: Render? = BasicRender(),
) {
    fun render(): String {
        return render?.render(this)
            ?: throw RuntimeException("No render has been selected")
    }
}

data class Column(
    val name: String,
    val dataType: String,
    val dataValue: Any?,
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