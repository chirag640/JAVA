import java.util.Scanner;

/**
 * PrimeNumber
 */
public class PrimeNumber {

    public static void main(String[] args) {
        System.out.print("Enter a numebr : ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.close();

        for(int i=2;i<num;i++){
            int flag = 1;
            for(int j=2;j<i;j++){
                if(i%j==0){
                    flag=0;
                    break;
                }
            }
            if(flag==1){
                System.out.println(i+" is prime number");
            }
        }
    }
}