/*
 * This file is generated by jOOQ.
 */
package me.peter.demo.db;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import me.peter.demo.db.tables.FndUser;

import org.jooq.Catalog;
import org.jooq.Table;
import org.jooq.impl.SchemaImpl;


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
public class Rbca extends SchemaImpl {

    private static final long serialVersionUID = 110423659;

    /**
     * The reference instance of <code>rbca</code>
     */
    public static final Rbca RBCA = new Rbca();

    /**
     * The table <code>rbca.fnd_user</code>.
     */
    public final FndUser FND_USER = me.peter.demo.db.tables.FndUser.FND_USER;

    /**
     * No further instances allowed
     */
    private Rbca() {
        super("rbca", null);
    }


    @Override
    public Catalog getCatalog() {
        return DefaultCatalog.DEFAULT_CATALOG;
    }

    @Override
    public final List<Table<?>> getTables() {
        List result = new ArrayList();
        result.addAll(getTables0());
        return result;
    }

    private final List<Table<?>> getTables0() {
        return Arrays.<Table<?>>asList(
            FndUser.FND_USER);
    }
}
