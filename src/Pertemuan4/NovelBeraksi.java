package Pertemuan4;

public class NovelBeraksi {
    public static void main(String[] args) {
        Novel Novel1 = new Novel();
        
        Novel1.setJudul("Bumi Manusia");
        Novel1.setPenerbit("Andi");   
        Novel1.setHarga (25000);
        
    System.out.println("Judul Novel: "+Novel1.getJudul());
    System.out.println("Penerbit: "+Novel1.getPenerbit());
    System.out.println("Harga Novel: "+Novel1.getHarga());
    }
    
}
