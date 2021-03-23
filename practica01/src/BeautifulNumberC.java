


public class BeautifulNumberC implements MInimumNumberInterface {

    public int minimumNumber(int n) {
        //declaracion variables
        int x;
        int resultado = 0;
        //ingreso y proceso
        if (n >= 1000 && n <= 9000) {
            x = n;
        } else {
            x = 0;
        }
        if (isAllDifferentNumbers(x) == true) {
            resultado = x;
        } else {
            resultado = 0;
        }
        //salida
        return resultado;

    }

    private boolean isAllDifferentNumbers(int n) {
        boolean tieneNumdif;
        int contadorCoincidencias = 0;
        String numeroCadena = Integer.toString(n);
        for (int i = 0; i < numeroCadena.length() - 1; i++) {
            for (int j = 1; j < numeroCadena.length() - i; j++) {
                if (numeroCadena.charAt(i) == numeroCadena.charAt(j + i)) {
                    contadorCoincidencias = contadorCoincidencias + 1;
                }

            }
        }
        if (contadorCoincidencias > 0) {
            tieneNumdif = false;
        } else {
            tieneNumdif = true;
        }
        return tieneNumdif;
    }

    public int minimumListNumber(int[] arreglo) {
        int resultado;
        int menor = 999999;
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] >= 1000 && arreglo[i] <= 9000) {
                if (menor >= arreglo[i]) {
                    menor = arreglo[i];
                }
            }

        }

        resultado = minimumNumber(menor);

        return resultado;

    }

}
