import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        double [] numbers = {8.6, -2.4, -4, 2, 3.3, 6, -7, 9.2, 8.4, -7.7, -5.3, 6.6};
//        System.out.println(Arrays.toString(numbers));
        double numPositive = 0;
        int sumPositive = 0;
        boolean couNigative = false;

        for (int i = 0; i < numbers.length; i ++) {
            double number = numbers[i];
            if (number > 0 && couNigative){
                sumPositive += number;
                sumPositive ++;
            }
            else  if (number < 0){
                couNigative = true;
            }
        }
        if (sumPositive > 0) {
            double averagePositive = sumPositive / sumPositive;
            System.out.println("Среднее положительное" + averagePositive);
        } else {
            System.out.println("Не найдено положительных чисел");
        }
    }
}