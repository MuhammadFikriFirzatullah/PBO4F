package Pertemuan3;

public class Perpustakaan {
    public static void main(String[] args) {
        
        //membuat objek
        Buku buku1 = new Buku(201,"Kultur Jaringan","Alfabeta",500,2010);

        Buku buku2 = new Buku(101,"Ilmu Ekonomi","Alfabeta",320,2020);

        //memanggil method
        buku2.tampilData();
        
        buku2.setupdateBuku();
        
        System.out.println("Jumlah Buku sehabis baru ditambahkan :"+buku2.getupdateBuku());
    }
    
}
