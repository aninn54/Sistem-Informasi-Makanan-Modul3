package Entity07162;

public class AdminEntity07162 extends AbstractEntity07162 {

    public String harga;    
    public String jumlah_makanan;
     public AdminEntity07162(String nama,String password) {
        super (nama,password);
    }
     @Override
     public String getNama(){
         return nama;
     }

}