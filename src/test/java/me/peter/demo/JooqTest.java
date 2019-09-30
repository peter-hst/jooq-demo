package me.peter.demo;

import me.peter.demo.db.tables.FndUser;
import me.peter.demo.db.tables.records.FndUserRecord;
import org.jooq.DSLContext;
import org.jooq.Record;
import org.jooq.Result;
import org.jooq.SQLDialect;
import org.jooq.impl.DSL;
import org.junit.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.util.List;

import static me.peter.demo.db.Tables.FND_USER;

public class JooqTest {
    @Test
    public void select() {
        String userName = "root";
        String password = "admin";
        String url = "jdbc:mysql://127.0.0.1:3306/rbca?useUnicode=true&characterEncoding=utf-8&useSSL=false&serverTimezone=GMT";
        Connection conn = null;

        try {
            conn = DriverManager.getConnection(url, userName, password);
            // 使用JOOQ进行查询
            DSLContext create = DSL.using(conn, SQLDialect.MYSQL);
            Result<Record> result = create.select().from(FND_USER).fetch();
            for (Record r : result) {
                Long id = r.getValue(FND_USER.ID);
                String name = r.getValue(FND_USER.NAME);
                Integer age = r.getValue(FND_USER.AGE);
                LocalDateTime createdTime = r.getValue(FND_USER.CREATED_TIME);
                String intro = r.getValue(FND_USER.INTRO);
                System.out.println("ID: " + id + " name: " + name + " age: " + age + ", created time:" + createdTime.toString());
            }
            System.out.println("---------------------------------------------------------");
            List<FndUserRecord> users =create.select().from(FND_USER).fetchInto(FndUserRecord.class);
            users.forEach(System.out::println);
//            System.out.println(create.select().from(FND_USER).fetch().formatHTML());
            System.out.println(create.select().from(FND_USER).fetch().formatJSON());
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
