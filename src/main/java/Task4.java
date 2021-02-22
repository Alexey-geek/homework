public class Task4 {
    public static void main(String[] args) {
        int[][] mas = new int[5][5];
        System.out.println("Как скажите : ");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if(i == j)mas[i][j] = 1;
                System.out.print(mas[i][j] + " ");
            }
            System.out.println("");
        }
        /*Если бы ни вывод заполнил бы его так :
        for (int i = 0; i < 5; i++) {
           mas[i][i] = 1;
        }
        */
    }
}
