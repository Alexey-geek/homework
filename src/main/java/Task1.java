public class Task1 {
    public static void main(String[] args) {
        int[] mas ={0 , 0 , 0 , 1 , 1 , 1 , 0 , 0 , 0};
        System.out.println("Было это : ");
        for (int i = 0; i < 9; i++) {
            System.out.print(mas[i] + " ");
            if(mas[i] == 0){
                mas[i] = 1;
            }else{
                mas[i] = 0;
            }
        }
        System.out.println("");
        System.out.println("Стало это : ");
        for (int i = 0; i < 9; i++) {
            System.out.print(mas[i] + " ");
        }
    }
}
