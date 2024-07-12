public class Fibonacci {
    public static void main(String[] args) {
        int num = 10;

        System.out.println("fibonacci number "+simpleWay(num));
        System.out.println("fibonacci number using recursion "+usingRecursion(num));
        printSeries(num);
    }

    public static int simpleWay(int num){
        if (num == 0) {
            return 0;
        } else if (num == 1) {
            return 1;
        }
        int x = 0;
        int y = 1;
        int z = 1;

        for(int i=2;i<=num;i++){
            z = x+y;
            x=y;
            y=z;
        }
        return z;
    }
    public static int usingRecursion(int num){
        if (num == 0) {
            return 0;
        } else if (num == 1) {
            return 1;
        }
        return usingRecursion(num-1)+usingRecursion(num-2);
    }

    public static void printSeries(int num){
        if (num == 0) {
            System.out.println(num);;
        } else if (num == 1) {
            System.out.println(num);
        }
        int x = 0;
        int y = 1;
        int z = 1;

        for(int i=2;i<=num;i++){
            z = x+y;
            System.out.print(" "+z);
            x=y;
            y=z;
        }
    }
}
