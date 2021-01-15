package modul3_07162;
import Entity07162.*;
import Controller07162.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Modul3_07162 {
    private static admin07162 admin = new admin07162();
    private static Pembeli07162 pembeli = new Pembeli07162();
    private static MakananController07162 makanan = new MakananController07162();
    private static Scanner input = new Scanner (System.in); 
    static int cekAdmin;
    static int cekPembeli, cekmakanan;
    public static void main(String[] args) {
        System.out.println("SELAMAT DATANG DI RUMAH MAKAN !!");
        System.out.println("==========================================");
        int pil;
         do{
        System.out.println("1. Daftar");
            System.out.println("2. Login");
            System.out.println("3. Exit");
            System.out.print("Pilih = ");
            pil = input.nextInt();
            System.out.println("==========================================");
            switch(pil){
                case 1:
                    if(pil == 1){
                           daftarpembeli() ;
            }
                    break;
                case 2 : if(pil == 2){
                            int pilLogin = 0;
            System.out.print("1. Login Admin" + "\n2. Login pembeli" + "\n Pilih : ");
                pilLogin = input.nextInt();
                if(pilLogin == 1){
                    loginAdmin();
                }else{
                    loginPembeli();
                }
            }
                    
                    break;
            }System.out.println("==========================================");
        }while (pil!=3);
    }
     static void daftarpembeli()
    {
        try{
        System.out.print("Input Nama = ");
        String nama = input.next();
        System.out.print("Input Password = ");
        String password = input.next();
        System.out.print("Alamat = ");
        String alamat = input.next();
        System.out.print("Input notelp = ");
        String no_telp = input.next();
        pembeli.insertPembeli(nama, password, alamat, no_telp);
        System.out.println("Daftar Sukses !!");
        }catch (Exception exception){
          System.out.println("Format Salah !!");
        }   
    }
    static void makanan(){
        System.out.print("INPUT NAMA MAKANAN = "); 
        String namamakanan = input.next();
        System.out.print("INPUT JUMLAH MAKANAN  = ");
        String jumlah_makanan = input.next();
        System.out.print("INPUT HARGA = ");
        String harga = input.next();
        makanan.Insert(namamakanan,jumlah_makanan,harga);
        System.out.println("==========================================");
       
    }
    static void view()
    {
        for(int i=0;i<makanan.cekDaftarMakanan(cekmakanan).size();i++)
        {
            System.out.println("Nama  Makanan = "+makanan.cekDaftarMakanan(cekmakanan).get(i).getNamaMakanan());
            System.out.println("Jumlah Makanan = "+makanan.cekDaftarMakanan(cekmakanan).get(i).getJumlahMakanan());
            System.out.println("Harga = "+makanan.cekDaftarMakanan(cekmakanan).get(i).getHarga());
            System.out.println("==========================================");
        }
    }
    static void remove(String namamakanan)
    {
        for(int i=0;i<makanan.cekDaftarMakanan(cekAdmin).size();i++)
        {
            if(namamakanan.equals(makanan.cekDaftarMakanan(i).get(i).getNamaMakanan()))
            {
                makanan.remove(i);
                System.out.println("Makanan Telah Di Hapus");
                System.out.println("==========================================");
            }
            else
            {
                System.out.println("Makanan Tidak Tersedia");
                System.out.println("==========================================");
            }
        }
    }
    static void update(String namamakanan,String jumlah_makanan, String harga)
    {
        makanan.update(namamakanan,jumlah_makanan, harga);
    }

    static void loginPembeli()
    {
        int pil;
        System.out.print("Nama Pembeli : ");
        String nama = input.next();
        System.out.print("Password : ");
        String password = input.next();
        cekPembeli= AllObjectModel07162.pembeliModel.cekData(nama, password);
        do
        {
            System.out.println("1. Data Makanan Yang Tersedia");
            System.out.println("2. Exit");
            System.out.print("Pilih = ");
            pil = input.nextInt();
            System.out.println("==========================================");
            switch(pil)
            {
            case 1:view();
                ;
                break;
            }
        }
        while (pil!=2);
    }
    static void loginAdmin(){
        int pil;
        System.out.print("Masukkan Nama Admin : ");
        String nama = input.next();
        System.out.print("Password Admin : ");
        String password = input.next();
        cekAdmin = AllObjectModel07162.adminModel.cekData(nama, password);
        do{
            System.out.println("1. Input Data Makanan");
            System.out.println("2. View Data Makanan");
            System.out.println("3. Hapus Data Makanan");
            System.out.println("4. Update Data Makanan");
            System.out.println("5. Exit");
            System.out.print("Pilih = ");
            pil = input.nextInt();
            System.out.println("==========================================");
            switch(pil){
                case 1 : makanan();
                    break;
                case 2 : view();
                    break;
                case 3 : System.out.print("Inputkan Nama makanan = ");
                         String namamakanan = input.next();
                         remove(namamakanan);
                    break;
                case 4 :  
                    for(int i=0;i<makanan.cekDaftarMakanan(cekmakanan).size();i++)
                    {   
                            System.out.print("Inputkan Nama Makanan : ");
                            namamakanan = input.next();
                            System.out.print("Inputkan Harga Baru : ");
                            String newharga = input.next();
                            System.out.print("Inputkan Jumlah Makanan : ");
                            String newjumlah_makanan = input.next();
                            makanan.Insert(namamakanan,newjumlah_makanan,newharga);
                            break;
                        
                    }
                    
            }
        }
         while(pil!=5);
    }
}
 