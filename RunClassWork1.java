public class RunClassWork1 {
    public static void main(String[] args) {
        int a = 1;
        int b = 99;
        int sum = 0;
        while (a <= b) {
            if (a % 2 != 0) {
              sum = sum + a;
            }
            a++;
        }
        System.out.println("Сумма нечетных чисел в диапазоне о 1 до 99 = " + sum);
    }
}
