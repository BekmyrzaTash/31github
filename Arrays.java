public class Arrays {
        public static void main(String[] args) {

            int[] numbers = {1, 2, 3, 4, 5};


            System.out.println("Array elements:");
            for (int i = 0; i < numbers.length; i++) {
                System.out.println("numbers[" + i + "] = " + numbers[i]);
            }


            numbers[2] = 10;


            System.out.println("\n Edited Array elements:");
            for (int i = 0; i < numbers.length; i++) {
                System.out.println("numbers[" + i + "] = " + numbers[i]);

        }
    }
}
