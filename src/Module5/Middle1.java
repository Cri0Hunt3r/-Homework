package Module5;

public class Middle1 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        int sum = 0;
        for (int i = 0; i < numbers.length; i++){
            sum += numbers[i];
        }
        System.out.println("Сумма всех чисел в массиве: " + sum);
    }
}