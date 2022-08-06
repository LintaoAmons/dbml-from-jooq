/*
 * This file is generated by jOOQ.
 */
package top.oatnil.dbmlfromjooq.demo.generated.tables.records


import java.time.LocalDateTime

import org.jooq.Field
import org.jooq.Record1
import org.jooq.Record4
import org.jooq.Row4
import org.jooq.impl.UpdatableRecordImpl

import top.oatnil.dbmlfromjooq.demo.generated.tables.Store


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class StoreRecord() : UpdatableRecordImpl<StoreRecord>(Store.STORE), Record4<Int?, Short?, Short?, LocalDateTime?> {

    var storeId: Int?
        set(value): Unit = set(0, value)
        get(): Int? = get(0) as Int?

    var managerStaffId: Short?
        set(value): Unit = set(1, value)
        get(): Short? = get(1) as Short?

    var addressId: Short?
        set(value): Unit = set(2, value)
        get(): Short? = get(2) as Short?

    var lastUpdate: LocalDateTime?
        set(value): Unit = set(3, value)
        get(): LocalDateTime? = get(3) as LocalDateTime?

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    override fun key(): Record1<Int?> = super.key() as Record1<Int?>

    // -------------------------------------------------------------------------
    // Record4 type implementation
    // -------------------------------------------------------------------------

    override fun fieldsRow(): Row4<Int?, Short?, Short?, LocalDateTime?> = super.fieldsRow() as Row4<Int?, Short?, Short?, LocalDateTime?>
    override fun valuesRow(): Row4<Int?, Short?, Short?, LocalDateTime?> = super.valuesRow() as Row4<Int?, Short?, Short?, LocalDateTime?>
    override fun field1(): Field<Int?> = Store.STORE.STORE_ID
    override fun field2(): Field<Short?> = Store.STORE.MANAGER_STAFF_ID
    override fun field3(): Field<Short?> = Store.STORE.ADDRESS_ID
    override fun field4(): Field<LocalDateTime?> = Store.STORE.LAST_UPDATE
    override fun component1(): Int? = storeId
    override fun component2(): Short? = managerStaffId
    override fun component3(): Short? = addressId
    override fun component4(): LocalDateTime? = lastUpdate
    override fun value1(): Int? = storeId
    override fun value2(): Short? = managerStaffId
    override fun value3(): Short? = addressId
    override fun value4(): LocalDateTime? = lastUpdate

    override fun value1(value: Int?): StoreRecord {
        this.storeId = value
        return this
    }

    override fun value2(value: Short?): StoreRecord {
        this.managerStaffId = value
        return this
    }

    override fun value3(value: Short?): StoreRecord {
        this.addressId = value
        return this
    }

    override fun value4(value: LocalDateTime?): StoreRecord {
        this.lastUpdate = value
        return this
    }

    override fun values(value1: Int?, value2: Short?, value3: Short?, value4: LocalDateTime?): StoreRecord {
        this.value1(value1)
        this.value2(value2)
        this.value3(value3)
        this.value4(value4)
        return this
    }

    /**
     * Create a detached, initialised StoreRecord
     */
    constructor(storeId: Int? = null, managerStaffId: Short? = null, addressId: Short? = null, lastUpdate: LocalDateTime? = null): this() {
        this.storeId = storeId
        this.managerStaffId = managerStaffId
        this.addressId = addressId
        this.lastUpdate = lastUpdate
    }
}
