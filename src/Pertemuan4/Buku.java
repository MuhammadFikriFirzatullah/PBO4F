package Pertemuan4;

public class Buku {
    //membuat atribut
    private String judul, penerbit;
    protected int harga;
    
    //membuat constructor
    public Buku(String judul, String penerbit, int harga) {
        System.out.println(" ada 3 parameter");
        this.judul = judul;
        this.penerbit = penerbit;
        this.harga = harga;
    }   
    public Buku(){
        System.out.println("no parameter");
    }
    
    //membuat mutator

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public void setPenerbit(String penerbit) {
        this.penerbit = penerbit;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }
    
    //membuat accessor

    public String getJudul() {
        return judul;
    }

    public String getPenerbit() {
        return penerbit;
    }

    public int getHarga() {
        System.out.println("superclass");
        return harga;
    }
    
    
}


