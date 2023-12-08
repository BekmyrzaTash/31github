public class Methods {
    public static void main(String [] args){
        printGreeting();
        int sum= addNumbers(5,7);
                System.out.println("Sum of numbers"+sum);

        int product=multiplyNumbers(3,4);
        System.out.println("Multiplied numbers"+ product);

        boolean isEven= isNumberEven(8);
        System.out.println("Is the number even?" +isEven);
    }
static void printGreeting(){
System.out.println("Hello World");
}
    static int addNumbers(int a, int b){
        return a+b;
    }
    static int multiplyNumbers(int x, int y){
       return x*y;
    }
    static boolean isNumberEven(int num){
        return num%2==0;
    }
}