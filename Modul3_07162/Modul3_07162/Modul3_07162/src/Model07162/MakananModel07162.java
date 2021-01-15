package Model07162;
import Entity07162.MakananEntity07162;
import java.util.ArrayList;
public class MakananModel07162 {
    public ArrayList<MakananEntity07162> datamakanan;
    
    public MakananModel07162(){
        datamakanan = new ArrayList<MakananEntity07162>();
    }
     public void Insert(MakananEntity07162 makanan){
        datamakanan.add(makanan);
     }
    public void view()
    {
        
        for (MakananEntity07162 makanan : datamakanan)
        {
            System.out.println("Nama  Makanan = "+makanan.getNamaMakanan());
            System.out.println("Jumlah Makanan = "+makanan.getJumlahMakanan());
            System.out.println("Harga = "+makanan.getHarga());
            System.out.println("==========================================");
        }
    }
    
    public void remove(int namamakanan) {
        datamakanan.remove(namamakanan);
    }
    
    public void update(String namamakanan,String newjumlah_makanan,String newharga)
    {
        for(int i=0;i<datamakanan.size();i++)
        {
            if(namamakanan.equals(datamakanan.get(i).getNamaMakanan()))
            {
                datamakanan.get(i).harga=newharga;
                datamakanan.get(i).jumlah_makanan=newjumlah_makanan;
                System.out.println("Data Telah DI Update");
                System.out.println("==========================================");
            }
        }
    }
    public void update1(String namamakanan,String newjumlah_makanan,String newharga){
        for(int i=0;i<datamakanan.size();i++)
                {
                    if(namamakanan.equals(datamakanan.get(i).getNamaMakanan()))
                    {
                        update(namamakanan,newjumlah_makanan,newharga);
                    }
                    else
                    {
                        System.out.println("Makanan Tidak Tersedia");
                        System.out.println("==========================================");
                    }
                }
    }
    public ArrayList<MakananEntity07162> getMakananEntityArrayList(){
        return datamakanan;
    }
    public MakananEntity07162 getMakananEntityArrayList(int index){
        return datamakanan.get(index);
    }
}
