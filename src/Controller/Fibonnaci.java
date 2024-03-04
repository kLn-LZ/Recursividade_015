package Controller;

public class Fibonnaci {
    public Fibonnaci () {
        super();
    }

    public int funcFibonacci (int n ) {

        if (n < 2) {

            return n;
        }

        return funcFibonacci(n-1) + funcFibonacci(n -2);

    }
}
