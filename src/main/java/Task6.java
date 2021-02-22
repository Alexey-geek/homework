import java.util.Scanner;

public class Task6 {
    //я бы массив глобализовал(не проходили поэтому не пользую)
    public static boolean checkBalance (int[] mas , int sum){
        int sumOfSomeElements = 0;
        for (int i = 0; i < mas.length; i++) {
            sumOfSomeElements += mas[i];
            if(sumOfSomeElements == sum - sumOfSomeElements) return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Введите длину массива : ");
        int sum = 0;
        int[] mas = new int[sc.nextInt()];
        System.out.println("Введите элементы массива через пробел : ");
        for (int i = 0; i < mas.length; i++) {
            mas[i] = sc.nextInt();
            sum += mas[i];
        }
        if(checkBalance(mas , sum)){
            System.out.println("Массив сбалансирован!");
        }else{
            System.out.println("Массив не сбалансирован!");
        }
    }
}
