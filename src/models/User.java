package models;
import java.time.LocalDateTime;

public class User {
    private Integer id;
    private String role;
    private String nama;
    private String prodi;
    private String kelas;
    private String asrama;
    private String username;
    private String password;
    private LocalDateTime signUpAt;
    
    public User(Integer id, String role, String nama, String prodi, String kelas,
                String asrama, String username, String password, LocalDateTime signUpAt
                )
    {
        this.id = id;
        this.role = role;
        this.nama = nama;
        this.prodi = prodi;
        this.kelas = kelas;
        this.asrama = asrama;
        this.username = username;
        this.password = password;
        this.signUpAt = signUpAt;
    }
    
    public Integer getId(){
        return id;
    }
    
    public void setId(Integer id){
        this.id = id;
    }
    
    public String getRole(){
        return role;
    }
    
    public void setRole(String role){
        this.role = role;
    }
    
    public String getNama(){
        return nama;
    }
    
    public void setNama(String nama){
        this.nama = nama;
    }
    
    public String getProdi(){
        return prodi;
    }
    
    public void setProdi(String prodi){
        this.prodi = prodi;
    }
    
    public String getKelas(){
        return kelas;
    }
    
    public void setKelas(String kelas){
        this.kelas = kelas;
    }
    
    public String getAsrama(){
        return asrama;
    }
    
    public void setAsrama(String asrama){
        this.asrama = asrama;
    }
    
    public String getUsername(){
        return username;
    }
    
    public void setUsername(String username){
        this.username = username;
    }
    
    public String getPassword(){
        return password;
    }
    
    public void setPassword(String password){
        this.password = password;
    }
    
    public LocalDateTime getSignUpAt(){
        return signUpAt;
    }
    
    public void setSignUpAt(LocalDateTime signUpAt){
        this.signUpAt = signUpAt;
    }
    
    @Override
    public String toString(){
        return String.format("id: %d,role: %s, nama: %s, prodi: %s, kelas: %s, asrama: %s, username: %s, password: %s, signupat: %s",
                getId(),
                getRole(),
                getNama(),
                getProdi(),
                getKelas(),
                getAsrama(),
                getUsername(),
                getPassword(),
                getSignUpAt()
        );
    }
}