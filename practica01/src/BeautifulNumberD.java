



public class BeautifulNumberD implements MInimumNumberInterface {

    private double isValidPotencialtwoNumber(int x) {
        double resultado;
        int a = x / 10;
        int b = x % 10;
        resultado = Math.pow(a, b);

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

    @Override
    public int minimumNumber(int n) {
        // declaracion variables
        int x;
        int resultado = 0;
        //ingreso y proceso x=ab /x>=n entonces
        if (n >= 10 && n <= 99) {
            x = n;
            if (isValidPotencialtwoNumber(x) >= n) {//potencia(a,b)>=n
                x = n;
            } else {
                x = 0;
            }
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

}

