import java.util.Scanner;
public class primeNum {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if(num == 0 || num == 1){
            System.out.println(num+" is not prime number");
        }
        else{
            for(int i=2; i<=num/2; i++){
                if(num%i == 0){
                    System.out.println(num+" is not prime number");
                    break;
                }
                else {
                    System.out.println(num+" is prime number");
                }
            }
        }
    }
}
