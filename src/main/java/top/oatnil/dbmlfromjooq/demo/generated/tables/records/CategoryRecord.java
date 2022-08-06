/*
 * This file is generated by jOOQ.
 */
package top.oatnil.dbmlfromjooq.demo.generated.tables.records;


import java.time.LocalDateTime;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record3;
import org.jooq.Row3;
import org.jooq.impl.UpdatableRecordImpl;

import top.oatnil.dbmlfromjooq.demo.generated.tables.Category;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class CategoryRecord extends UpdatableRecordImpl<CategoryRecord> implements Record3<Integer, String, LocalDateTime> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>category.category_id</code>.
     */
    public CategoryRecord setCategoryId(Integer value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>category.category_id</code>.
     */
    public Integer getCategoryId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>category.name</code>.
     */
    public CategoryRecord setName(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>category.name</code>.
     */
    public String getName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>category.last_update</code>.
     */
    public CategoryRecord setLastUpdate(LocalDateTime value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>category.last_update</code>.
     */
    public LocalDateTime getLastUpdate() {
        return (LocalDateTime) get(2);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record3 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row3<Integer, String, LocalDateTime> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    @Override
    public Row3<Integer, String, LocalDateTime> valuesRow() {
        return (Row3) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return Category.CATEGORY.CATEGORY_ID;
    }

    @Override
    public Field<String> field2() {
        return Category.CATEGORY.NAME;
    }

    @Override
    public Field<LocalDateTime> field3() {
        return Category.CATEGORY.LAST_UPDATE;
    }

    @Override
    public Integer component1() {
        return getCategoryId();
    }

    @Override
    public String component2() {
        return getName();
    }

    @Override
    public LocalDateTime component3() {
        return getLastUpdate();
    }

    @Override
    public Integer value1() {
        return getCategoryId();
    }

    @Override
    public String value2() {
        return getName();
    }

    @Override
    public LocalDateTime value3() {
        return getLastUpdate();
    }

    @Override
    public CategoryRecord value1(Integer value) {
        setCategoryId(value);
        return this;
    }

    @Override
    public CategoryRecord value2(String value) {
        setName(value);
        return this;
    }

    @Override
    public CategoryRecord value3(LocalDateTime value) {
        setLastUpdate(value);
        return this;
    }

    @Override
    public CategoryRecord values(Integer value1, String value2, LocalDateTime value3) {
        value1(value1);
        value2(value2);
        value3(value3);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached CategoryRecord
     */
    public CategoryRecord() {
        super(Category.CATEGORY);
    }

    /**
     * Create a detached, initialised CategoryRecord
     */
    public CategoryRecord(Integer categoryId, String name, LocalDateTime lastUpdate) {
        super(Category.CATEGORY);

        setCategoryId(categoryId);
        setName(name);
        setLastUpdate(lastUpdate);
    }
}
