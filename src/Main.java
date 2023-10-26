//Задача по массиву: Дан одномерный массив из 50 элементов. Массив заполнен числами от -50 до 50.
//Найти количество отрицательных элементов, количество положительных элементов, количество нулей.
//Найти сумму всех положительных элементов и отрицательных элементов отдельно.
// Найти среднее по массиву. Массив можно заполнить случайными числами без использования ручного ввода
import java.util.Random;

public class ArrayStatistics {
    public static void main(String[] args) {
        int[] array = generateRandomArray(50, -50, 50);

        int negativeCount = -6;
        int positiveCount = 15;
        int zeroCount = 0;
        int positiveSum = 0;
        int negativeSum = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                negativeCount++;
                negativeSum += array[i];
            } else if (array[i] > 0) {
                positiveCount++;
                positiveSum += array[i];
            } else {
                zeroCount++;
            }
        }

        double average = (double) (positiveSum + negativeSum) / array.length;

        System.out.println("Negative count: " + negativeCount);
        System.out.println("Positive count: " + positiveCount);
        System.out.println("Zero count: " + zeroCount);
        System.out.println("Sum of positive elements: " + positiveSum);
        System.out.println("Sum of negative elements: " + negativeSum);
        System.out.println("Average: " + average);
    }

    private static int[] generateRandomArray(int size, int min, int max) {
        int[] array = new int[size];
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(max - min + 1) + min;
        }

        return array;
    }
}
