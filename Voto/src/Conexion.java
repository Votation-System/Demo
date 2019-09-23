import java.sql.Connection;
import java.sql.DriverManager;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author kevin
 */
public class Conexion {

    public static Connection getCConcet() {

        try {
            Class.forName("oracle.jdbc.OracleDriver");
            Connection conexion = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "Kevin", "1234");
            return conexion;

        } catch (Exception e) {

            System.out.println(e);
        }
        return null;

    }
}