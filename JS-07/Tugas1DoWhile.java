import java.util.Scanner;
public class Tugas1DoWhile {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.println("Enter nama : ");
        String nama = in.nextLine();

        int i = 0;
        do{
            System.out.println(i +". "+ nama);
            i++;
        }while(i < 10);
    }
}