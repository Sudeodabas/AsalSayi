public class AsalSayi {
    public static void main(String[] args) {
        // 1'den 100'e kadar olan asal sayıları bulma
        int number, j;
        boolean asal;

        for (number = 2; number <= 100; number++) {
            asal = true;

            for (j = 2; j <= Math.sqrt(number); j++) {
                if (number % j == 0) {
                    asal = false;
                    break;
                }
            }

            if (asal) {
                System.out.print(number + "-");
            }
        }
    }
}
