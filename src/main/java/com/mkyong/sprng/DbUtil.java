package com.mkyong.sprng;

/**
 * Created by saurav on 12/26/14.
 */

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import javax.sql.DataSource;

public class DbUtil {
    private DataSource dataSource;

    public DataSource getDataSource() {
        return dataSource;
    }

    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public void initialize(){
        DataSource dataSource = getDataSource();
        try {
            Connection connection = dataSource.getConnection();
            Statement statement = connection.createStatement();
            statement.executeUpdate("CREATE TABLE PERSON (ID int(10) AUTO_INCREMENT, NAME VARCHAR(50), EMAIL VARCHAR(100), PRIMARY KEY(ID))");
            statement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
