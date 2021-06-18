/*
 * This file is generated by jOOQ.
 */
package org.jooq.example.chart.db;


import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

import org.jooq.Catalog;
import org.jooq.Configuration;
import org.jooq.Domain;
import org.jooq.Field;
import org.jooq.Result;
import org.jooq.Table;
import org.jooq.example.chart.db.tables.Actor;
import org.jooq.example.chart.db.tables.ActorInfo;
import org.jooq.example.chart.db.tables.Address;
import org.jooq.example.chart.db.tables.Category;
import org.jooq.example.chart.db.tables.City;
import org.jooq.example.chart.db.tables.Country;
import org.jooq.example.chart.db.tables.Customer;
import org.jooq.example.chart.db.tables.CustomerList;
import org.jooq.example.chart.db.tables.Film;
import org.jooq.example.chart.db.tables.FilmActor;
import org.jooq.example.chart.db.tables.FilmCategory;
import org.jooq.example.chart.db.tables.FilmInStock;
import org.jooq.example.chart.db.tables.FilmList;
import org.jooq.example.chart.db.tables.FilmNotInStock;
import org.jooq.example.chart.db.tables.Inventory;
import org.jooq.example.chart.db.tables.Language;
import org.jooq.example.chart.db.tables.NicerButSlowerFilmList;
import org.jooq.example.chart.db.tables.Payment;
import org.jooq.example.chart.db.tables.PaymentP2007_01;
import org.jooq.example.chart.db.tables.PaymentP2007_02;
import org.jooq.example.chart.db.tables.PaymentP2007_03;
import org.jooq.example.chart.db.tables.PaymentP2007_04;
import org.jooq.example.chart.db.tables.PaymentP2007_05;
import org.jooq.example.chart.db.tables.PaymentP2007_06;
import org.jooq.example.chart.db.tables.Rental;
import org.jooq.example.chart.db.tables.RewardsReport;
import org.jooq.example.chart.db.tables.SalesByFilmCategory;
import org.jooq.example.chart.db.tables.SalesByStore;
import org.jooq.example.chart.db.tables.SchemaVersion;
import org.jooq.example.chart.db.tables.Staff;
import org.jooq.example.chart.db.tables.StaffList;
import org.jooq.example.chart.db.tables.Store;
import org.jooq.example.chart.db.tables.records.FilmInStockRecord;
import org.jooq.example.chart.db.tables.records.FilmNotInStockRecord;
import org.jooq.example.chart.db.tables.records.RewardsReportRecord;
import org.jooq.impl.SchemaImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Public extends SchemaImpl {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>public</code>
     */
    public static final Public PUBLIC = new Public();

    /**
     * The table <code>public.actor</code>.
     */
    public final Actor ACTOR = Actor.ACTOR;

    /**
     * The table <code>public.actor_info</code>.
     */
    public final ActorInfo ACTOR_INFO = ActorInfo.ACTOR_INFO;

    /**
     * The table <code>public.address</code>.
     */
    public final Address ADDRESS = Address.ADDRESS;

    /**
     * The table <code>public.category</code>.
     */
    public final Category CATEGORY = Category.CATEGORY;

    /**
     * The table <code>public.city</code>.
     */
    public final City CITY = City.CITY;

    /**
     * The table <code>public.country</code>.
     */
    public final Country COUNTRY = Country.COUNTRY;

    /**
     * The table <code>public.customer</code>.
     */
    public final Customer CUSTOMER = Customer.CUSTOMER;

    /**
     * The table <code>public.customer_list</code>.
     */
    public final CustomerList CUSTOMER_LIST = CustomerList.CUSTOMER_LIST;

    /**
     * The table <code>public.film</code>.
     */
    public final Film FILM = Film.FILM;

    /**
     * The table <code>public.film_actor</code>.
     */
    public final FilmActor FILM_ACTOR = FilmActor.FILM_ACTOR;

    /**
     * The table <code>public.film_category</code>.
     */
    public final FilmCategory FILM_CATEGORY = FilmCategory.FILM_CATEGORY;

    /**
     * The table <code>public.film_in_stock</code>.
     */
    public final FilmInStock FILM_IN_STOCK = FilmInStock.FILM_IN_STOCK;

    /**
     * Call <code>public.film_in_stock</code>.
     */
    public static Result<FilmInStockRecord> FILM_IN_STOCK(
          Configuration configuration
        , Integer pFilmId
        , Integer pStoreId
    ) {
        return configuration.dsl().selectFrom(org.jooq.example.chart.db.tables.FilmInStock.FILM_IN_STOCK.call(
              pFilmId
            , pStoreId
        )).fetch();
    }

    /**
     * Get <code>public.film_in_stock</code> as a table.
     */
    public static FilmInStock FILM_IN_STOCK(
          Integer pFilmId
        , Integer pStoreId
    ) {
        return org.jooq.example.chart.db.tables.FilmInStock.FILM_IN_STOCK.call(
            pFilmId,
            pStoreId
        );
    }

    /**
     * Get <code>public.film_in_stock</code> as a table.
     */
    public static FilmInStock FILM_IN_STOCK(
          Field<Integer> pFilmId
        , Field<Integer> pStoreId
    ) {
        return org.jooq.example.chart.db.tables.FilmInStock.FILM_IN_STOCK.call(
            pFilmId,
            pStoreId
        );
    }

    /**
     * The table <code>public.film_list</code>.
     */
    public final FilmList FILM_LIST = FilmList.FILM_LIST;

    /**
     * The table <code>public.film_not_in_stock</code>.
     */
    public final FilmNotInStock FILM_NOT_IN_STOCK = FilmNotInStock.FILM_NOT_IN_STOCK;

    /**
     * Call <code>public.film_not_in_stock</code>.
     */
    public static Result<FilmNotInStockRecord> FILM_NOT_IN_STOCK(
          Configuration configuration
        , Integer pFilmId
        , Integer pStoreId
    ) {
        return configuration.dsl().selectFrom(org.jooq.example.chart.db.tables.FilmNotInStock.FILM_NOT_IN_STOCK.call(
              pFilmId
            , pStoreId
        )).fetch();
    }

    /**
     * Get <code>public.film_not_in_stock</code> as a table.
     */
    public static FilmNotInStock FILM_NOT_IN_STOCK(
          Integer pFilmId
        , Integer pStoreId
    ) {
        return org.jooq.example.chart.db.tables.FilmNotInStock.FILM_NOT_IN_STOCK.call(
            pFilmId,
            pStoreId
        );
    }

    /**
     * Get <code>public.film_not_in_stock</code> as a table.
     */
    public static FilmNotInStock FILM_NOT_IN_STOCK(
          Field<Integer> pFilmId
        , Field<Integer> pStoreId
    ) {
        return org.jooq.example.chart.db.tables.FilmNotInStock.FILM_NOT_IN_STOCK.call(
            pFilmId,
            pStoreId
        );
    }

    /**
     * The table <code>public.inventory</code>.
     */
    public final Inventory INVENTORY = Inventory.INVENTORY;

    /**
     * The table <code>public.language</code>.
     */
    public final Language LANGUAGE = Language.LANGUAGE;

    /**
     * The table <code>public.nicer_but_slower_film_list</code>.
     */
    public final NicerButSlowerFilmList NICER_BUT_SLOWER_FILM_LIST = NicerButSlowerFilmList.NICER_BUT_SLOWER_FILM_LIST;

    /**
     * The table <code>public.payment</code>.
     */
    public final Payment PAYMENT = Payment.PAYMENT;

    /**
     * The table <code>public.payment_p2007_01</code>.
     */
    public final PaymentP2007_01 PAYMENT_P2007_01 = PaymentP2007_01.PAYMENT_P2007_01;

    /**
     * The table <code>public.payment_p2007_02</code>.
     */
    public final PaymentP2007_02 PAYMENT_P2007_02 = PaymentP2007_02.PAYMENT_P2007_02;

    /**
     * The table <code>public.payment_p2007_03</code>.
     */
    public final PaymentP2007_03 PAYMENT_P2007_03 = PaymentP2007_03.PAYMENT_P2007_03;

    /**
     * The table <code>public.payment_p2007_04</code>.
     */
    public final PaymentP2007_04 PAYMENT_P2007_04 = PaymentP2007_04.PAYMENT_P2007_04;

    /**
     * The table <code>public.payment_p2007_05</code>.
     */
    public final PaymentP2007_05 PAYMENT_P2007_05 = PaymentP2007_05.PAYMENT_P2007_05;

    /**
     * The table <code>public.payment_p2007_06</code>.
     */
    public final PaymentP2007_06 PAYMENT_P2007_06 = PaymentP2007_06.PAYMENT_P2007_06;

    /**
     * The table <code>public.rental</code>.
     */
    public final Rental RENTAL = Rental.RENTAL;

    /**
     * The table <code>public.rewards_report</code>.
     */
    public final RewardsReport REWARDS_REPORT = RewardsReport.REWARDS_REPORT;

    /**
     * Call <code>public.rewards_report</code>.
     */
    public static Result<RewardsReportRecord> REWARDS_REPORT(
          Configuration configuration
        , Integer minMonthlyPurchases
        , BigDecimal minDollarAmountPurchased
    ) {
        return configuration.dsl().selectFrom(org.jooq.example.chart.db.tables.RewardsReport.REWARDS_REPORT.call(
              minMonthlyPurchases
            , minDollarAmountPurchased
        )).fetch();
    }

    /**
     * Get <code>public.rewards_report</code> as a table.
     */
    public static RewardsReport REWARDS_REPORT(
          Integer minMonthlyPurchases
        , BigDecimal minDollarAmountPurchased
    ) {
        return org.jooq.example.chart.db.tables.RewardsReport.REWARDS_REPORT.call(
            minMonthlyPurchases,
            minDollarAmountPurchased
        );
    }

    /**
     * Get <code>public.rewards_report</code> as a table.
     */
    public static RewardsReport REWARDS_REPORT(
          Field<Integer> minMonthlyPurchases
        , Field<BigDecimal> minDollarAmountPurchased
    ) {
        return org.jooq.example.chart.db.tables.RewardsReport.REWARDS_REPORT.call(
            minMonthlyPurchases,
            minDollarAmountPurchased
        );
    }

    /**
     * The table <code>public.sales_by_film_category</code>.
     */
    public final SalesByFilmCategory SALES_BY_FILM_CATEGORY = SalesByFilmCategory.SALES_BY_FILM_CATEGORY;

    /**
     * The table <code>public.sales_by_store</code>.
     */
    public final SalesByStore SALES_BY_STORE = SalesByStore.SALES_BY_STORE;

    /**
     * The table <code>public.schema_version</code>.
     */
    public final SchemaVersion SCHEMA_VERSION = SchemaVersion.SCHEMA_VERSION;

    /**
     * The table <code>public.staff</code>.
     */
    public final Staff STAFF = Staff.STAFF;

    /**
     * The table <code>public.staff_list</code>.
     */
    public final StaffList STAFF_LIST = StaffList.STAFF_LIST;

    /**
     * The table <code>public.store</code>.
     */
    public final Store STORE = Store.STORE;

    /**
     * No further instances allowed
     */
    private Public() {
        super("public", null);
    }


    @Override
    public Catalog getCatalog() {
        return DefaultCatalog.DEFAULT_CATALOG;
    }

    @Override
    public final List<Domain<?>> getDomains() {
        return Arrays.asList(
            Domains.YEAR
        );
    }

    @Override
    public final List<Table<?>> getTables() {
        return Arrays.asList(
            Actor.ACTOR,
            ActorInfo.ACTOR_INFO,
            Address.ADDRESS,
            Category.CATEGORY,
            City.CITY,
            Country.COUNTRY,
            Customer.CUSTOMER,
            CustomerList.CUSTOMER_LIST,
            Film.FILM,
            FilmActor.FILM_ACTOR,
            FilmCategory.FILM_CATEGORY,
            FilmInStock.FILM_IN_STOCK,
            FilmList.FILM_LIST,
            FilmNotInStock.FILM_NOT_IN_STOCK,
            Inventory.INVENTORY,
            Language.LANGUAGE,
            NicerButSlowerFilmList.NICER_BUT_SLOWER_FILM_LIST,
            Payment.PAYMENT,
            PaymentP2007_01.PAYMENT_P2007_01,
            PaymentP2007_02.PAYMENT_P2007_02,
            PaymentP2007_03.PAYMENT_P2007_03,
            PaymentP2007_04.PAYMENT_P2007_04,
            PaymentP2007_05.PAYMENT_P2007_05,
            PaymentP2007_06.PAYMENT_P2007_06,
            Rental.RENTAL,
            RewardsReport.REWARDS_REPORT,
            SalesByFilmCategory.SALES_BY_FILM_CATEGORY,
            SalesByStore.SALES_BY_STORE,
            SchemaVersion.SCHEMA_VERSION,
            Staff.STAFF,
            StaffList.STAFF_LIST,
            Store.STORE
        );
    }
}
