import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // clase Scanner

        System.out.println("ingrese valor A"); //leer tipo de dato A
        float A = scanner.nextFloat();

        System.out.println("Ingrese valor B"); //leer tipo de dato B
        float B = scanner.nextFloat();

        System.out.println("Ingrese valor C"); //leer tipo de dato C
        float C = scanner.nextFloat();

        if (A == B || B == C || A == C) //operador logico || - no permite la lectura si alguna operacion es igual
            System.out.println("Numeros iguales, cambie el valor repetido");
        else ;

        float mayor, menor;
        if (A > B && A > C)
            mayor = A;
        else if (B > A && B > C)
            mayor = B;
        else
            mayor = C;
        System.out.println("El numero mayor es: " + mayor);

        if (A < B && A < C)
            menor = A;
        else if (B < A && B < C)
            menor = B;
        else
            menor = C;
        System.out.println("El numero mayor es: " + menor);
    }
}