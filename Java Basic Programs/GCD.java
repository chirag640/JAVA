public class GCD {
    public static void main(String[] args) {
        int a = 15;
        int b = 25;

        System.out.println("gcd = "+gcd(a, b));

        
    }

    public static int gcd(int num1 , int num2){
        if(num2==0){
            return num1;
        }
        return gcd(num2, num1%num2);
    }
}
