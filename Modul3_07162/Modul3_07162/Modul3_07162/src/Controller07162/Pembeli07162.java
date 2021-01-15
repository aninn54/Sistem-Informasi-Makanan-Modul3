package Controller07162;
import Entity07162.PembeliEntity07162;
public class Pembeli07162 implements ControllerInterface07162 {
    AllObjectModel07162 allobject = new AllObjectModel07162();
    int indexLogin = 0;
    public Pembeli07162() {
    }
     @Override
    public void login(String nama, String password) {
        indexLogin = AllObjectModel07162.pembeliModel.cekData(nama, password);
    }
     public void insertPembeli(String nama, String password,String alamat, String no_telp) {
      PembeliEntity07162 pembeliModel = new PembeliEntity07162(nama, password, alamat, no_telp);
        allobject.pembeliModel.insertPembeli(pembeliModel);
    }
}
