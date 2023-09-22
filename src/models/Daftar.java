package models;

public class Daftar {
    private Integer id;
    private String username;
    private String waktu_pergi;
    private String waktu_kembali;
    private String tujuan;
    private String alasan;
    private String izin_dosen;
    private String izin_keasramaan;
    
    public Daftar(Integer id, String username, String waktu_pergi, String waktu_kembali,
                String tujuan, String alasan, String izin_dosen, String izin_keasramaan
                )
    {
        this.id = id;
        this.username = username;
        this.waktu_pergi = waktu_pergi;
        this.waktu_kembali = waktu_kembali;
        this.tujuan = tujuan;
        this.alasan = alasan;
        this.izin_dosen = izin_dosen;
        this.izin_keasramaan = izin_keasramaan;
    }
    
    public Integer getId(){
        return id;
    }
    
    public void setId(Integer id){
        this.id = id;
    }
    
    public String getUsername(){
        return username;
    }
    
    public void setUsername(String username){
        this.username = username;
    }
    
    public String getWaktuPergi(){
        return waktu_pergi;
    }
    
    public void setWaktuPergi(String waktu_pergi){
        this.waktu_pergi = waktu_pergi;
    }
    
    public String getWaktuKembali(){
        return waktu_kembali;
    }
    
    public void setWaktuKembali(String waktu_kembali){
        this.waktu_kembali = waktu_kembali;
    }
    
    public String getTujuan(){
        return tujuan;
    }
    
    public void setTujuan(String tujuan){
        this.tujuan = tujuan;
    }
    
    public String getAlasan(){
        return alasan;
    }
    
    public void setAlasan(String alasan){
        this.alasan = alasan;
    }
    
    public String getIzinDosen(){
        return izin_dosen;
    }
    
    public void setIzinDosen(String izin_dosen){
        this.izin_dosen = izin_dosen;
    }
    
    public String getIzinKeasramaan(){
        return izin_keasramaan;
    }
    
    public void setIzinKeasramaan(String izin_keasramaan){
        this.izin_keasramaan = izin_keasramaan;
    }
    
    
    @Override
    public String toString(){
        return String.format("id: %d,username: %s, rencana pergi: %s, rencana kembali: %s, tujuan: %s, alasan: %s, izin dosen: %s, izin keasramaan: %s",
                getId(),
                getUsername(),
                getWaktuPergi(),
                getWaktuKembali(),
                getTujuan(),
                getAlasan(),
                getIzinDosen(),
                getIzinKeasramaan()
        );
    }
}
