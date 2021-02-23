import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите длину массива :");
        int length = sc.nextInt();
        int[][] mas = new int[length][length];
        for (int i = -mas.length+1; i < mas.length; i++) {
            for (int j = 0; j < mas.length; j++) {
                for (int k = 0; k < mas.length; k++) {
                    if (j == k+i) mas[j][k] = 1;
                    System.out.print(mas[j][k] + " ");
                    mas[j][k] = 0;
                }
                System.out.println("");
            }
            System.out.println("");
        }
    }
}
