/*import java.util.Scanner;
public class July4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of rows : ");
        int rows = sc.nextInt();

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= rows; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        sc.close();
    }
}*/


/*import java.util.Scanner;
class July4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Input number of rows
        System.out.println("Enter number of rows : ");
        int rows = sc.nextInt();
        
        // Input number of columns
        System.out.println("Enter number of columns : ");
        int columns = sc.nextInt();
        
        
        // Display number of rows and columns
        System.out.println("Rows : " + rows + ", Columns : " + columns + ".");
        
        for (int i = 1 ; i <= rows ; i++){
            for (int j = 1; j <=columns ; j++){
                if (i == 1 || i == rows || j == 1 || j == columns){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }  
                
            }
            System.out.println();
        }
        sc.close();
    }
}*/

/*import java.util.Scanner;

public class July4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();
        
        for (int i = 1 ; i <= rows ; i++){
            for (int j = 1 ; j <= rows - i ; j++){
                System.out.print("  ");
            }
            
            for (int k = 1 ; k <= i ; k++){
                System.out.print("* ");
            }
            System.out.println();
        }

        sc.close();
    }
}*/


/*import java.util.Scanner;
class July4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the number of rows : ");
        int rows = sc.nextInt();
        
        for (int i = 1 ; i <= rows ; i++){
            for (int j = 1 ; j <= i ; j++){
                if ((i+j) % 2 == 0){
                    System.out.print(1+" ");
                }else{
                    System.out.print(0+" ");
                }
                
            }
        System.out.println();        
        }
        sc.close(); 
    }
}*/
