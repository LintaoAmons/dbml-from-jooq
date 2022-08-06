/*
 * This file is generated by jOOQ.
 */
package top.oatnil.dbmlfromjooq.demo.generated.tables.records;


import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record13;
import org.jooq.Row13;
import org.jooq.impl.UpdatableRecordImpl;

import top.oatnil.dbmlfromjooq.demo.generated.enums.MpaaRating;
import top.oatnil.dbmlfromjooq.demo.generated.tables.Film;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class FilmRecord extends UpdatableRecordImpl<FilmRecord> implements Record13<Integer, String, String, Integer, Short, Short, BigDecimal, Short, BigDecimal, MpaaRating, LocalDateTime, String[], Object> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>film.film_id</code>.
     */
    public FilmRecord setFilmId(Integer value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>film.film_id</code>.
     */
    public Integer getFilmId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>film.title</code>.
     */
    public FilmRecord setTitle(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>film.title</code>.
     */
    public String getTitle() {
        return (String) get(1);
    }

    /**
     * Setter for <code>film.description</code>.
     */
    public FilmRecord setDescription(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>film.description</code>.
     */
    public String getDescription() {
        return (String) get(2);
    }

    /**
     * Setter for <code>film.release_year</code>.
     */
    public FilmRecord setReleaseYear(Integer value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>film.release_year</code>.
     */
    public Integer getReleaseYear() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>film.language_id</code>.
     */
    public FilmRecord setLanguageId(Short value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>film.language_id</code>.
     */
    public Short getLanguageId() {
        return (Short) get(4);
    }

    /**
     * Setter for <code>film.rental_duration</code>.
     */
    public FilmRecord setRentalDuration(Short value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>film.rental_duration</code>.
     */
    public Short getRentalDuration() {
        return (Short) get(5);
    }

    /**
     * Setter for <code>film.rental_rate</code>.
     */
    public FilmRecord setRentalRate(BigDecimal value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>film.rental_rate</code>.
     */
    public BigDecimal getRentalRate() {
        return (BigDecimal) get(6);
    }

    /**
     * Setter for <code>film.length</code>.
     */
    public FilmRecord setLength(Short value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>film.length</code>.
     */
    public Short getLength() {
        return (Short) get(7);
    }

    /**
     * Setter for <code>film.replacement_cost</code>.
     */
    public FilmRecord setReplacementCost(BigDecimal value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>film.replacement_cost</code>.
     */
    public BigDecimal getReplacementCost() {
        return (BigDecimal) get(8);
    }

    /**
     * Setter for <code>film.rating</code>.
     */
    public FilmRecord setRating(MpaaRating value) {
        set(9, value);
        return this;
    }

    /**
     * Getter for <code>film.rating</code>.
     */
    public MpaaRating getRating() {
        return (MpaaRating) get(9);
    }

    /**
     * Setter for <code>film.last_update</code>.
     */
    public FilmRecord setLastUpdate(LocalDateTime value) {
        set(10, value);
        return this;
    }

    /**
     * Getter for <code>film.last_update</code>.
     */
    public LocalDateTime getLastUpdate() {
        return (LocalDateTime) get(10);
    }

    /**
     * Setter for <code>film.special_features</code>.
     */
    public FilmRecord setSpecialFeatures(String[] value) {
        set(11, value);
        return this;
    }

    /**
     * Getter for <code>film.special_features</code>.
     */
    public String[] getSpecialFeatures() {
        return (String[]) get(11);
    }

    /**
     * @deprecated Unknown data type. If this is a qualified, user-defined type,
     * it may have been excluded from code generation. If this is a built-in
     * type, you can define an explicit {@link org.jooq.Binding} to specify how
     * this type should be handled. Deprecation can be turned off using
     * {@literal <deprecationOnUnknownTypes/>} in your code generator
     * configuration.
     */
    @Deprecated
    public FilmRecord setFulltext(Object value) {
        set(12, value);
        return this;
    }

    /**
     * @deprecated Unknown data type. If this is a qualified, user-defined type,
     * it may have been excluded from code generation. If this is a built-in
     * type, you can define an explicit {@link org.jooq.Binding} to specify how
     * this type should be handled. Deprecation can be turned off using
     * {@literal <deprecationOnUnknownTypes/>} in your code generator
     * configuration.
     */
    @Deprecated
    public Object getFulltext() {
        return get(12);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record13 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row13<Integer, String, String, Integer, Short, Short, BigDecimal, Short, BigDecimal, MpaaRating, LocalDateTime, String[], Object> fieldsRow() {
        return (Row13) super.fieldsRow();
    }

    @Override
    public Row13<Integer, String, String, Integer, Short, Short, BigDecimal, Short, BigDecimal, MpaaRating, LocalDateTime, String[], Object> valuesRow() {
        return (Row13) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return Film.FILM.FILM_ID;
    }

    @Override
    public Field<String> field2() {
        return Film.FILM.TITLE;
    }

    @Override
    public Field<String> field3() {
        return Film.FILM.DESCRIPTION;
    }

    @Override
    public Field<Integer> field4() {
        return Film.FILM.RELEASE_YEAR;
    }

    @Override
    public Field<Short> field5() {
        return Film.FILM.LANGUAGE_ID;
    }

    @Override
    public Field<Short> field6() {
        return Film.FILM.RENTAL_DURATION;
    }

    @Override
    public Field<BigDecimal> field7() {
        return Film.FILM.RENTAL_RATE;
    }

    @Override
    public Field<Short> field8() {
        return Film.FILM.LENGTH;
    }

    @Override
    public Field<BigDecimal> field9() {
        return Film.FILM.REPLACEMENT_COST;
    }

    @Override
    public Field<MpaaRating> field10() {
        return Film.FILM.RATING;
    }

    @Override
    public Field<LocalDateTime> field11() {
        return Film.FILM.LAST_UPDATE;
    }

    @Override
    public Field<String[]> field12() {
        return Film.FILM.SPECIAL_FEATURES;
    }

    /**
     * @deprecated Unknown data type. If this is a qualified, user-defined type,
     * it may have been excluded from code generation. If this is a built-in
     * type, you can define an explicit {@link org.jooq.Binding} to specify how
     * this type should be handled. Deprecation can be turned off using
     * {@literal <deprecationOnUnknownTypes/>} in your code generator
     * configuration.
     */
    @Deprecated
    @Override
    public Field<Object> field13() {
        return Film.FILM.FULLTEXT;
    }

    @Override
    public Integer component1() {
        return getFilmId();
    }

    @Override
    public String component2() {
        return getTitle();
    }

    @Override
    public String component3() {
        return getDescription();
    }

    @Override
    public Integer component4() {
        return getReleaseYear();
    }

    @Override
    public Short component5() {
        return getLanguageId();
    }

    @Override
    public Short component6() {
        return getRentalDuration();
    }

    @Override
    public BigDecimal component7() {
        return getRentalRate();
    }

    @Override
    public Short component8() {
        return getLength();
    }

    @Override
    public BigDecimal component9() {
        return getReplacementCost();
    }

    @Override
    public MpaaRating component10() {
        return getRating();
    }

    @Override
    public LocalDateTime component11() {
        return getLastUpdate();
    }

    @Override
    public String[] component12() {
        return getSpecialFeatures();
    }

    /**
     * @deprecated Unknown data type. If this is a qualified, user-defined type,
     * it may have been excluded from code generation. If this is a built-in
     * type, you can define an explicit {@link org.jooq.Binding} to specify how
     * this type should be handled. Deprecation can be turned off using
     * {@literal <deprecationOnUnknownTypes/>} in your code generator
     * configuration.
     */
    @Deprecated
    @Override
    public Object component13() {
        return getFulltext();
    }

    @Override
    public Integer value1() {
        return getFilmId();
    }

    @Override
    public String value2() {
        return getTitle();
    }

    @Override
    public String value3() {
        return getDescription();
    }

    @Override
    public Integer value4() {
        return getReleaseYear();
    }

    @Override
    public Short value5() {
        return getLanguageId();
    }

    @Override
    public Short value6() {
        return getRentalDuration();
    }

    @Override
    public BigDecimal value7() {
        return getRentalRate();
    }

    @Override
    public Short value8() {
        return getLength();
    }

    @Override
    public BigDecimal value9() {
        return getReplacementCost();
    }

    @Override
    public MpaaRating value10() {
        return getRating();
    }

    @Override
    public LocalDateTime value11() {
        return getLastUpdate();
    }

    @Override
    public String[] value12() {
        return getSpecialFeatures();
    }

    /**
     * @deprecated Unknown data type. If this is a qualified, user-defined type,
     * it may have been excluded from code generation. If this is a built-in
     * type, you can define an explicit {@link org.jooq.Binding} to specify how
     * this type should be handled. Deprecation can be turned off using
     * {@literal <deprecationOnUnknownTypes/>} in your code generator
     * configuration.
     */
    @Deprecated
    @Override
    public Object value13() {
        return getFulltext();
    }

    @Override
    public FilmRecord value1(Integer value) {
        setFilmId(value);
        return this;
    }

    @Override
    public FilmRecord value2(String value) {
        setTitle(value);
        return this;
    }

    @Override
    public FilmRecord value3(String value) {
        setDescription(value);
        return this;
    }

    @Override
    public FilmRecord value4(Integer value) {
        setReleaseYear(value);
        return this;
    }

    @Override
    public FilmRecord value5(Short value) {
        setLanguageId(value);
        return this;
    }

    @Override
    public FilmRecord value6(Short value) {
        setRentalDuration(value);
        return this;
    }

    @Override
    public FilmRecord value7(BigDecimal value) {
        setRentalRate(value);
        return this;
    }

    @Override
    public FilmRecord value8(Short value) {
        setLength(value);
        return this;
    }

    @Override
    public FilmRecord value9(BigDecimal value) {
        setReplacementCost(value);
        return this;
    }

    @Override
    public FilmRecord value10(MpaaRating value) {
        setRating(value);
        return this;
    }

    @Override
    public FilmRecord value11(LocalDateTime value) {
        setLastUpdate(value);
        return this;
    }

    @Override
    public FilmRecord value12(String[] value) {
        setSpecialFeatures(value);
        return this;
    }

    /**
     * @deprecated Unknown data type. If this is a qualified, user-defined type,
     * it may have been excluded from code generation. If this is a built-in
     * type, you can define an explicit {@link org.jooq.Binding} to specify how
     * this type should be handled. Deprecation can be turned off using
     * {@literal <deprecationOnUnknownTypes/>} in your code generator
     * configuration.
     */
    @Deprecated
    @Override
    public FilmRecord value13(Object value) {
        setFulltext(value);
        return this;
    }

    @Override
    public FilmRecord values(Integer value1, String value2, String value3, Integer value4, Short value5, Short value6, BigDecimal value7, Short value8, BigDecimal value9, MpaaRating value10, LocalDateTime value11, String[] value12, Object value13) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        value11(value11);
        value12(value12);
        value13(value13);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached FilmRecord
     */
    public FilmRecord() {
        super(Film.FILM);
    }

    /**
     * Create a detached, initialised FilmRecord
     */
    public FilmRecord(Integer filmId, String title, String description, Integer releaseYear, Short languageId, Short rentalDuration, BigDecimal rentalRate, Short length, BigDecimal replacementCost, MpaaRating rating, LocalDateTime lastUpdate, String[] specialFeatures, Object fulltext) {
        super(Film.FILM);

        setFilmId(filmId);
        setTitle(title);
        setDescription(description);
        setReleaseYear(releaseYear);
        setLanguageId(languageId);
        setRentalDuration(rentalDuration);
        setRentalRate(rentalRate);
        setLength(length);
        setReplacementCost(replacementCost);
        setRating(rating);
        setLastUpdate(lastUpdate);
        setSpecialFeatures(specialFeatures);
        setFulltext(fulltext);
    }
}
