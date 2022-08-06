/*
 * This file is generated by jOOQ.
 */
package top.oatnil.dbmlfromjooq.demo.generated.tables.records;


import java.time.LocalDateTime;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record4;
import org.jooq.Row4;
import org.jooq.impl.UpdatableRecordImpl;

import top.oatnil.dbmlfromjooq.demo.generated.tables.Inventory;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class InventoryRecord extends UpdatableRecordImpl<InventoryRecord> implements Record4<Integer, Short, Short, LocalDateTime> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>inventory.inventory_id</code>.
     */
    public InventoryRecord setInventoryId(Integer value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>inventory.inventory_id</code>.
     */
    public Integer getInventoryId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>inventory.film_id</code>.
     */
    public InventoryRecord setFilmId(Short value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>inventory.film_id</code>.
     */
    public Short getFilmId() {
        return (Short) get(1);
    }

    /**
     * Setter for <code>inventory.store_id</code>.
     */
    public InventoryRecord setStoreId(Short value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>inventory.store_id</code>.
     */
    public Short getStoreId() {
        return (Short) get(2);
    }

    /**
     * Setter for <code>inventory.last_update</code>.
     */
    public InventoryRecord setLastUpdate(LocalDateTime value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>inventory.last_update</code>.
     */
    public LocalDateTime getLastUpdate() {
        return (LocalDateTime) get(3);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record4 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row4<Integer, Short, Short, LocalDateTime> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    @Override
    public Row4<Integer, Short, Short, LocalDateTime> valuesRow() {
        return (Row4) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return Inventory.INVENTORY.INVENTORY_ID;
    }

    @Override
    public Field<Short> field2() {
        return Inventory.INVENTORY.FILM_ID;
    }

    @Override
    public Field<Short> field3() {
        return Inventory.INVENTORY.STORE_ID;
    }

    @Override
    public Field<LocalDateTime> field4() {
        return Inventory.INVENTORY.LAST_UPDATE;
    }

    @Override
    public Integer component1() {
        return getInventoryId();
    }

    @Override
    public Short component2() {
        return getFilmId();
    }

    @Override
    public Short component3() {
        return getStoreId();
    }

    @Override
    public LocalDateTime component4() {
        return getLastUpdate();
    }

    @Override
    public Integer value1() {
        return getInventoryId();
    }

    @Override
    public Short value2() {
        return getFilmId();
    }

    @Override
    public Short value3() {
        return getStoreId();
    }

    @Override
    public LocalDateTime value4() {
        return getLastUpdate();
    }

    @Override
    public InventoryRecord value1(Integer value) {
        setInventoryId(value);
        return this;
    }

    @Override
    public InventoryRecord value2(Short value) {
        setFilmId(value);
        return this;
    }

    @Override
    public InventoryRecord value3(Short value) {
        setStoreId(value);
        return this;
    }

    @Override
    public InventoryRecord value4(LocalDateTime value) {
        setLastUpdate(value);
        return this;
    }

    @Override
    public InventoryRecord values(Integer value1, Short value2, Short value3, LocalDateTime value4) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached InventoryRecord
     */
    public InventoryRecord() {
        super(Inventory.INVENTORY);
    }

    /**
     * Create a detached, initialised InventoryRecord
     */
    public InventoryRecord(Integer inventoryId, Short filmId, Short storeId, LocalDateTime lastUpdate) {
        super(Inventory.INVENTORY);

        setInventoryId(inventoryId);
        setFilmId(filmId);
        setStoreId(storeId);
        setLastUpdate(lastUpdate);
    }
}
