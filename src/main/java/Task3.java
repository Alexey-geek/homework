public class Task3 {
    public static void main(String[] args) {
        int[] mas = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println("Должно быть верно : ");
        for (int i = 0; i < mas.length; i++) {
            if(mas[i] < 6)mas[i] *= 2;
            System.out.print(mas[i] + " ");
        }
    }
}
