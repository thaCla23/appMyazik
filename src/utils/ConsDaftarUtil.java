package utils;

import models.Daftar;

public class ConsDaftarUtil {
    
    public static final String DRIVER_MYSQL = "com.mysql.jdbc.Driver";
    public static Daftar auth = null;
    
    public static int getId() {
        return auth.getId(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    public static String getUsername() {
        return auth.getUsername(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    public static String getWaktuPergi() {
        return auth.getWaktuPergi(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    public static String getWaktuKembali() {
        return auth.getWaktuKembali(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    public static String getTujuan() {
        return auth.getTujuan(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    public static String getAlasan() {
        return auth.getAlasan(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    public static String getIzinDosen() {
        return auth.getIzinDosen(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    public static String getIzinKeasramaan() {
        return auth.getIzinKeasramaan(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
   
    
}
