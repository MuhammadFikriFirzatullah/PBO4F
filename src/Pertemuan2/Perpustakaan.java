package Pertemuan2;

public class Perpustakaan {
    public static void main(String[] args) {
        
        //membuat objek
        Buku buku1 = new Buku();
        Buku buku2 = new Buku();
        Majalah mjlh1 = new Majalah();
        
        //membuat nilai pada atribut
        buku1.idbuku = 201;
        buku1.judulbuku = "Kultur Jaringan";
        buku1.penerbit = "Alfabeta";
        buku1.jumlahhalaman = "200";
        buku1.tahun = 2010;
        
        buku2.idbuku = 101;
        buku2.judulbuku = "Ilmu Ekonomi";
        buku2.penerbit = "Alfabeta";
        buku2.jumlahhalaman = "302";
        buku2.tahun = 2020;
        
        mjlh1.idmajalah = 80;
        mjlh1.judulmajalah = "Gaya Hidup";
        mjlh1.penerbit = "Erlangga";
        mjlh1.jumlahhalaman = "30";
        mjlh1.tahun = 2012;
        
        System.out.println("-------------------------");
        System.out.println("     Perpustakaan ");
        System.out.println("-----------Buku----------");
        System.out.println("ID Buku        :"+buku1.idbuku);
        System.out.println("Judul Buku     :"+buku1.judulbuku);
        System.out.println("Penerbit       :"+buku1.penerbit);
        System.out.println("Jumlah Halaman :"+buku1.jumlahhalaman);
        System.out.println("Tahun          :"+buku1.tahun);
        
        System.out.println("-------------------------");
        System.out.println("ID Buku        :"+buku2.idbuku);
        System.out.println("Judul Buku     :"+buku2.judulbuku);
        System.out.println("Penerbit       :"+buku2.penerbit);
        System.out.println("Jumlah Halaman :"+buku2.jumlahhalaman);
        System.out.println("Tahun          :"+buku2.tahun);
        
        System.out.println("---------Majalah----------");
        System.out.println("ID Majalah     :"+mjlh1.idmajalah);
        System.out.println("Judul Majalah  :"+mjlh1.judulmajalah);
        System.out.println("Penerbit       :"+mjlh1.penerbit);
        System.out.println("Jumlah Halaman :"+mjlh1.jumlahhalaman);
        System.out.println("Tahun          :"+mjlh1.tahun);
 
        
    }
    
}
