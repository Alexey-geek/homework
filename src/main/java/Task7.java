import java.util.Scanner;

public class Task7 {
    public static int[] shift(int n , int[] mas){
        int reserve;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < mas.length-1; j++) {
                reserve = mas[j];
                mas[j] = mas[mas.length-1];
                mas[mas.length-1] = reserve;
            }
        }
        return mas;
        //очень хотелось бы узнать , есть ли реализация лучше , чем с вложенными циклами,но без доп массивов?
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите длину массива : ");
        int[] mas = new int[sc.nextInt()];
        System.out.println("Введите элементы массива через пробел : ");
        for (int i = 0; i < mas.length; i++) {
            mas[i] = sc.nextInt();
        }
        System.out.println("Введите длину сдвига : ");
        //т.к. cдвиг длиною в длину массива ничего не дает , сокращаю n на длину массива
        int n = sc.nextInt() % mas.length;
        //перевод n кол-ва сдвигов в лево в сдвиги в право
        if (n < 0) n = mas.length + n;
        //теперь любой сдвиг представлен ввиде положительного числа меньшого длины массива
        mas = shift(n , mas);
        for (int i = 0; i < mas.length; i++) {
            System.out.print(mas[i] + " ");
        }
    }
}