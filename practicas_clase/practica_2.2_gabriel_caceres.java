import java.util.Scanner;


class ej1{
    public static void main(String[] args) {
        /*
        1.	Crea un programa en Java que reciba 7 palabras y luego nos muestre la palabra con mayor longitud y la de menor longitud.
        */
        int mayor = 0,menor = 0;
        String pmayor= " ",pmenor = " ";

        Scanner sc = new Scanner(System.in);
        System.out.println("Dame palabras y te dire cual es la mas larga y la mas pequeña");
        for(int i = 1 ; i<=7 ; i++){
            System.out.print("dame la palabra numero " + i  + ": ");
            String palabra = sc.nextLine();
            if(i==1){
                pmayor = palabra;
                mayor = palabra.length();
                pmenor = palabra;
                menor = palabra.length();
            }else{
                if(palabra.length() > mayor){
                    pmayor = palabra;
                    mayor = palabra.length();
                }
                if(palabra.length() < menor){
                    pmenor = palabra;
                    menor = palabra.length();
                }
            }
        }

        System.out.println("la palabra mas larga es: " + pmayor + " y la palabra mas corta es: " + pmenor);
        sc.close();
    }
}


class ej2 {
    public static void main(String[] args) {
        int contadorPalabras = 0;
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Dime tu frase filosofica favorita");
        String frase = sc.nextLine();
        
        // 1. Usar trim() para eliminar espacios iniciales y finales
        frase = frase.trim();
        int tam = frase.length();
        
        // 2. Manejar el caso especial de una frase vacía
        if (tam == 0) {
            contadorPalabras = 0;
        } else {
            // Si la frase no está vacía, siempre hay al menos una palabra
            contadorPalabras = 1;

            // 3. Iterar sobre la cadena (hasta el penúltimo carácter)
            // La condición es i < tam - 1 para que i+1 sea un índice válido.
            for (int i = 0; i < tam - 1; i++) {
                char caracterActual = frase.charAt(i);
                char caracterSiguiente = frase.charAt(i + 1);

                // Contamos una palabra si encontramos un espacio seguido de un carácter que no es espacio.
                // Esto asegura que múltiples espacios seguidos no cuenten como múltiples palabras.
                if (caracterActual == ' ' && caracterSiguiente != ' ') {
                    contadorPalabras++;
                }
            }
        }

        System.out.println("El número de palabras es: " + contadorPalabras);
        sc.close();
    }
}

class ej3{
    public static void main(String[] args) {
        /*
        3.	Definir una string a con la cadena «Esto es una string»; definir la string b con la cadena «Y esto también».
            ◦ Comparar las dos strings y decir si son iguales.
            ◦ Crear la string «c» con la concatenación de a y b.
            ◦ Crear la string «d» con la concatenacion de a y b otra vez.
            ◦ Comparar las string c y d y decir si son iguales.
            ◦ Indicar cuantos caracteres tiene cada una de las strings.
            ◦ Copiar la string a en la string b.
            ◦ Utilizar replace, para modificar la string a.
            ◦ Presentar en consola el contenido de la string a y de la string b. 
        */
        // Definición
        String a = "Esto es una string";
        String b = "Y esto también";
        // Comparación a y b
        boolean sonIguales_ab = a.equals(b);
        System.out.println("a.equals(b): " + sonIguales_ab);
        // Concatenación c y d
        String c = a + b;
        String d = a + b;
        // Comparación c y d
        boolean sonIguales_cd = c.equals(d);
        System.out.println("c.equals(d): " + sonIguales_cd);
        // Longitud
        System.out.println("Longitud de a: " + a.length());
        System.out.println("Longitud de b: " + b.length());
        System.out.println("Longitud de c: " + c.length());
        // Copia (a en b)
        b = a; 
        // Modificación (replace)
        a = a.replace("string", "CADENA");
        // Presentación final
        System.out.println("Contenido final de a: " + a);
        System.out.println("Contenido final de b: " + b);
    }
}