package Model07162;
import static Controller07162.AllObjectModel07162.adminModel;
import Entity07162.AdminEntity07162;
import java.util.ArrayList;
public class AdminModel07162 implements ModelInterface07162
{
        private ArrayList<AdminEntity07162> adminEntityArrayList;
        
        public AdminModel07162()
    {
        adminEntityArrayList = new ArrayList<AdminEntity07162>();
    }
        public void insertAdmin(AdminEntity07162 admin)
    {
        adminEntityArrayList.add(admin);
    }
    public void view()
    {
        for (AdminEntity07162 admin : adminEntityArrayList)
        {
            System.out.print(admin.getNama());
            System.out.print(admin.getPassword());
            System.out.println();
        }
    }
    public int cekData(String nama, String password){
        int loop = 0;
        for(AdminEntity07162 admin : adminEntityArrayList){
            if(admin.getNama().equals(nama) && admin.getPassword().equals(password)){
            break;
            }else{
                loop++;
            }
        }
        return loop;
    }
}
