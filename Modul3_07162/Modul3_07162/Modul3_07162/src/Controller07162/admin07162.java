package Controller07162;

import Entity07162.AdminEntity07162;
import Entity07162.MakananEntity07162;
import Entity07162.PembeliEntity07162;
import java.util.ArrayList;
public class admin07162 implements ControllerInterface07162 {
    AllObjectModel07162 allobject = new AllObjectModel07162();
    int indexLogin = 0;
    public admin07162() {    
    }
     public void dataAdmin() {
        String passwordAdmin[] = {"123"};
        String namaAdmin[] = {"Anindya"};
        String noTelpAdmin[] = {"088805577083"};
        for(int i = 0; i < passwordAdmin.length; i++) {
            AllObjectModel07162.adminModel.insertAdmin(new AdminEntity07162(passwordAdmin[i], namaAdmin[i] ));
        }
    }
       public void viewAdmin() {
        AllObjectModel07162.adminModel.view();
    }
       @Override
    public void login(String nama, String password) {
        indexLogin = AllObjectModel07162.adminModel.cekData(nama, password);
    }
}
