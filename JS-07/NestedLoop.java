public class NestedLoop {
    public static void main(String[] args){
        int baris, kolom, hasil, MAX = 8;

        for(baris = 1; baris <= MAX; baris++){
            for(kolom = 1; kolom <= MAX; kolom++){
                hasil = baris * kolom;
                System.out.print("\t" + hasil);
            }
            System.out.println("");
        }
    }
}