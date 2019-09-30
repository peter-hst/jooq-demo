/*
 * This file is generated by jOOQ.
 */
package me.peter.demo.db.tables;


import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import me.peter.demo.db.Indexes;
import me.peter.demo.db.Keys;
import me.peter.demo.db.Rbca;
import me.peter.demo.db.tables.records.FndUserRecord;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row10;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.12.1"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class FndUser extends TableImpl<FndUserRecord> {

    private static final long serialVersionUID = 998490523;

    /**
     * The reference instance of <code>rbca.fnd_user</code>
     */
    public static final FndUser FND_USER = new FndUser();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<FndUserRecord> getRecordType() {
        return FndUserRecord.class;
    }

    /**
     * The column <code>rbca.fnd_user.id</code>. 主键
     */
    public final TableField<FndUserRecord, Long> ID = createField(DSL.name("id"), org.jooq.impl.SQLDataType.BIGINT.nullable(false).identity(true), this, "主键");

    /**
     * The column <code>rbca.fnd_user.name</code>. 姓名
     */
    public final TableField<FndUserRecord, String> NAME = createField(DSL.name("name"), org.jooq.impl.SQLDataType.VARCHAR(128), this, "姓名");

    /**
     * The column <code>rbca.fnd_user.age</code>. 年龄
     */
    public final TableField<FndUserRecord, Integer> AGE = createField(DSL.name("age"), org.jooq.impl.SQLDataType.INTEGER, this, "年龄");

    /**
     * The column <code>rbca.fnd_user.created_time</code>. 创建时间
     */
    public final TableField<FndUserRecord, LocalDateTime> CREATED_TIME = createField(DSL.name("created_time"), org.jooq.impl.SQLDataType.LOCALDATETIME, this, "创建时间");

    /**
     * The column <code>rbca.fnd_user.updated_time</code>. 修改时间
     */
    public final TableField<FndUserRecord, LocalDateTime> UPDATED_TIME = createField(DSL.name("updated_time"), org.jooq.impl.SQLDataType.LOCALDATETIME, this, "修改时间");

    /**
     * The column <code>rbca.fnd_user.price</code>. 货币类型
     */
    public final TableField<FndUserRecord, BigDecimal> PRICE = createField(DSL.name("price"), org.jooq.impl.SQLDataType.DECIMAL(16, 2), this, "货币类型");

    /**
     * The column <code>rbca.fnd_user.summary</code>. 简述
     */
    public final TableField<FndUserRecord, String> SUMMARY = createField(DSL.name("summary"), org.jooq.impl.SQLDataType.CLOB, this, "简述");

    /**
     * The column <code>rbca.fnd_user.intro</code>. 介绍
     */
    public final TableField<FndUserRecord, String> INTRO = createField(DSL.name("intro"), org.jooq.impl.SQLDataType.CLOB, this, "介绍");

    /**
     * The column <code>rbca.fnd_user.lng</code>. 经度
     */
    public final TableField<FndUserRecord, BigDecimal> LNG = createField(DSL.name("lng"), org.jooq.impl.SQLDataType.DECIMAL(20, 15), this, "经度");

    /**
     * The column <code>rbca.fnd_user.lat</code>. 纬度
     */
    public final TableField<FndUserRecord, BigDecimal> LAT = createField(DSL.name("lat"), org.jooq.impl.SQLDataType.DECIMAL(24, 20), this, "纬度");

    /**
     * Create a <code>rbca.fnd_user</code> table reference
     */
    public FndUser() {
        this(DSL.name("fnd_user"), null);
    }

    /**
     * Create an aliased <code>rbca.fnd_user</code> table reference
     */
    public FndUser(String alias) {
        this(DSL.name(alias), FND_USER);
    }

    /**
     * Create an aliased <code>rbca.fnd_user</code> table reference
     */
    public FndUser(Name alias) {
        this(alias, FND_USER);
    }

    private FndUser(Name alias, Table<FndUserRecord> aliased) {
        this(alias, aliased, null);
    }

    private FndUser(Name alias, Table<FndUserRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> FndUser(Table<O> child, ForeignKey<O, FndUserRecord> key) {
        super(child, key, FND_USER);
    }

    @Override
    public Schema getSchema() {
        return Rbca.RBCA;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.FND_USER_PRIMARY);
    }

    @Override
    public Identity<FndUserRecord, Long> getIdentity() {
        return Keys.IDENTITY_FND_USER;
    }

    @Override
    public UniqueKey<FndUserRecord> getPrimaryKey() {
        return Keys.KEY_FND_USER_PRIMARY;
    }

    @Override
    public List<UniqueKey<FndUserRecord>> getKeys() {
        return Arrays.<UniqueKey<FndUserRecord>>asList(Keys.KEY_FND_USER_PRIMARY);
    }

    @Override
    public FndUser as(String alias) {
        return new FndUser(DSL.name(alias), this);
    }

    @Override
    public FndUser as(Name alias) {
        return new FndUser(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public FndUser rename(String name) {
        return new FndUser(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public FndUser rename(Name name) {
        return new FndUser(name, null);
    }

    // -------------------------------------------------------------------------
    // Row10 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row10<Long, String, Integer, LocalDateTime, LocalDateTime, BigDecimal, String, String, BigDecimal, BigDecimal> fieldsRow() {
        return (Row10) super.fieldsRow();
    }
}