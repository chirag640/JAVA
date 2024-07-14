public class AddTwoComplexNumbers {
    int real,complex;
    public AddTwoComplexNumbers(int r , int c){
        this.real=r;
        this.complex=c;
    }
    public void show(){
        System.out.println("Complex numer = "+real+" + i" +complex);
    }
    public static AddTwoComplexNumbers add(AddTwoComplexNumbers n1 ,AddTwoComplexNumbers n2){
        AddTwoComplexNumbers res = new AddTwoComplexNumbers(0,0);
        res.real = n1.real + n2.real;
        res.complex = n1.complex + n2.complex;
        return res;
    }
    public static void main(String[] args) {
        AddTwoComplexNumbers n1 = new AddTwoComplexNumbers(2, 3);
        AddTwoComplexNumbers n2 = new AddTwoComplexNumbers(4, 5);

        AddTwoComplexNumbers result = add(n1, n2);
        result.show();
    }
}
