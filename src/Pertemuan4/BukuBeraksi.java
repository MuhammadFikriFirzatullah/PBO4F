package Pertemuan4;

public class BukuBeraksi {
    public static void main(String[] args) {
        //membuat objek
        Buku Buku1 = new Buku();
        Buku Buku2 = new Buku("Buku Teknik","Ziddan",200000);
        
        Buku1.setJudul("Buku Sipil");
        Buku1.setPenerbit("Erlangga");   
        Buku1.setHarga (50000);

    System.out.println("Judul Buku: "+Buku1.getJudul());
    System.out.println("Penerbit: "+Buku1.getPenerbit());
    System.out.println("HargaBuku: "+Buku1.getHarga());
    }
    
}
