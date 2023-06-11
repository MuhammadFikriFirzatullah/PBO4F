package Pertemuan4;

public class Novel extends Buku {
   
    @Override
    public int getHarga() {
        System.out.println("subclass");
        return super.getHarga();
    }
}
