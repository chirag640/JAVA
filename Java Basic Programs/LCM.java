public class LCM {
    public static void main(String[] args) {
        int a =15;
        int b=25;

        int lcm;
        if(a>b){
            lcm = a;
        }else{
            lcm = b;
        }

        while (true) {
            if(lcm%a==0 && lcm%b==0){
                System.out.println("lcm = " + lcm);
                break;
            }
            lcm++;
        }

    }
}
