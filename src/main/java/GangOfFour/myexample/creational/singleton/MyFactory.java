package GangOfFour.myexample.creational.singleton;

import java.io.IOException;
import java.sql.Connection;

public class MyFactory {
    private static volatile MyFactory instance;

    public static MyFactory getInstance(Connection conn) throws IOException {
        if (instance == null) {
            synchronized (MyFactory.class) {
                if (instance == null)
                    instance = new MyFactory(conn);
            }
        }
        return instance;
    }

    private MyFactory(Connection conn) throws IOException {
        // init factory using the database connection passed in
    }
}