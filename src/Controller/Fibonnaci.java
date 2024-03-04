package Controller;

public class Fibonnaci {
    public Fibonnaci () {
        super();
    }

    public int funcFibonacci (int n ) {


        // Redundância de posição ( 1º = 1, 2º = 1), ou seja, o limite é a segunda posição
        if (n < 2) {

            return n;
        }

        // Regra da sequência, o número da iteração menos 1 somando com a próxima iteração menos 2
        return funcFibonacci(n-1) + funcFibonacci(n -2);

    }
}
