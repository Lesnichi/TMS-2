public class RunClassWork2 {
    public static void main(String[] args) {
        int a = 1;
        int b = 256;
        int sum = 0;

        while (a <= b) {
            sum = sum + a;
            a = a * 2;
        }
        System.out.println("Сумма диапазона 1+2+4+8+...+256 = " + sum);
    }
}
