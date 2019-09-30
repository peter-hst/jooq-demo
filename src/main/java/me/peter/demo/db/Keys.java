/*
 * This file is generated by jOOQ.
 */
package me.peter.demo.db;


import javax.annotation.Generated;

import me.peter.demo.db.tables.FndUser;
import me.peter.demo.db.tables.records.FndUserRecord;

import org.jooq.Identity;
import org.jooq.UniqueKey;
import org.jooq.impl.Internal;


/**
 * A class modelling foreign key relationships and constraints of tables of 
 * the <code>rbca</code> schema.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.12.1"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Keys {

    // -------------------------------------------------------------------------
    // IDENTITY definitions
    // -------------------------------------------------------------------------

    public static final Identity<FndUserRecord, Long> IDENTITY_FND_USER = Identities0.IDENTITY_FND_USER;

    // -------------------------------------------------------------------------
    // UNIQUE and PRIMARY KEY definitions
    // -------------------------------------------------------------------------

    public static final UniqueKey<FndUserRecord> KEY_FND_USER_PRIMARY = UniqueKeys0.KEY_FND_USER_PRIMARY;

    // -------------------------------------------------------------------------
    // FOREIGN KEY definitions
    // -------------------------------------------------------------------------


    // -------------------------------------------------------------------------
    // [#1459] distribute members to avoid static initialisers > 64kb
    // -------------------------------------------------------------------------

    private static class Identities0 {
        public static Identity<FndUserRecord, Long> IDENTITY_FND_USER = Internal.createIdentity(FndUser.FND_USER, FndUser.FND_USER.ID);
    }

    private static class UniqueKeys0 {
        public static final UniqueKey<FndUserRecord> KEY_FND_USER_PRIMARY = Internal.createUniqueKey(FndUser.FND_USER, "KEY_fnd_user_PRIMARY", FndUser.FND_USER.ID);
    }
}