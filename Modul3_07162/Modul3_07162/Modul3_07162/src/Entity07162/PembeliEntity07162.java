package Entity07162;

public class PembeliEntity07162 extends AbstractEntity07162 {
    String alamat;
    String no_telp;
    
    public PembeliEntity07162(String nama,String password,String alamat, String no_telp){
        super (nama,password);
        this.alamat = alamat;
        this.no_telp = no_telp;
    }
    
    @Override
     public String getNama(){
         return nama;
     }
     public String getAlamat() {
        return alamat;
    }
    public String getNoTelp() {
        return no_telp;
    }
}
