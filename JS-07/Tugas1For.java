
import java.util.Scanner;
public class Tugas1For {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.println("Enter nama : ");
        String nama = in.nextLine();

        for (int i = 0; i < 10; i++) {
            System.out.println(i +". "+ nama);
        }
    }
}
