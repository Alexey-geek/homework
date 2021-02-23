import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Введите длину массива : ");
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int[] mas = new int[sc.nextInt()];
        System.out.println("Введите элементы массива через пробел : ");
        for (int i = 0; i < mas.length; i++) {
            mas[i] = sc.nextInt();
            if(mas[i] > max)max = mas[i];
            if(mas[i] < min)min = mas[i];
        }
        System.out.println("Минимум массива : " + min);
        System.out.println("Максимум массива : " + max);
    }
}
