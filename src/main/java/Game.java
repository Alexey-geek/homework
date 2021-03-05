import java.util.Random;
import java.util.Scanner;

public class Game {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        Random rnd = new Random();
        while(true){
            int answer = rnd.nextInt(10);
            guessing(answer);
            if(!again()){
                break;
            }
        }
        System.out.print("GG");
    }
    public static void guessing (int answer){
        while(true) {
            System.out.println("Введите число : ");
            int userAnswer = sc.nextInt();
            if (userAnswer == answer) {
                System.out.println("Вы отгадали!");
                break;
            }else if(userAnswer > answer){
                System.out.println("Ваше число слишком большое!");
            }else{
                System.out.println("Ваше число слишком маленькое!");
            }
        }
    }
    public static boolean again (){
        do {
            System.out.println("Хотите сыграть еще(да - 1 , нет - 0)");
            int flag = sc.nextInt();
            switch (flag){
                case 0:
                    return false;
                case 1:
                    return true;
            }
        }while (true);
    }
}
