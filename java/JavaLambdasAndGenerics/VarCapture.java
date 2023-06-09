// An example of caturing a local variable from the enclosing scope.

interface MyFunc {
    int func(int n);
}

public class VarCapture {
    public static void main(String[] args) {
        // alocal varialbe that can be captured
        int num = 10;

        MyFunc myLambda = (n) -> {
            // thsi use of num is OK. It does not modify num.
            int v = num + n;

            // However, the following is illegal because it attempts to modify the value of num.
            // num++;
            return v;
        };
        System.out.println(myLambda.func(10));
        // The following line would also cause an error, because
        // it would remove the effectively final status from num.
        // num = 9;
    }    
}
