/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplikasi_pembelajaran_siswasd;

import Koneksi.*;
import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author LENOVO
 */
public class konfig {

    private static java.sql.Connection MySQLConfig;

    public static java.sql.Connection configDB() throws SQLException {
        try {
            String url = "jdbc:mysql://localhost:3306/aplikasi_pembelajaran_siswa_sd";
            String user = "root";
            String pass = "";

            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            MySQLConfig = DriverManager.getConnection(url, user, pass);
        } catch (SQLException e) {
            System.out.println("Koneksi ke Database Gagal " + e.getMessage());
        }

        return MySQLConfig;
    }

    static java.sql.Connection getConnection() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
