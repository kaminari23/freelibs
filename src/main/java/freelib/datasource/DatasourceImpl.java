package freelib.datasource;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import java.beans.PropertyVetoException;
import java.net.URI;
import java.net.URISyntaxException;
import java.sql.*;


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
                Class.forName("org.postgresql.Driver");
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

        URI dbUri = null;
        try {
            dbUri = new URI(System.getenv("DATABASE_URL"));
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }

        String username = dbUri.getUserInfo().split(":")[0];
        String password = dbUri.getUserInfo().split(":")[1];
        String dbUrl = "jdbc:postgresql://" + dbUri.getHost() + ':' + dbUri.getPort() + dbUri.getPath();

//        String dbUrl = "postgresql://owjooptpiaoocv:3096c3c2000af40d8dbcf01ce44e1c804c80a769ed90738fe48ef47f38366507@ec2-54-247-125-38.eu-west-1.compute.amazonaws.com:5432/dc9pg5lult5tsd";
//        String username = "owjooptpiaoocv";
//        String password = "3096c3c2000af40d8dbcf01ce44e1c804c80a769ed90738fe48ef47f38366507";
     return DriverManager.getConnection(dbUrl, username, password);
    }

    private static ComboPooledDataSource dataSource;

    private static ComboPooledDataSource getPoolConnection() throws PropertyVetoException {
        dataSource = new ComboPooledDataSource();
        URI dbUri = null;
        try {
            dbUri = new URI(System.getenv("DATABASE_URL"));
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }

        String username = dbUri.getUserInfo().split(":")[0];
        String password = dbUri.getUserInfo().split(":")[1];
        String dbUrl = "jdbc:postgresql://" + dbUri.getHost() + ':' + dbUri.getPort() + dbUri.getPath();
        dataSource.setDriverClass("org.postgresql.Driver");
        dataSource.setJdbcUrl(dbUrl);
//       dataSource.setJdbcUrl("postgresql://owjooptpiaoocv:3096c3c2000af40d8dbcf01ce44e1c804c80a769ed90738fe48ef47f38366507@ec2-54-247-125-38.eu-west-1.compute.amazonaws.com:5432/dc9pg5lult5tsd");
        dataSource.setUser(username);
        dataSource.setPassword(password);

        dataSource.setMinPoolSize(1);
        dataSource.setMaxPoolSize(20);
        dataSource.setAcquireIncrement(5);
        return dataSource;
    }

}


