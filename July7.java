// Butterfly , Solid rhombus, and diamond pattern

/* 
import java.util.Scanner;
class July7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the number of rows : ");
        int n = sc.nextInt();
        
        for (int i = 1 ; i <= n ; i++){
            // Upper left wing
            for (int j = 1 ; j <= i ; j++){
                System.out.print("* ");
            }
            int spaces = 2*(n-i)*2;
            // Middle spaces
            for (int j = 1 ; j <= spaces ; j++){
                System.out.print(" ");
            }
            // Upper right wing
            for (int j = 1 ; j <= i ; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        
        for (int i = n-1 ; i >= 1 ; i--){
            // Lower left wing
            for (int j = 1 ; j <= i ; j++){
                System.out.print("* ");
            }
            int spaces = 2*(n-i)*2;
            // Middle spaces
            for (int j = 1 ; j <= spaces ; j++){
                System.out.print(" ");
            }
            // Lower right wing
            for (int j = 1 ; j <= i ; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        sc.close();
    }
}*/


/* 
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the number of stars in a side of Rhombus : ");
        int s = sc.nextInt();
        
        for (int i = 1 ; i <= s ; i++){
            for (int j = 1 ; j <= s-i ; j++){
                System.out.print(" ");
            }
            for (int j = 1 ; j <= s ; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        sc.close();
    }
}*/

/*
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Size of the Diamond : ");
        int d = sc.nextInt();
        
        for (int i = 1 ; i <= d ; i++){
            for (int j = 1 ; j <= d-i ; j++){
                System.out.print(" ");
            }
            for (int j = 1 ; j <= 2*i - 1 ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        
        for (int i = d-1 ; i >= 1 ; i--){
            for (int j = 1 ; j <= d-i ; j++){
                System.out.print(" ");
            }
            for (int j = 1 ; j <= 2*i - 1 ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
}
 */