//FibonacciSeries

/*
public class FibonacciSeries {
    public static void main(String[] args) {
        int a=0, b=1, c;
        System.out.print(a+" "+b);
        for (int i=2; i<=10; i++){
            c=a+b;
            System.out.print(" "+c);
            a=b;
            b=c;
        }
    }
}
*/


//CallingByObjectInMainMethod

class A{
    public void find_series(int n){
        int a=0, b=1, c;
        System.out.print(a+" "+b);
        for (int i=2; i<=n; i++){
            c=a+b;
            System.out.print(" "+c);
            a=b;
            b=c;
        }
    }
}
public class FibonacciSeries {
    public static void main(String[] args) {
     A obj=new A();
     obj.find_series(10);
    }
}


