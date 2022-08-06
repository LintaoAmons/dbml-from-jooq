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

import top.oatnil.dbmlfromjooq.demo.generated.tables.Actor


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class ActorRecord() : UpdatableRecordImpl<ActorRecord>(Actor.ACTOR), Record4<Int?, String?, String?, LocalDateTime?> {

    var actorId: Int?
        set(value): Unit = set(0, value)
        get(): Int? = get(0) as Int?

    var firstName: String?
        set(value): Unit = set(1, value)
        get(): String? = get(1) as String?

    var lastName: String?
        set(value): Unit = set(2, value)
        get(): String? = get(2) as String?

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

    override fun fieldsRow(): Row4<Int?, String?, String?, LocalDateTime?> = super.fieldsRow() as Row4<Int?, String?, String?, LocalDateTime?>
    override fun valuesRow(): Row4<Int?, String?, String?, LocalDateTime?> = super.valuesRow() as Row4<Int?, String?, String?, LocalDateTime?>
    override fun field1(): Field<Int?> = Actor.ACTOR.ACTOR_ID
    override fun field2(): Field<String?> = Actor.ACTOR.FIRST_NAME
    override fun field3(): Field<String?> = Actor.ACTOR.LAST_NAME
    override fun field4(): Field<LocalDateTime?> = Actor.ACTOR.LAST_UPDATE
    override fun component1(): Int? = actorId
    override fun component2(): String? = firstName
    override fun component3(): String? = lastName
    override fun component4(): LocalDateTime? = lastUpdate
    override fun value1(): Int? = actorId
    override fun value2(): String? = firstName
    override fun value3(): String? = lastName
    override fun value4(): LocalDateTime? = lastUpdate

    override fun value1(value: Int?): ActorRecord {
        this.actorId = value
        return this
    }

    override fun value2(value: String?): ActorRecord {
        this.firstName = value
        return this
    }

    override fun value3(value: String?): ActorRecord {
        this.lastName = value
        return this
    }

    override fun value4(value: LocalDateTime?): ActorRecord {
        this.lastUpdate = value
        return this
    }

    override fun values(value1: Int?, value2: String?, value3: String?, value4: LocalDateTime?): ActorRecord {
        this.value1(value1)
        this.value2(value2)
        this.value3(value3)
        this.value4(value4)
        return this
    }

    /**
     * Create a detached, initialised ActorRecord
     */
    constructor(actorId: Int? = null, firstName: String? = null, lastName: String? = null, lastUpdate: LocalDateTime? = null): this() {
        this.actorId = actorId
        this.firstName = firstName
        this.lastName = lastName
        this.lastUpdate = lastUpdate
    }
}
