package utils;

import models.User;

public class ConstUtil{
    
    public static final String DRIVER_MYSQL = "com.mysql.jdbc.Driver";
    public static User auth = null;
    
    public static String getRole() {
        return auth.getRole(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    public static String getNama() {
        return auth.getNama(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    public static String getProdi() {
        return auth.getProdi(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    public static String getKelas() {
        return auth.getKelas(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    public static String getAsrama() {
        return auth.getKelas(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    public static String getUsername() {
        return auth.getUsername(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    public static String getPassword() {
        return auth.getPassword(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
   
    
}
