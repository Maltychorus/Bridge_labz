// given array = [2,7,9,11] , target = 9 , sum of two numbers = 9 , output = [0,1] i.e. index of 2 and 7  

/*public class July3 {
    public static void main(String[] args) {
        int[] arr = {2, 7, 9, 11};
        int target = 9;
        
        for (int i = 0 ; i < arr.length; i++){
            for (int j = i + 1 ; j < arr.length; j++){
                if (arr[i]+arr[j] == target){
                    System.out.println("Output: [" + i + "," + j + "]");
                    return;
                }
            }
        }
        System.out.println("No two numbers found that sum to the target.");
    }
}*/

//Calculator using switch case in java

/*import java.util.Scanner;

public class July3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number : ");
        double num1 = scanner.nextDouble();
        
        System.out.println("Enter second number : ");
        double num2 = scanner.nextDouble();
        
        System.out.println("Choose an operation");
        System.out.println("+ : Addition");
        System.out.println("- : Subraction");
        System.out.println("* : Multiplication");
        System.out.println("/ : Division");
        
        System.out.println("Enter Operator : ");
        char operator = scanner.next().charAt(0);
        
        double result;
        
        switch(operator){
            case '+':
                result = num1 + num2 ;
                System.out.println("Result : "+ result);
                break;
            case '-':
                result = num1 - num2 ; 
                System.out.println("Result : "+ result);
                break;
            case '*':
                result = num1*num2;
                System.out.println("Result : "+ result);
                break;
            case '/':
                if (num2 != 0){
                    result = num1/num2;
                    System.out.println("Result : "+ result);
                    break;
                    
                }
                else{
                    System.out.println("Cannot divid by 0.");
                }
            default:
                System.out.println("Invalid operator");    
        }
        scanner.close();
    }
}*/

import java.util.Scanner;

public class July3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter temperature in Celsius: ");
        int temp = scanner.nextInt();

        if (temp >= 30 && temp <= 40) {
            System.out.println("It's Hot");
        } else if (temp >= 20 && temp < 30) {
            System.out.println("It's Warm");
        } else if (temp >= 10 && temp < 20) {
            System.out.println("It's Cold");
        } else {
            System.out.println("Temperature is out of range");
        }

        scanner.close();
    }
}

