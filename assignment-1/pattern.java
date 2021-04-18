import java.util.Scanner;

public class pattern{
    static void print_spaces(int n){
        for(int i=0;i<n;i++){
            System.out.print(" ");
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the length of side of hour-glass: ");
        int side = in.nextInt();
        
        // Print upper triangle
        for(int i =1; i<=side; i++){

            print_spaces(i-1);
            
            for(int j=i;j<=side;j++){
                System.out.printf("%d ", j);
            }
            System.out.println();
        }
        
        for(int i =1; i<side; i++){
            print_spaces(side-i-1);
            
            for(int j=side-i; j<=side; j++){
                System.out.printf("%d ", j);    
            }
            System.out.println();
        }

        in.close();
    }
}