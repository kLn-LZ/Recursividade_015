package View;

import java.util.Scanner;

import Controller.Fibonnaci;


public class Principal {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Fibonnaci fibo = new Fibonnaci();

        int pos = 0;
        boolean check = false;

        while (check == false) {

            System.out.print("insira um número até 20: ");

            pos = scan.nextInt();

            if (pos <= 20) {
                check = true;
            }
            else {
                System.out.println("Valor inválido");
            }



        }

        System.out.println("Resultado: " + fibo.funcFibonacci(pos));



    }
}
