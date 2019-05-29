package com.objpool;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionPool extends ObjectPool<Connection> {

    String url;
    String usr;
    String passwd;

    public ConnectionPool(String url, String usr, String passwd) {
        this.url = url;
        this.usr = usr;
        this.passwd = passwd;
    }

    @Override
    public void expiry(Connection o) {
        try {
            o.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public Connection create() {
        Connection connection = null;
        try {
            connection =  DriverManager.getConnection(url, usr, passwd);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }

    @Override
    public boolean validate(Connection o) {
        try {
            return   (!o.isClosed());
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
}
