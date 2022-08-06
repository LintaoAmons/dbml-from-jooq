/*
 * This file is generated by jOOQ.
 */
package top.oatnil.dbmlfromjooq.demo.generated.tables


import java.math.BigDecimal

import org.jooq.Field
import org.jooq.ForeignKey
import org.jooq.Name
import org.jooq.Record
import org.jooq.Row8
import org.jooq.Schema
import org.jooq.Table
import org.jooq.TableField
import org.jooq.TableOptions
import org.jooq.impl.DSL
import org.jooq.impl.Internal
import org.jooq.impl.SQLDataType
import org.jooq.impl.TableImpl

import top.oatnil.dbmlfromjooq.demo.generated.DefaultSchema
import top.oatnil.dbmlfromjooq.demo.generated.enums.MpaaRating
import top.oatnil.dbmlfromjooq.demo.generated.tables.records.NicerButSlowerFilmListRecord


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class NicerButSlowerFilmList(
    alias: Name,
    child: Table<out Record>?,
    path: ForeignKey<out Record, NicerButSlowerFilmListRecord>?,
    aliased: Table<NicerButSlowerFilmListRecord>?,
    parameters: Array<Field<*>?>?
): TableImpl<NicerButSlowerFilmListRecord>(
    alias,
    DefaultSchema.DEFAULT_SCHEMA,
    child,
    path,
    aliased,
    parameters,
    DSL.comment(""),
    TableOptions.view("create view \"nicer_but_slower_film_list\" as  SELECT film.film_id AS fid,\n    film.title,\n    film.description,\n    category.name AS category,\n    film.rental_rate AS price,\n    film.length,\n    film.rating,\n    group_concat((((upper(\"substring\"((actor.first_name)::text, 1, 1)) || lower(\"substring\"((actor.first_name)::text, 2))) || upper(\"substring\"((actor.last_name)::text, 1, 1))) || lower(\"substring\"((actor.last_name)::text, 2)))) AS actors\n   FROM ((((category\n     LEFT JOIN film_category ON ((category.category_id = film_category.category_id)))\n     LEFT JOIN film ON ((film_category.film_id = film.film_id)))\n     JOIN film_actor ON ((film.film_id = film_actor.film_id)))\n     JOIN actor ON ((film_actor.actor_id = actor.actor_id)))\n  GROUP BY film.film_id, film.title, film.description, category.name, film.rental_rate, film.length, film.rating;")
) {
    companion object {

        /**
         * The reference instance of <code>nicer_but_slower_film_list</code>
         */
        val NICER_BUT_SLOWER_FILM_LIST: NicerButSlowerFilmList = NicerButSlowerFilmList()
    }

    /**
     * The class holding records for this type
     */
    override fun getRecordType(): Class<NicerButSlowerFilmListRecord> = NicerButSlowerFilmListRecord::class.java

    /**
     * The column <code>nicer_but_slower_film_list.fid</code>.
     */
    val FID: TableField<NicerButSlowerFilmListRecord, Int?> = createField(DSL.name("fid"), SQLDataType.INTEGER, this, "")

    /**
     * The column <code>nicer_but_slower_film_list.title</code>.
     */
    val TITLE: TableField<NicerButSlowerFilmListRecord, String?> = createField(DSL.name("title"), SQLDataType.VARCHAR(255), this, "")

    /**
     * The column <code>nicer_but_slower_film_list.description</code>.
     */
    val DESCRIPTION: TableField<NicerButSlowerFilmListRecord, String?> = createField(DSL.name("description"), SQLDataType.CLOB, this, "")

    /**
     * The column <code>nicer_but_slower_film_list.category</code>.
     */
    val CATEGORY: TableField<NicerButSlowerFilmListRecord, String?> = createField(DSL.name("category"), SQLDataType.VARCHAR(25), this, "")

    /**
     * The column <code>nicer_but_slower_film_list.price</code>.
     */
    val PRICE: TableField<NicerButSlowerFilmListRecord, BigDecimal?> = createField(DSL.name("price"), SQLDataType.NUMERIC(4, 2), this, "")

    /**
     * The column <code>nicer_but_slower_film_list.length</code>.
     */
    val LENGTH: TableField<NicerButSlowerFilmListRecord, Short?> = createField(DSL.name("length"), SQLDataType.SMALLINT, this, "")

    /**
     * The column <code>nicer_but_slower_film_list.rating</code>.
     */
    val RATING: TableField<NicerButSlowerFilmListRecord, MpaaRating?> = createField(DSL.name("rating"), SQLDataType.VARCHAR.asEnumDataType(top.oatnil.dbmlfromjooq.demo.generated.enums.MpaaRating::class.java), this, "")

    /**
     * The column <code>nicer_but_slower_film_list.actors</code>.
     */
    val ACTORS: TableField<NicerButSlowerFilmListRecord, String?> = createField(DSL.name("actors"), SQLDataType.CLOB, this, "")

    private constructor(alias: Name, aliased: Table<NicerButSlowerFilmListRecord>?): this(alias, null, null, aliased, null)
    private constructor(alias: Name, aliased: Table<NicerButSlowerFilmListRecord>?, parameters: Array<Field<*>?>?): this(alias, null, null, aliased, parameters)

    /**
     * Create an aliased <code>nicer_but_slower_film_list</code> table reference
     */
    constructor(alias: String): this(DSL.name(alias))

    /**
     * Create an aliased <code>nicer_but_slower_film_list</code> table reference
     */
    constructor(alias: Name): this(alias, null)

    /**
     * Create a <code>nicer_but_slower_film_list</code> table reference
     */
    constructor(): this(DSL.name("nicer_but_slower_film_list"), null)

    constructor(child: Table<out Record>, key: ForeignKey<out Record, NicerButSlowerFilmListRecord>): this(Internal.createPathAlias(child, key), child, key, NICER_BUT_SLOWER_FILM_LIST, null)
    override fun getSchema(): Schema? = if (aliased()) null else DefaultSchema.DEFAULT_SCHEMA
    override fun `as`(alias: String): NicerButSlowerFilmList = NicerButSlowerFilmList(DSL.name(alias), this)
    override fun `as`(alias: Name): NicerButSlowerFilmList = NicerButSlowerFilmList(alias, this)

    /**
     * Rename this table
     */
    override fun rename(name: String): NicerButSlowerFilmList = NicerButSlowerFilmList(DSL.name(name), null)

    /**
     * Rename this table
     */
    override fun rename(name: Name): NicerButSlowerFilmList = NicerButSlowerFilmList(name, null)

    // -------------------------------------------------------------------------
    // Row8 type methods
    // -------------------------------------------------------------------------
    override fun fieldsRow(): Row8<Int?, String?, String?, String?, BigDecimal?, Short?, MpaaRating?, String?> = super.fieldsRow() as Row8<Int?, String?, String?, String?, BigDecimal?, Short?, MpaaRating?, String?>
}
