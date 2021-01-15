package Controller07162;
import Entity07162.MakananEntity07162;
import java.util.ArrayList;
public class MakananController07162 {
     int index1 = 0;
    public MakananController07162(){
    }
      public void Insert(String namamakanan,String jumlah_makanan, String harga){
        AllObjectModel07162.modelmakan.Insert(new MakananEntity07162(namamakanan,jumlah_makanan,harga));
    }
    
    private void Insert(MakananEntity07162 makananEntity07162) {
    }

    public void view() {
        AllObjectModel07162.modelmakan.view();
    }
    public void hapus(String namamakanan){
        AllObjectModel07162.makanan.hapus(namamakanan);
    }
    public void update(String namabarang,String jumlah_makanan, String harga){
        AllObjectModel07162.makanan.update(namabarang,jumlah_makanan,  harga);
    }
    
    public ArrayList<MakananEntity07162> cekDaftarMakanan(int index){
    return AllObjectModel07162.modelmakan.getMakananEntityArrayList();
    }
    
    public void remove(int namamakanan){
        AllObjectModel07162.modelmakan.remove(namamakanan);
    }
}
