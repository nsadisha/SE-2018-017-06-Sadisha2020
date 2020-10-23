import java.util.Scanner;

public class Hailstone{
    public static void main(String[] args) {
        //Variable decleration and new Scanner object
        int num;
        Scanner sc = new Scanner(System.in);

        //Getting inputs
        System.out.print("Enter number: ");
        num = sc.nextInt();

        //Do the thing while num>1
        while(num>1){
            if(num%2==0){
                num = num/2;
            }else{
                num = num*3 + 1;
            }
            System.out.print(num+" ");
        }

        //Close the Scanner
        sc.close();
    }
}