/*
 * This file is generated by jOOQ.
 */
package top.oatnil.dbmlfromjooq.demo.generated.tables.records


import java.time.LocalDateTime

import org.jooq.Field
import org.jooq.Record2
import org.jooq.Record3
import org.jooq.Row3
import org.jooq.impl.UpdatableRecordImpl

import top.oatnil.dbmlfromjooq.demo.generated.tables.FilmActor


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class FilmActorRecord() : UpdatableRecordImpl<FilmActorRecord>(FilmActor.FILM_ACTOR), Record3<Short?, Short?, LocalDateTime?> {

    var actorId: Short?
        set(value): Unit = set(0, value)
        get(): Short? = get(0) as Short?

    var filmId: Short?
        set(value): Unit = set(1, value)
        get(): Short? = get(1) as Short?

    var lastUpdate: LocalDateTime?
        set(value): Unit = set(2, value)
        get(): LocalDateTime? = get(2) as LocalDateTime?

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    override fun key(): Record2<Short?, Short?> = super.key() as Record2<Short?, Short?>

    // -------------------------------------------------------------------------
    // Record3 type implementation
    // -------------------------------------------------------------------------

    override fun fieldsRow(): Row3<Short?, Short?, LocalDateTime?> = super.fieldsRow() as Row3<Short?, Short?, LocalDateTime?>
    override fun valuesRow(): Row3<Short?, Short?, LocalDateTime?> = super.valuesRow() as Row3<Short?, Short?, LocalDateTime?>
    override fun field1(): Field<Short?> = FilmActor.FILM_ACTOR.ACTOR_ID
    override fun field2(): Field<Short?> = FilmActor.FILM_ACTOR.FILM_ID
    override fun field3(): Field<LocalDateTime?> = FilmActor.FILM_ACTOR.LAST_UPDATE
    override fun component1(): Short? = actorId
    override fun component2(): Short? = filmId
    override fun component3(): LocalDateTime? = lastUpdate
    override fun value1(): Short? = actorId
    override fun value2(): Short? = filmId
    override fun value3(): LocalDateTime? = lastUpdate

    override fun value1(value: Short?): FilmActorRecord {
        this.actorId = value
        return this
    }

    override fun value2(value: Short?): FilmActorRecord {
        this.filmId = value
        return this
    }

    override fun value3(value: LocalDateTime?): FilmActorRecord {
        this.lastUpdate = value
        return this
    }

    override fun values(value1: Short?, value2: Short?, value3: LocalDateTime?): FilmActorRecord {
        this.value1(value1)
        this.value2(value2)
        this.value3(value3)
        return this
    }

    /**
     * Create a detached, initialised FilmActorRecord
     */
    constructor(actorId: Short? = null, filmId: Short? = null, lastUpdate: LocalDateTime? = null): this() {
        this.actorId = actorId
        this.filmId = filmId
        this.lastUpdate = lastUpdate
    }
}
