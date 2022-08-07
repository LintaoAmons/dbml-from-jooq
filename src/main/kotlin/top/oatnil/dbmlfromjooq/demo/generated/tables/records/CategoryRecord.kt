/*
 * This file is generated by jOOQ.
 */
package top.oatnil.dbmlfromjooq.demo.generated.tables.records


import java.time.LocalDateTime

import org.jooq.Field
import org.jooq.Record1
import org.jooq.Record3
import org.jooq.Row3
import org.jooq.impl.UpdatableRecordImpl

import top.oatnil.dbmlfromjooq.demo.generated.tables.Category


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class CategoryRecord() : UpdatableRecordImpl<CategoryRecord>(Category.CATEGORY), Record3<Int?, String?, LocalDateTime?> {

    var categoryId: Int?
        set(value): Unit = set(0, value)
        get(): Int? = get(0) as Int?

    var name: String?
        set(value): Unit = set(1, value)
        get(): String? = get(1) as String?

    var lastUpdate: LocalDateTime?
        set(value): Unit = set(2, value)
        get(): LocalDateTime? = get(2) as LocalDateTime?

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    override fun key(): Record1<Int?> = super.key() as Record1<Int?>

    // -------------------------------------------------------------------------
    // Record3 type implementation
    // -------------------------------------------------------------------------

    override fun fieldsRow(): Row3<Int?, String?, LocalDateTime?> = super.fieldsRow() as Row3<Int?, String?, LocalDateTime?>
    override fun valuesRow(): Row3<Int?, String?, LocalDateTime?> = super.valuesRow() as Row3<Int?, String?, LocalDateTime?>
    override fun field1(): Field<Int?> = Category.CATEGORY.CATEGORY_ID
    override fun field2(): Field<String?> = Category.CATEGORY.NAME
    override fun field3(): Field<LocalDateTime?> = Category.CATEGORY.LAST_UPDATE
    override fun component1(): Int? = categoryId
    override fun component2(): String? = name
    override fun component3(): LocalDateTime? = lastUpdate
    override fun value1(): Int? = categoryId
    override fun value2(): String? = name
    override fun value3(): LocalDateTime? = lastUpdate

    override fun value1(value: Int?): CategoryRecord {
        this.categoryId = value
        return this
    }

    override fun value2(value: String?): CategoryRecord {
        this.name = value
        return this
    }

    override fun value3(value: LocalDateTime?): CategoryRecord {
        this.lastUpdate = value
        return this
    }

    override fun values(value1: Int?, value2: String?, value3: LocalDateTime?): CategoryRecord {
        this.value1(value1)
        this.value2(value2)
        this.value3(value3)
        return this
    }

    /**
     * Create a detached, initialised CategoryRecord
     */
    constructor(categoryId: Int? = null, name: String? = null, lastUpdate: LocalDateTime? = null): this() {
        this.categoryId = categoryId
        this.name = name
        this.lastUpdate = lastUpdate
    }
}