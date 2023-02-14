import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        boolean flag =  true;

       do{



        System.out.println("Welcome to the calculator");
        System.out.println("Please choose an option");
        System.out.println(" 1. sum");
        System.out.println(" 2. substract");
        System.out.println(" 3. multiply");
        System.out.println(" 4. divide");
        System.out.println(" 5. modulus");
        System.out.println(" 6. exit");
        System.out.println("Please select an option now");





        int input = scanner.nextInt();







        switch (input){

            case 1:

                sum(readValue1(),readValue2());

                break;

            case 2:

                substraction(readValue1(),readValue2());

                break;

            case 3:

                multiplication(readValue1(),readValue2());

                break;

                case 4:

                division(readValue1(),readValue2());

                break;

            case 5:

                modulus(readValue1(),readValue2());

                break;

            case 6:

                flag = false;

                System.out.println("exited");

            default:
                System.out.println("Invalid operator!");
                break;
        }

    }
       while (flag);
    }

public static void sum(int a , int b) {
    int answer = a + b;
    System.out.println("sum of numbers is =" + answer);
}
    public static void substraction(int a , int b) {
        int answer = a - b;
        System.out.println("substraction of numbers is =" + answer);
    }
    public static void division(float a , float b) {
        float answer = a / b;
        System.out.println("division of numbers is =" + answer);
    }
    public static void multiplication(int a , int b) {
        int answer = a * b;
        System.out.println("multiplication of numbers is =" + answer);
    }
    public static void modulus(int a , int b) {
        int answer = a % b;
        System.out.println("modulos of numbers is =" + answer);
    }

    public  static int readValue1(){
        System.out.println("Enter first number");
        int a = scanner.nextInt();
        return a;
    }

    public  static int readValue2(){
        System.out.println("Enter first number");
        //System.out.println("123456");
        int b = scanner.nextInt();
        return b;
    }


}

