



public class BeautifulNumberE implements MInimumNumberInterface {

    @Override
    public int minimumNumber(int n) {
        //declaracion variables
        int x;
        int resultado;
        //ingreso y proceso x=abc /x>=n entonces
        if (n >= 100 && n <= 999) {
            x = n;
            if (isValidPotencialthreeNumber(x) >= n) {//potencia(a,b,c)>=n
                x = n;
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

    private double isValidPotencialthreeNumber(int x) {
        double resultado;
        //(0<=a,b,c<=9)
        int a = x / 100; // obteniendo digito de las centenas
        int b = (x % 100) / 10; //obteniendo digito de las decenas
        int c = (x % 100) % 10; //obteniendo digito de las unidades
        resultado = Math.pow(a, Math.pow(b, c));// a elevado a la potencia de b elevado a la potencia de

        return resultado;

    }

    private boolean isAllDifferentNumbers(int n) {
        boolean tieneNumDif;
        int contadorCoincidencias = 0;
        String numeroCadena = Integer.toString(n);
        for (int i = 0; i < numeroCadena.length() - 1; i++) {
            for (int j = 0; j < numeroCadena.length() - 1; j++) {
                if (numeroCadena.charAt(i) == numeroCadena.charAt(j + 1)) {
                    contadorCoincidencias = contadorCoincidencias + 1;
                }

            }
        }
        if (contadorCoincidencias > 0) {
            tieneNumDif = false;
        } else {
            tieneNumDif = true;
        }
        return tieneNumDif;
    }

}

