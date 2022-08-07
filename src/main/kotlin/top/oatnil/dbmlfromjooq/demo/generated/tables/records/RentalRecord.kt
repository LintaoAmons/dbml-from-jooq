/*
 * This file is generated by jOOQ.
 */
package top.oatnil.dbmlfromjooq.demo.generated.tables.records


import java.time.LocalDateTime

import org.jooq.Field
import org.jooq.Record1
import org.jooq.Record7
import org.jooq.Row7
import org.jooq.impl.UpdatableRecordImpl

import top.oatnil.dbmlfromjooq.demo.generated.tables.Rental


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class RentalRecord() : UpdatableRecordImpl<RentalRecord>(Rental.RENTAL), Record7<Int?, LocalDateTime?, Int?, Short?, LocalDateTime?, Short?, LocalDateTime?> {

    var rentalId: Int?
        set(value): Unit = set(0, value)
        get(): Int? = get(0) as Int?

    var rentalDate: LocalDateTime?
        set(value): Unit = set(1, value)
        get(): LocalDateTime? = get(1) as LocalDateTime?

    var inventoryId: Int?
        set(value): Unit = set(2, value)
        get(): Int? = get(2) as Int?

    var customerId: Short?
        set(value): Unit = set(3, value)
        get(): Short? = get(3) as Short?

    var returnDate: LocalDateTime?
        set(value): Unit = set(4, value)
        get(): LocalDateTime? = get(4) as LocalDateTime?

    var staffId: Short?
        set(value): Unit = set(5, value)
        get(): Short? = get(5) as Short?

    var lastUpdate: LocalDateTime?
        set(value): Unit = set(6, value)
        get(): LocalDateTime? = get(6) as LocalDateTime?

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    override fun key(): Record1<Int?> = super.key() as Record1<Int?>

    // -------------------------------------------------------------------------
    // Record7 type implementation
    // -------------------------------------------------------------------------

    override fun fieldsRow(): Row7<Int?, LocalDateTime?, Int?, Short?, LocalDateTime?, Short?, LocalDateTime?> = super.fieldsRow() as Row7<Int?, LocalDateTime?, Int?, Short?, LocalDateTime?, Short?, LocalDateTime?>
    override fun valuesRow(): Row7<Int?, LocalDateTime?, Int?, Short?, LocalDateTime?, Short?, LocalDateTime?> = super.valuesRow() as Row7<Int?, LocalDateTime?, Int?, Short?, LocalDateTime?, Short?, LocalDateTime?>
    override fun field1(): Field<Int?> = Rental.RENTAL.RENTAL_ID
    override fun field2(): Field<LocalDateTime?> = Rental.RENTAL.RENTAL_DATE
    override fun field3(): Field<Int?> = Rental.RENTAL.INVENTORY_ID
    override fun field4(): Field<Short?> = Rental.RENTAL.CUSTOMER_ID
    override fun field5(): Field<LocalDateTime?> = Rental.RENTAL.RETURN_DATE
    override fun field6(): Field<Short?> = Rental.RENTAL.STAFF_ID
    override fun field7(): Field<LocalDateTime?> = Rental.RENTAL.LAST_UPDATE
    override fun component1(): Int? = rentalId
    override fun component2(): LocalDateTime? = rentalDate
    override fun component3(): Int? = inventoryId
    override fun component4(): Short? = customerId
    override fun component5(): LocalDateTime? = returnDate
    override fun component6(): Short? = staffId
    override fun component7(): LocalDateTime? = lastUpdate
    override fun value1(): Int? = rentalId
    override fun value2(): LocalDateTime? = rentalDate
    override fun value3(): Int? = inventoryId
    override fun value4(): Short? = customerId
    override fun value5(): LocalDateTime? = returnDate
    override fun value6(): Short? = staffId
    override fun value7(): LocalDateTime? = lastUpdate

    override fun value1(value: Int?): RentalRecord {
        this.rentalId = value
        return this
    }

    override fun value2(value: LocalDateTime?): RentalRecord {
        this.rentalDate = value
        return this
    }

    override fun value3(value: Int?): RentalRecord {
        this.inventoryId = value
        return this
    }

    override fun value4(value: Short?): RentalRecord {
        this.customerId = value
        return this
    }

    override fun value5(value: LocalDateTime?): RentalRecord {
        this.returnDate = value
        return this
    }

    override fun value6(value: Short?): RentalRecord {
        this.staffId = value
        return this
    }

    override fun value7(value: LocalDateTime?): RentalRecord {
        this.lastUpdate = value
        return this
    }

    override fun values(value1: Int?, value2: LocalDateTime?, value3: Int?, value4: Short?, value5: LocalDateTime?, value6: Short?, value7: LocalDateTime?): RentalRecord {
        this.value1(value1)
        this.value2(value2)
        this.value3(value3)
        this.value4(value4)
        this.value5(value5)
        this.value6(value6)
        this.value7(value7)
        return this
    }

    /**
     * Create a detached, initialised RentalRecord
     */
    constructor(rentalId: Int? = null, rentalDate: LocalDateTime? = null, inventoryId: Int? = null, customerId: Short? = null, returnDate: LocalDateTime? = null, staffId: Short? = null, lastUpdate: LocalDateTime? = null): this() {
        this.rentalId = rentalId
        this.rentalDate = rentalDate
        this.inventoryId = inventoryId
        this.customerId = customerId
        this.returnDate = returnDate
        this.staffId = staffId
        this.lastUpdate = lastUpdate
    }
}