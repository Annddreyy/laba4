import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int[] mas = new int[14];
        for (int i = 0; i < 14; i++){
            System.out.println("Введите элемент: ");
            mas[i] = input.nextInt();
        }
        System.out.println(Arrays.toString(mas));
        combSort(mas);
        System.out.println(Arrays.toString(mas));
    }
    public static int[] combSort(int[] mas){
        double factor = 1.247;
        int step = mas.length - 1;
        while (step >= 1) {
            for (int i = 0; i + step < mas.length; ++i) {
                if (mas[i] > 0 && mas[i + step] > 0){
                    if (mas[i] > mas[i + step]) {
                        swap(mas, i, i + step);
                    }
                }
            }
            step /= factor;
        }
        return mas;
    }

    static void swap(int[] mas, int i, int j){
        int temp = mas[i];
        mas[i] = mas[j];
        mas[j] = temp;
    }
}