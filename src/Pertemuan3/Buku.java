package Pertemuan3;

public class Buku {
    //menentukan atribut
    
    String judulbuku, penerbit;
    int tahun, idbuku, jumlahbuku;
    
    //membuat method konstruktor
    Buku(int idbuku, String judulbuku, String penerbit, int jumlahbuku, int tahun){
        this.idbuku = idbuku;
        this.judulbuku = judulbuku;
        this.penerbit = penerbit;
        this.jumlahbuku = jumlahbuku;
        this.tahun = tahun;
    }
    
    //membuat method mutator
    void setupdateBuku() {
        jumlahbuku = jumlahbuku + 20;
    }
    
    //membuat method accessor
    int getupdateBuku() {
        return jumlahbuku;
    }
    
    //membuat method/fungsi
    void tampilData() {
        System.out.println("ID Buku        :"+idbuku);
        System.out.println("Judul Buku     :"+judulbuku);
        System.out.println("Penerbit       :"+penerbit);
        System.out.println("Jumlah Buku    :"+jumlahbuku);
        System.out.println("Tahun          :"+tahun);
    }
}


