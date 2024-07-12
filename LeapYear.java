public class LeapYear {
    public static void main(String[] args) {
        int year = 2024;

        String ans = year%4==0?"leap year":"not leap year";
        System.out.println(ans);

        if(year%4==0){
            System.out.println(year + " is leap year ");
        }else{
            System.out.println(year + " is not leap year ");
        }

    }  
}
