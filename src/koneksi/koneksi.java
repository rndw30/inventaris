package koneksi;

import java.sql.Connection;
import java.sql.DriverManager;


public class koneksi {
   static Connection con;
   public static Connection getConnection() {
       
     try {
         con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_inventaris","root","");
         System.out.println("Berhasil Konek");
         
     }catch (Exception e) {
         System.out.println("Gagal Konek");
     }
       return con;
   }
}

