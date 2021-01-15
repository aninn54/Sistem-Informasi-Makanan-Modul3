package Entity07162;

public class MakananEntity07162 {
    public String namamakanan,jumlah_makanan,harga;
    
    public MakananEntity07162 (String namamakanan, String jumlah_makanan, String harga){
        this.namamakanan = namamakanan;
        this.jumlah_makanan = jumlah_makanan;
        this.harga = harga;
    }

    public MakananEntity07162() {
	}

	public void Insert(String namamakanan,String jumlah_makanan, String harga){

    }

    public String getNamaMakanan() {
        return namamakanan;
    }
     public String getJumlahMakanan() {
        return jumlah_makanan;
    }
    
    public String getHarga() {
        return harga;
    }

}
