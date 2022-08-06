package top.oatnil.dbmlfromjooq.demo

import org.jooq.DSLContext
import org.jooq.Record
import org.jooq.impl.TableImpl
import org.reflections.Reflections
import org.reflections.scanners.SubTypesScanner
import org.reflections.util.ClasspathHelper
import org.reflections.util.ConfigurationBuilder
import org.reflections.util.FilterBuilder
import org.springframework.stereotype.Component
import top.oatnil.dbmlfromjooq.core.columns
import top.oatnil.dbmlfromjooq.core.selectAny
import top.oatnil.dbmlfromjooq.core.tableName
import top.oatnil.dbmlfromjooq.demo.generated.tables.Actor.Companion.ACTOR

@Component
class Usecase(val dslContext: DSLContext) {
    fun `specific Table to columns`() {
        val actorRecord = ACTOR.selectAny(dslContext)
        println(actorRecord?.columns())
        println(actorRecord?.tableName())
    }
    fun demo() {

    }

    fun `use refection to find all tables`() {
        val packageName = "top.oatnil.dbmlfromjooq.demo.generated.tables"
        val typeList = findTables(packageName)

        typeList?.forEach { c ->
            val newInstance = c.getConstructor().newInstance()
            val record: Record? = newInstance.selectAny(dslContext)
            val columns = record?.columns()
            val tableName = record?.tableName()
            println("columns: ${columns},\n tableName: $tableName")
        }
    }

    private fun findTables(packageName: String): Set<Class<out TableImpl<*>>>? {
        // will get more tables than it should, jooq generate more tables class than table
        val reflections =
            Reflections(
                ConfigurationBuilder()
                    .filterInputsBy(FilterBuilder().includePackage(packageName))
                    .setUrls(ClasspathHelper.forPackage(packageName))
                    .setScanners(SubTypesScanner(false))
            )
        return reflections.getSubTypesOf(TableImpl::class.java)
    }

}

// table -> dbml

