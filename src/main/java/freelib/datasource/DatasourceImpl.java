package freelib.datasource;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import java.beans.PropertyVetoException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatasourceImpl {
    private static DatasourceImpl data_source;
    private static ComboPooledDataSource pool;

    private DatasourceImpl() {
        try {
            pool = getPoolConnection();
        } catch (PropertyVetoException e) {
            e.printStackTrace();
        }
    }

    public static synchronized DatasourceImpl getInstance() {
        if (data_source == null) {
            data_source = new DatasourceImpl();
        }
        return data_source;
    }

    public Connection getConnection() {
        //-----------------simple connection------------------------------
        Connection connection = null;
        //---------------c3p0 pool connection--------------------------------------------------------
        try {
            connection = pool.getConnection();
        } catch (SQLException e) {
            e.printStackTrace();
            /**/
            try {
                Class.forName("org.postgres.jdbc.Driver");
//                Class.forName("com.mysql.jdbc.Driver");
                connection = getSimpleConnection();
            } catch (ClassNotFoundException eeee) {
                /**/
                eeee.printStackTrace();
            } catch (SQLException ee) {
                /**/
                ee.printStackTrace();
            }

        }
        /**/
        return connection;
    }

    private static Connection getSimpleConnection() throws SQLException {

        String dbUrl = "postgres://owjooptpiaoocv:3096c3c2000af40d8dbcf01ce44e1c804c80a769ed90738fe48ef47f38366507@ec2-54-247-125-38.eu-west-1.compute.amazonaws.com:5432/dc9pg5lult5tsd";
        String username = "owjooptpiaoocv";
        String password = "3096c3c2000af40d8dbcf01ce44e1c804c80a769ed90738fe48ef47f38366507";
        return DriverManager.getConnection(dbUrl, username, password);
    }

    private static ComboPooledDataSource dataSource;

    private static ComboPooledDataSource getPoolConnection() throws PropertyVetoException {
        dataSource = new ComboPooledDataSource();
        dataSource.setDriverClass("org.postgres.jdbc.Driver");

        dataSource.setJdbcUrl("postgres://owjooptpiaoocv:3096c3c2000af40d8dbcf01ce44e1c804c80a769ed90738fe48ef47f38366507@ec2-54-247-125-38.eu-west-1.compute.amazonaws.com:5432/dc9pg5lult5tsd");
        dataSource.setUser("owjooptpiaoocv");
        dataSource.setPassword("3096c3c2000af40d8dbcf01ce44e1c804c80a769ed90738fe48ef47f38366507");

        dataSource.setMinPoolSize(100);
        dataSource.setMaxPoolSize(1000);
        dataSource.setAcquireIncrement(5);
        return dataSource;
    }

}


