package com.automationteststore.testCases.Demos.databaseTesting;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.sql.*;
import java.util.Properties;


// Sequel Pro - for Database
// Driver Download - https://dev.mysql.com/downloads/connector/odbc/
public class DatabaseTesting {
    // Constant for Database URL
    public static String DB_URL = "jdbc:mysql://localhost:3306/users"; // ORacle "jdbc:oracle:thin:@localhost:1521/sid"
    // Constant for Database Username
    public static String DB_USER = "root";
    // Constant for Database Password
    public static String DB_PASSWORD = null;
    // Driver
    public static String driver = "com.mysql.jdbc.Driver"; // "oracle.jdbc.driver.OracleDriver"
    // Connection object
    static Connection conn = null;
    // Statement object
    private static Statement stmt;
    // Result Set
    private static ResultSet results = null;

    // WebDriver
    // public static WebDriver dv;

    @BeforeMethod
    public void beforeClass() {
        // Intialize WebDriver
        // dv = new FirefoxDriver();

        // Properties for creating connection to database
        Properties props = new Properties();
        props.setProperty("user", "root");
        props.setProperty("password", "");

        try {
            // STEP 1: Register JDBC driver
            Class.forName(driver).newInstance();

            // STEP 2: Get connection to DB
            System.out.println("Connecting to a selected database...");
            conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
            // conn = DriverManager.getConnection(DB_URL, props);
            System.out.println("Connected database successfully...");

            // STEP 3: Statement object to send the SQL statement to the Database
            System.out.println("Creating statement...");
            stmt = conn.createStatement();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void test() throws SQLException {
        String query = "select * from user_info";
        try {
            // STEP 4: Extract data from result set
            results = stmt.executeQuery(query);
            while (results.next()) {
                int id = results.getInt("user_id");
                String last = results.getString("last_name");
                String first = results.getString("first_name");
                String city = results.getString("city");

                // Display Values
                System.out.println("ID: " + id);
                System.out.println("Last Name: " + last);
                System.out.println("First Name: " + first);
                System.out.println("City: " + city);

                // From GUI
//        		WebElement element = dv.findElement(By.id("uname"));
//        		String actualUserName = element.getText();
//        		Assert.assertEquals(actualUserName, first);
            }
            results.close();
        } catch (SQLException se) {
            // Handle errors for JDBC
            se.printStackTrace();
        } catch (Exception e) {
            // Handle errors for Class.forName
            e.printStackTrace();
        }
    }

    @AfterMethod
    public void afterClass() {
        try {
            if (results != null)
                results.close();
            if (stmt != null)
                conn.close();
            if (conn != null)
                conn.close();
        } catch (SQLException se) {
            se.printStackTrace();
        }
    }
}