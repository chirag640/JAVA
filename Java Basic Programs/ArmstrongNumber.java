public class ArmstrongNumber {
    public static void main(String[] args) {
        //Armstrong number is a number that is equal to the sum of cubes of its digits
        // /153 = (1*1*1)+(5*5*5)+(3*3*3)  
        int num=153;
        int result=0;
        int tempNum = num;
        while(tempNum>0){
            int lastDigit = tempNum%10;
            result += Math.pow(lastDigit, 3);
            tempNum/=10;
        }
        if(result  == num){
            System.out.println(num+" is Armstrong number");
        }else{
            System.out.println(num+" is not Armstrong number");
        }
    }
}
