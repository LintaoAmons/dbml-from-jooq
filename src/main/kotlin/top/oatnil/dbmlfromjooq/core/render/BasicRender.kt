package top.oatnil.dbmlfromjooq.core.render

import top.oatnil.dbmlfromjooq.core.Column
import top.oatnil.dbmlfromjooq.core.DBML


class BasicRender : Render {
    override fun render(dbml: DBML): String {
        return "TABLE ${dbml.tableName} {\n ${dbml.columns?.render()} \n}\n"
    }

    private fun List<Column>.render(): String {
        return this.joinToString("\n") { it.renderColumn() }
    }

    private fun Column.renderColumn(): String {
        return "$name $dataType [note: \"sample data: $dataValue\"]"
    }

}