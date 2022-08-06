package top.oatnil.dbmlfromjooq.core

interface Render {
    fun render(dbml: DBML): String
}