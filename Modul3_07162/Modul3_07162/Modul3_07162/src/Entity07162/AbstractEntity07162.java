package Entity07162;

public abstract class AbstractEntity07162 {
    public String nama,password;
    
    public AbstractEntity07162(String nama,String password){
        this.nama = nama;
        this.password = password;
    }
    public AbstractEntity07162 (){
    }
    
    public abstract String getNama();
    
    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
}
