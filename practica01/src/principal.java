import java.util.Scanner;

public class principal {

    public static void main(String[] args) {
        //declaracion de variables
        int n;
        int resultadoA;
        // int resultadoB;
        // int resultadoC;
        // int resultadoD;
        // int resultadoE;

        //boolean tieneNumDiff;
        // ingreso de variables
        // int[] arreglo = new int[4];
        Scanner entrada = new Scanner(System.in);
        System.out.println("ingrese el n: ");
        n = entrada.nextInt();
        //ingresado el arreglo
        // Scanner entradaArr = new Scanner(System.in);
        // for (int i = 0; i < 4; i++) {
        //     System.out.println("ingrese el elemento [" + i + "]" + "del arreglo:");
        //     arreglo[i] = entrada.nextInt();
        // }
        //proceso
        BeautifulNumberA A = new BeautifulNumberA();
        // BeautifulNumberB B = new BeautifulNumberB();
        // BeautifulNumberC C = new BeautifulNumberC();
        // BeautifulNumberD D = new BeautifulNumberD();
        // BeautifulNumberE E = new BeautifulNumberE();

        resultadoA = A.minimumNumber(n);
        // resultadoB = B.minimumNumber(n);
        // resultadoC = C.minimumListNumber(arreglo);
        // resultadoD = D.minimumNumber(n);
        // resultadoE = E.minimumNumber(n);

        //resultado
        System.out.println("resultado  de A: " + resultadoA);
        // System.out.println("resultado  de B: " + resultadoB);
        // System.out.println("resultado  de C: " + resultadoC);
        // System.out.println("resultado  de D: " + resultadoD);
        // System.out.println("resultado  de E: " + resultadoE);

    }

}
