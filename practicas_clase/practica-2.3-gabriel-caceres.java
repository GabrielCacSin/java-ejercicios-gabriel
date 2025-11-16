import java.util.Scanner;

class ej1{
    public static void main(String[] args) {
        /*
          *  1.	Crear un programa en JAVA que dibuje un rectángulo formado por asteriscos(*).
          *  Se deben pedir base y altura por teclado.
          *  Además, añade código adicional para que dibuje dicho rectángulo sin relleno.
        */

        System.out.println("vamos a dibujar un rectangulo");
        System.out.println("dame la base");
        Scanner sc = new Scanner(System.in);

        int base = sc.nextInt();
        System.out.println("dame la altura");
        int altura = sc.nextInt();

        System.out.println("-- DIBUJANDO --");

        for(int i=0;i<altura;i++){

            for(int j=0;j<base;j++){
                System.out.print("*");
            }

            System.out.print("\n");
        }
        System.out.println("-- DIBUJANDO sin relleno --");

        for (int i = 0; i < altura; i++) {

            for (int j = 0; j < base; j++) {

                if (i == 0 || i == altura - 1 || j == 0 || j == base - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }

            }
            System.out.println();
        }
        sc.close();
    }
}

//------------------------------------------------------------------------------------------------------------------------

class ej2 {
    public static void main(String[] args) {

        /*
         * 2.Crea un programa en JAVA que dibuje un triángulo rectángulo.
         *  Para ello solicita el símbolo con el que has dibujar el triángulo.
         *  Además, se debe pedir la altura del triángulo por teclado.
         */


        System.out.println("Vamos a dibujar un triángulo rectángulo");
        Scanner sc = new Scanner(System.in);

        System.out.println("Dame la altura:");
        int altura = sc.nextInt();
        sc.nextLine();

        System.out.println("Dame el símbolo con el que lo vamos a dibujar:");
        String simbolo = sc.nextLine();

        while (simbolo.length() != 1) {
            System.out.println("Debe ser SOLO un símbolo. Inténtalo de nuevo:");
            simbolo = sc.nextLine();
        }

        System.out.println("- Dibujando -");

        for (int i = 1; i <= altura; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(simbolo);
            }
            System.out.println();
        }

        sc.close();
    }
}


//------------------------------------------------------------------------------------------------------------------------


class ej3 {
    public static void main(String[] args) {

        /*
         * 3.Crea un programa en JAVA que dibuje un triángulo equilátero formado por sumas(+).
         *  Se debe pedir la altura del triángulo por teclado.
         *  Además, añade código adicional para que dibuje dicho triángulo sin relleno.
         */

        Scanner sc = new Scanner(System.in);
        System.out.println("Dame la altura del triángulo equilátero:");
        int altura = sc.nextInt();

        System.out.println("-- Triángulo equilátero relleno --");

        // TRIÁNGULO RELLENO
        for (int i = 1; i <= altura; i++) {

            // espacios delante
            for (int e = 0; e < altura - i; e++) {
                System.out.print(" ");
            }

            // símbolos
            for (int s = 0; s < (2 * i - 1); s++) {
                System.out.print("+");
            }

            System.out.println();
        }

        System.out.println("-- Triángulo equilátero sin relleno --");

        // TRIÁNGULO SIN RELLENO
        for (int i = 1; i <= altura; i++) {

            // espacios delante
            for (int e = 0; e < altura - i; e++) {
                System.out.print(" ");
            }

            // borde o hueco
            for (int s = 0; s < (2 * i - 1); s++) {

                // Primera fila
                if (i == 1) {
                    System.out.print("+");
                }
                // Última fila → todo relleno para el borde inferior
                else if (i == altura) {
                    System.out.print("+");
                }
                // Zonas intermedias
                else {
                    // Solo bordes: primer y último símbolo
                    if (s == 0 || s == (2 * i - 2)) {
                        System.out.print("+");
                    } else {
                        System.out.print(" ");
                    }
                }
            }

            System.out.println();
        }

        sc.close();
    }
}
