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

import top.oatnil.dbmlfromjooq.demo.generated.tables.Store;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class StoreRecord extends UpdatableRecordImpl<StoreRecord> implements Record4<Integer, Short, Short, LocalDateTime> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>store.store_id</code>.
     */
    public StoreRecord setStoreId(Integer value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>store.store_id</code>.
     */
    public Integer getStoreId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>store.manager_staff_id</code>.
     */
    public StoreRecord setManagerStaffId(Short value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>store.manager_staff_id</code>.
     */
    public Short getManagerStaffId() {
        return (Short) get(1);
    }

    /**
     * Setter for <code>store.address_id</code>.
     */
    public StoreRecord setAddressId(Short value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>store.address_id</code>.
     */
    public Short getAddressId() {
        return (Short) get(2);
    }

    /**
     * Setter for <code>store.last_update</code>.
     */
    public StoreRecord setLastUpdate(LocalDateTime value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>store.last_update</code>.
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
        return Store.STORE.STORE_ID;
    }

    @Override
    public Field<Short> field2() {
        return Store.STORE.MANAGER_STAFF_ID;
    }

    @Override
    public Field<Short> field3() {
        return Store.STORE.ADDRESS_ID;
    }

    @Override
    public Field<LocalDateTime> field4() {
        return Store.STORE.LAST_UPDATE;
    }

    @Override
    public Integer component1() {
        return getStoreId();
    }

    @Override
    public Short component2() {
        return getManagerStaffId();
    }

    @Override
    public Short component3() {
        return getAddressId();
    }

    @Override
    public LocalDateTime component4() {
        return getLastUpdate();
    }

    @Override
    public Integer value1() {
        return getStoreId();
    }

    @Override
    public Short value2() {
        return getManagerStaffId();
    }

    @Override
    public Short value3() {
        return getAddressId();
    }

    @Override
    public LocalDateTime value4() {
        return getLastUpdate();
    }

    @Override
    public StoreRecord value1(Integer value) {
        setStoreId(value);
        return this;
    }

    @Override
    public StoreRecord value2(Short value) {
        setManagerStaffId(value);
        return this;
    }

    @Override
    public StoreRecord value3(Short value) {
        setAddressId(value);
        return this;
    }

    @Override
    public StoreRecord value4(LocalDateTime value) {
        setLastUpdate(value);
        return this;
    }

    @Override
    public StoreRecord values(Integer value1, Short value2, Short value3, LocalDateTime value4) {
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
     * Create a detached StoreRecord
     */
    public StoreRecord() {
        super(Store.STORE);
    }

    /**
     * Create a detached, initialised StoreRecord
     */
    public StoreRecord(Integer storeId, Short managerStaffId, Short addressId, LocalDateTime lastUpdate) {
        super(Store.STORE);

        setStoreId(storeId);
        setManagerStaffId(managerStaffId);
        setAddressId(addressId);
        setLastUpdate(lastUpdate);
    }
}