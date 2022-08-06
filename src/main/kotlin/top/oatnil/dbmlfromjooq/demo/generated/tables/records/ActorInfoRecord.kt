/*
 * This file is generated by jOOQ.
 */
package top.oatnil.dbmlfromjooq.demo.generated.tables.records


import org.jooq.Field
import org.jooq.Record4
import org.jooq.Row4
import org.jooq.impl.TableRecordImpl

import top.oatnil.dbmlfromjooq.demo.generated.tables.ActorInfo


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class ActorInfoRecord() : TableRecordImpl<ActorInfoRecord>(ActorInfo.ACTOR_INFO), Record4<Int?, String?, String?, String?> {

    var actorId: Int?
        set(value): Unit = set(0, value)
        get(): Int? = get(0) as Int?

    var firstName: String?
        set(value): Unit = set(1, value)
        get(): String? = get(1) as String?

    var lastName: String?
        set(value): Unit = set(2, value)
        get(): String? = get(2) as String?

    var filmInfo: String?
        set(value): Unit = set(3, value)
        get(): String? = get(3) as String?

    // -------------------------------------------------------------------------
    // Record4 type implementation
    // -------------------------------------------------------------------------

    override fun fieldsRow(): Row4<Int?, String?, String?, String?> = super.fieldsRow() as Row4<Int?, String?, String?, String?>
    override fun valuesRow(): Row4<Int?, String?, String?, String?> = super.valuesRow() as Row4<Int?, String?, String?, String?>
    override fun field1(): Field<Int?> = ActorInfo.ACTOR_INFO.ACTOR_ID
    override fun field2(): Field<String?> = ActorInfo.ACTOR_INFO.FIRST_NAME
    override fun field3(): Field<String?> = ActorInfo.ACTOR_INFO.LAST_NAME
    override fun field4(): Field<String?> = ActorInfo.ACTOR_INFO.FILM_INFO
    override fun component1(): Int? = actorId
    override fun component2(): String? = firstName
    override fun component3(): String? = lastName
    override fun component4(): String? = filmInfo
    override fun value1(): Int? = actorId
    override fun value2(): String? = firstName
    override fun value3(): String? = lastName
    override fun value4(): String? = filmInfo

    override fun value1(value: Int?): ActorInfoRecord {
        this.actorId = value
        return this
    }

    override fun value2(value: String?): ActorInfoRecord {
        this.firstName = value
        return this
    }

    override fun value3(value: String?): ActorInfoRecord {
        this.lastName = value
        return this
    }

    override fun value4(value: String?): ActorInfoRecord {
        this.filmInfo = value
        return this
    }

    override fun values(value1: Int?, value2: String?, value3: String?, value4: String?): ActorInfoRecord {
        this.value1(value1)
        this.value2(value2)
        this.value3(value3)
        this.value4(value4)
        return this
    }

    /**
     * Create a detached, initialised ActorInfoRecord
     */
    constructor(actorId: Int? = null, firstName: String? = null, lastName: String? = null, filmInfo: String? = null): this() {
        this.actorId = actorId
        this.firstName = firstName
        this.lastName = lastName
        this.filmInfo = filmInfo
    }
}
