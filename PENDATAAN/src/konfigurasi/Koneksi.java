package konfigurasi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author icank
 */
public class Koneksi {
    
    // method untuk koneksi ke database
    public static Connection getConnection() {
        Connection conn = null;
        String url = "jdbc:mysql://localhost/mahasiswa";    // untuk url
        String user = "icank";          // untuk username
        String password = "brantika";   // untuk password
        
        try {
            conn = DriverManager.getConnection(url, user, password);
        } catch (SQLException e) {
            System.out.println(e);
        }
        return conn;
    }
    
    public static void main(String[] args) {
        
        // memanggil method dan mencoba menghubungkan ke database
        try {
            Connection c = Koneksi.getConnection();
            System.out.println(String.format("mengubungkan ke database %s " + "berhasil.", c.getCatalog()));
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
}
