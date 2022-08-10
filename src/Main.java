public class Main {
    public static void main(String[] args) {
        int[] arr = generateRandomArray();
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];


        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");
        int min = arr[0];
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) ;
            {
                min = arr[i];
            }
            if (max < arr[i]) ;
            {
                max = arr[i];
            }

        }
        System.out.println("Минимальная сумма трат за день составила " + min + " рублей");
        System.out.println("Максимальная сумма трат за день составила " + max + " рублей");
    double midl = (double) sum / arr.length;
        System.out.println("Средняя сумма трат за месяц составила " + midl + " рублей");

        char symb;
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = 0; i < reverseFullName.length/2 ; i++) {
            symb = reverseFullName[i];
            reverseFullName[i] = reverseFullName[reverseFullName.length-1-i];
            reverseFullName[reverseFullName.length-1-i] = symb;
         {
             System.out.println(symb);
        }
        }


    }
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
}