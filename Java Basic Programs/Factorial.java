public class Factorial {
    public static void main(String[] args) {
        int num = 3;
        
        System.out.println(simpleWay(num)+" is factorial of "+num);
        System.out.println(usingRecursion(num)+" is factorial of "+num +" using recursion");
    }
    public static int simpleWay(int num){
        int result=1;
        for(int i=1;i<=3;i++){
            result*=i;
        }
        return result;
    }
    public static int usingRecursion(int num){
        if(num < 2){
            return 1;
        }
        return num*usingRecursion(num-1);
    }
}
