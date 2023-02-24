import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        /*
        Java döngüler ile girilen sayıya kadar olan 4 ve 5'in kuvvetlerini ekrana yazdıran programı yazıyoruz.
         */
        int number, sum4=1, sum5=1;
        Scanner input = new Scanner(System.in);
        System.out.print("Sayı Giriniz : ");
        number = input.nextInt();

        for(int i = 1 ; i<=number ; i++){
            sum4 *= 4;
            sum5 *= 5;
            System.out.println("4 ^ "+ i + " = "+sum4);
            System.out.println("5 ^ "+ i + " = "+sum5);
        }
    }
}