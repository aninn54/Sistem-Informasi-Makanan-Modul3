package Model07162;
import Entity07162.PembeliEntity07162;
import java.util.ArrayList;
public class PembeliModel07162 implements ModelInterface07162 {
    private ArrayList<PembeliEntity07162> pembeliEntityArrayList;
    
    public PembeliModel07162()
    {
        pembeliEntityArrayList = new ArrayList<PembeliEntity07162>();
    }
    
    public void insertPembeli(PembeliEntity07162 pembeli)
    {
        pembeliEntityArrayList.add(pembeli);
    }
    
    @Override
    public void view(){
        for(PembeliEntity07162 pembeli : pembeliEntityArrayList)
        {
            System.out.print(pembeli.getNama());
            System.out.print(pembeli.getPassword());
            System.out.print(pembeli.getAlamat());
            System.out.print(pembeli.getNoTelp());
            System.out.println();
        }
    }

    public int cekData(String nama, String password){
        int loop = 0;
        while (!pembeliEntityArrayList.get(loop).getNama().equals(nama) && 
                !pembeliEntityArrayList.get(loop).getPassword().equals(password)){
            loop++;
        }
        return loop;
    }
}
