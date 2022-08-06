/*
 * This file is generated by jOOQ.
 */
package top.oatnil.dbmlfromjooq.demo.generated;


import java.math.BigDecimal;

import org.jooq.Configuration;
import org.jooq.Field;
import org.jooq.Result;

import top.oatnil.dbmlfromjooq.demo.generated.tables.Actor;
import top.oatnil.dbmlfromjooq.demo.generated.tables.ActorInfo;
import top.oatnil.dbmlfromjooq.demo.generated.tables.Address;
import top.oatnil.dbmlfromjooq.demo.generated.tables.Category;
import top.oatnil.dbmlfromjooq.demo.generated.tables.City;
import top.oatnil.dbmlfromjooq.demo.generated.tables.Country;
import top.oatnil.dbmlfromjooq.demo.generated.tables.Customer;
import top.oatnil.dbmlfromjooq.demo.generated.tables.CustomerList;
import top.oatnil.dbmlfromjooq.demo.generated.tables.Film;
import top.oatnil.dbmlfromjooq.demo.generated.tables.FilmActor;
import top.oatnil.dbmlfromjooq.demo.generated.tables.FilmCategory;
import top.oatnil.dbmlfromjooq.demo.generated.tables.FilmInStock;
import top.oatnil.dbmlfromjooq.demo.generated.tables.FilmList;
import top.oatnil.dbmlfromjooq.demo.generated.tables.FilmNotInStock;
import top.oatnil.dbmlfromjooq.demo.generated.tables.Inventory;
import top.oatnil.dbmlfromjooq.demo.generated.tables.Language;
import top.oatnil.dbmlfromjooq.demo.generated.tables.NicerButSlowerFilmList;
import top.oatnil.dbmlfromjooq.demo.generated.tables.Payment;
import top.oatnil.dbmlfromjooq.demo.generated.tables.Rental;
import top.oatnil.dbmlfromjooq.demo.generated.tables.RewardsReport;
import top.oatnil.dbmlfromjooq.demo.generated.tables.SalesByFilmCategory;
import top.oatnil.dbmlfromjooq.demo.generated.tables.SalesByStore;
import top.oatnil.dbmlfromjooq.demo.generated.tables.Staff;
import top.oatnil.dbmlfromjooq.demo.generated.tables.StaffList;
import top.oatnil.dbmlfromjooq.demo.generated.tables.Store;
import top.oatnil.dbmlfromjooq.demo.generated.tables.records.FilmInStockRecord;
import top.oatnil.dbmlfromjooq.demo.generated.tables.records.FilmNotInStockRecord;
import top.oatnil.dbmlfromjooq.demo.generated.tables.records.RewardsReportRecord;


/**
 * Convenience access to all tables in the default schema.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Tables {

    /**
     * The table <code>actor</code>.
     */
    public static final Actor ACTOR = Actor.ACTOR;

    /**
     * The table <code>actor_info</code>.
     */
    public static final ActorInfo ACTOR_INFO = ActorInfo.ACTOR_INFO;

    /**
     * The table <code>address</code>.
     */
    public static final Address ADDRESS = Address.ADDRESS;

    /**
     * The table <code>category</code>.
     */
    public static final Category CATEGORY = Category.CATEGORY;

    /**
     * The table <code>city</code>.
     */
    public static final City CITY = City.CITY;

    /**
     * The table <code>country</code>.
     */
    public static final Country COUNTRY = Country.COUNTRY;

    /**
     * The table <code>customer</code>.
     */
    public static final Customer CUSTOMER = Customer.CUSTOMER;

    /**
     * The table <code>customer_list</code>.
     */
    public static final CustomerList CUSTOMER_LIST = CustomerList.CUSTOMER_LIST;

    /**
     * The table <code>film</code>.
     */
    public static final Film FILM = Film.FILM;

    /**
     * The table <code>film_actor</code>.
     */
    public static final FilmActor FILM_ACTOR = FilmActor.FILM_ACTOR;

    /**
     * The table <code>film_category</code>.
     */
    public static final FilmCategory FILM_CATEGORY = FilmCategory.FILM_CATEGORY;

    /**
     * The table <code>film_in_stock</code>.
     */
    public static final FilmInStock FILM_IN_STOCK = FilmInStock.FILM_IN_STOCK;

    /**
     * Call <code>film_in_stock</code>.
     */
    public static Result<FilmInStockRecord> FILM_IN_STOCK(
          Configuration configuration
        , Integer pFilmId
        , Integer pStoreId
    ) {
        return configuration.dsl().selectFrom(top.oatnil.dbmlfromjooq.demo.generated.tables.FilmInStock.FILM_IN_STOCK.call(
              pFilmId
            , pStoreId
        )).fetch();
    }

    /**
     * Get <code>film_in_stock</code> as a table.
     */
    public static FilmInStock FILM_IN_STOCK(
          Integer pFilmId
        , Integer pStoreId
    ) {
        return top.oatnil.dbmlfromjooq.demo.generated.tables.FilmInStock.FILM_IN_STOCK.call(
            pFilmId,
            pStoreId
        );
    }

    /**
     * Get <code>film_in_stock</code> as a table.
     */
    public static FilmInStock FILM_IN_STOCK(
          Field<Integer> pFilmId
        , Field<Integer> pStoreId
    ) {
        return top.oatnil.dbmlfromjooq.demo.generated.tables.FilmInStock.FILM_IN_STOCK.call(
            pFilmId,
            pStoreId
        );
    }

    /**
     * The table <code>film_list</code>.
     */
    public static final FilmList FILM_LIST = FilmList.FILM_LIST;

    /**
     * The table <code>film_not_in_stock</code>.
     */
    public static final FilmNotInStock FILM_NOT_IN_STOCK = FilmNotInStock.FILM_NOT_IN_STOCK;

    /**
     * Call <code>film_not_in_stock</code>.
     */
    public static Result<FilmNotInStockRecord> FILM_NOT_IN_STOCK(
          Configuration configuration
        , Integer pFilmId
        , Integer pStoreId
    ) {
        return configuration.dsl().selectFrom(top.oatnil.dbmlfromjooq.demo.generated.tables.FilmNotInStock.FILM_NOT_IN_STOCK.call(
              pFilmId
            , pStoreId
        )).fetch();
    }

    /**
     * Get <code>film_not_in_stock</code> as a table.
     */
    public static FilmNotInStock FILM_NOT_IN_STOCK(
          Integer pFilmId
        , Integer pStoreId
    ) {
        return top.oatnil.dbmlfromjooq.demo.generated.tables.FilmNotInStock.FILM_NOT_IN_STOCK.call(
            pFilmId,
            pStoreId
        );
    }

    /**
     * Get <code>film_not_in_stock</code> as a table.
     */
    public static FilmNotInStock FILM_NOT_IN_STOCK(
          Field<Integer> pFilmId
        , Field<Integer> pStoreId
    ) {
        return top.oatnil.dbmlfromjooq.demo.generated.tables.FilmNotInStock.FILM_NOT_IN_STOCK.call(
            pFilmId,
            pStoreId
        );
    }

    /**
     * The table <code>inventory</code>.
     */
    public static final Inventory INVENTORY = Inventory.INVENTORY;

    /**
     * The table <code>language</code>.
     */
    public static final Language LANGUAGE = Language.LANGUAGE;

    /**
     * The table <code>nicer_but_slower_film_list</code>.
     */
    public static final NicerButSlowerFilmList NICER_BUT_SLOWER_FILM_LIST = NicerButSlowerFilmList.NICER_BUT_SLOWER_FILM_LIST;

    /**
     * The table <code>payment</code>.
     */
    public static final Payment PAYMENT = Payment.PAYMENT;

    /**
     * The table <code>rental</code>.
     */
    public static final Rental RENTAL = Rental.RENTAL;

    /**
     * The table <code>rewards_report</code>.
     */
    public static final RewardsReport REWARDS_REPORT = RewardsReport.REWARDS_REPORT;

    /**
     * Call <code>rewards_report</code>.
     */
    public static Result<RewardsReportRecord> REWARDS_REPORT(
          Configuration configuration
        , Integer minMonthlyPurchases
        , BigDecimal minDollarAmountPurchased
    ) {
        return configuration.dsl().selectFrom(top.oatnil.dbmlfromjooq.demo.generated.tables.RewardsReport.REWARDS_REPORT.call(
              minMonthlyPurchases
            , minDollarAmountPurchased
        )).fetch();
    }

    /**
     * Get <code>rewards_report</code> as a table.
     */
    public static RewardsReport REWARDS_REPORT(
          Integer minMonthlyPurchases
        , BigDecimal minDollarAmountPurchased
    ) {
        return top.oatnil.dbmlfromjooq.demo.generated.tables.RewardsReport.REWARDS_REPORT.call(
            minMonthlyPurchases,
            minDollarAmountPurchased
        );
    }

    /**
     * Get <code>rewards_report</code> as a table.
     */
    public static RewardsReport REWARDS_REPORT(
          Field<Integer> minMonthlyPurchases
        , Field<BigDecimal> minDollarAmountPurchased
    ) {
        return top.oatnil.dbmlfromjooq.demo.generated.tables.RewardsReport.REWARDS_REPORT.call(
            minMonthlyPurchases,
            minDollarAmountPurchased
        );
    }

    /**
     * The table <code>sales_by_film_category</code>.
     */
    public static final SalesByFilmCategory SALES_BY_FILM_CATEGORY = SalesByFilmCategory.SALES_BY_FILM_CATEGORY;

    /**
     * The table <code>sales_by_store</code>.
     */
    public static final SalesByStore SALES_BY_STORE = SalesByStore.SALES_BY_STORE;

    /**
     * The table <code>staff</code>.
     */
    public static final Staff STAFF = Staff.STAFF;

    /**
     * The table <code>staff_list</code>.
     */
    public static final StaffList STAFF_LIST = StaffList.STAFF_LIST;

    /**
     * The table <code>store</code>.
     */
    public static final Store STORE = Store.STORE;
}
