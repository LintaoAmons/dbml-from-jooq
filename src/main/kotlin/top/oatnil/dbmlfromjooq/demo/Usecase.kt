package top.oatnil.dbmlfromjooq.demo

import org.jooq.DSLContext
import org.jooq.impl.TableImpl
import org.springframework.stereotype.Component
import top.oatnil.dbmlfromjooq.core.DbmlFromJooqTool
import top.oatnil.dbmlfromjooq.demo.generated.Tables

@Component
class Usecase(val dslContext: DSLContext) {

    fun demoFromTables() {
        val tableImpls = listOf<TableImpl<*>>(
            Tables.ACTOR,
            Tables.ACTOR_INFO,
            Tables.ADDRESS,
            Tables.CATEGORY,
            Tables.CITY,
            Tables.COUNTRY,
            Tables.CUSTOMER,
            Tables.CUSTOMER_LIST,
            Tables.FILM,
            Tables.FILM_ACTOR,
            Tables.FILM_CATEGORY,
            Tables.FILM_IN_STOCK,
        )
        println(DbmlFromJooqTool(dslContext).generate(tableImpls))
    }

    fun demoFromRecords() {
        val actorId = 1
        val actorRecord = dslContext.selectFrom(Tables.ACTOR)
            .where(Tables.ACTOR.ACTOR_ID.eq(actorId))
            .limit(1)
            .fetchOne()

        val actorInfoRecord = dslContext.selectFrom(Tables.ACTOR_INFO)
            .where(Tables.ACTOR_INFO.ACTOR_ID.eq(actorId))
            .limit(1)
            .fetchOne()

        val filmActorRecord = dslContext.selectFrom(Tables.FILM_ACTOR)
            .where(Tables.FILM_ACTOR.ACTOR_ID.eq(actorId.toShort()))
            .limit(1)
            .fetchOne()

        val filmRecord = dslContext.selectFrom(Tables.FILM)
            .where(Tables.FILM.FILM_ID.eq(filmActorRecord!!.filmId!!.toInt()))
            .limit(1)
            .fetchOne()

        println(DbmlFromJooqTool.generate(listOf(actorRecord, actorInfoRecord, filmActorRecord, filmRecord)))
    }
}

