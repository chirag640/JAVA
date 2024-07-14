public class SwapTwoNumbersMethod1 {
    public static void main(String args[]) {
        int a = 3;
        int b = 2;
        System.out.println("a = " + a + " b = " + b);
        int temp = b;
        b = a;
        a = temp;
        System.out.println("a = " + a + " b = " + b);
    }
}
