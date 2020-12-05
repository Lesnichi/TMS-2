public class RunClassWork3 {
    public static void main(String[] args) {
        double a = 10;
        int days = 7;
        int day = 1;
        double sum = 0;

        while (day <= days) {
            sum = sum + a;
            a = a * 1.1;
            day++;
        }
        System.out.println("За 7 дней спортсмен пробежал " + sum + " км");
    }
}
