import java.util.Scanner;

public class Task6 {
    //сделаю как написано, но я бы массив глобализовал), а в след задании тем более)))
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
