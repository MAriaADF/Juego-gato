/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;
import java.sql.*;
/**
 *
 * @author Hellen Lopez A-Alejandro Salas
 */
public class Conexion {
 public Connection con;
 public Statement st;
 public ResultSet rs;
 public static Conexion cone = new Conexion();
 
    public Conexion() {
        
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            this.con = DriverManager.getConnection("jdbc:sqlserver://HELLEN\\SQLEXPRESSS:1433;databaseName=gato;user=sa; password=123456;");
            this.st= con.createStatement();
            System.out.println("Conectado.");
        }catch (Exception ex) {
            System.out.println("Error." + ex.getMessage());
        }        
    }
    public Connection getCon() {
        return con;
    }
    public void setCon(Connection cn) {
        this.con = cn;
    }
    public Statement getSt() {
        return st;
    }
    public void setSt(Statement st) {
        this.st = st;
    }
    public ResultSet getRs() {
        return rs;
    }
    public void setRs(ResultSet rs) {
        this.rs = rs;
    }
}
