package com.connection.pool;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.concurrent.LinkedBlockingQueue;

public class ConnectionPoolImpl implements ConnectionPool {

    private static final Integer MAX_SIZE = 10;
    private String url;
    private String user;
    private String password;
    private Integer max_size;
    private LinkedBlockingQueue<Connection> availableQueue;
    private LinkedBlockingQueue<Connection> usedQueue;



    public ConnectionPoolImpl(String url, String user, String password) throws SQLException {
        this.url = url;
        this.user = user;
        this.password = user;
        availableQueue = new LinkedBlockingQueue();
        initialize();
    }

    private void initialize() throws SQLException {
        for (int i = 0; i < getMax_size(); i++) {
            Connection connection = DriverManager.getConnection(this.url, this.user, this.password);
            availableQueue.add(connection);
        }
    }

    public Integer getMax_size() {
        if(max_size == null || max_size == 0) {
            return MAX_SIZE;
        }
        return max_size;
    }

    public void setMax_size(Integer max_size) {
        this.max_size = max_size;
    }

    @Override
    public synchronized Connection getConnection() throws InterruptedException {
        if (availableQueue.isEmpty()) {
            wait();
        }
        notifyAll();
        return availableQueue.poll();
    }

    @Override
    public synchronized void releaseConnection(Connection connection) {
        availableQueue.add(connection);
    }

}
