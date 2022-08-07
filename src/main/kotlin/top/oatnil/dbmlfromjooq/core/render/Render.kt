package top.oatnil.dbmlfromjooq.core.render

import top.oatnil.dbmlfromjooq.core.DBML

interface Render {
    fun render(dbml: DBML): String
}