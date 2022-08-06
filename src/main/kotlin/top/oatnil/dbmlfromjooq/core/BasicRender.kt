package top.oatnil.dbmlfromjooq.core


class BasicRender : Render {
    override fun render(dbml: DBML): String {
        return "TABLE ${dbml.tableName} {\n ${dbml.columns?.render()} }"
    }

    private fun List<Column>.render(): String {
        return this.map { it.renderColumn() }.joinToString { "\n" }
    }

    private fun Column.renderColumn(): String {
        return "$name $dataValue [note: \"sample data: $dataValue\"]"
    }

}