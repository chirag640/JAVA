public class NeonNumber {
    public static void main(String[] args) {
        //A neon number is a number where the sum of digits of square of the number is equal to the number. 
        //9*9 = 81
        int num =9;

        int squareNum = (int)Math.pow(num, 2);
        int result=0;
        while (squareNum>0) {
            int lastDigit = squareNum%10;
            result+=lastDigit;
            squareNum/=10;
        }
        if(result==num){
            System.out.println(num+" is neon number");
        }else{
            System.out.println(num+" is not neon number");
        }
    }
}
