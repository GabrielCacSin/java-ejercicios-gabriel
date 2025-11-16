public class t3_1_gabriel_caceres {
    public static void main(String[] args) {
        //aqui haremos los ejercicios de las tarea opcional 3.1
        //aqui ejecutare por pantalla todos los apartados
        System.out.println(imprimirLinea());
        System.out.println(calcularLetraDNI(70287243));
        System.out.println(imprimirLinea());
    }

    static String mostrarSaludo(){
        /*
         *  Ejercicio 1. Saludo inicial
         *  Crea un método llamado mostrarSaludo() que muestre en pantalla el mensaje:
         *  "¡Bienvenido a la programación en Java!"
         *  Llama al método desde el main() para comprobar su ejecución.
         */
        String saludo = "\"" + "¡Bienvenido a la programación en Java!" + "\"";
        return saludo;
    }

    static String mostrarAutor(){
        /*
        * Crea un método mostrarAutor() que muestre tu nombre y el curso actual, por ejemplo:
        *  "Ejercicio realizado por Laura - 1º DAW"
        * Llama al método desde main() después de mostrar un mensaje de inicio del programa.
         */

        String saludo = "\"" +  "Ejercicio realizado por Gabriel Cáceres - 1º DAW" + "\"";
        return saludo;
    }

    static String imprimirLinea(){
        /*
        *  Ejercicio 3. Separador visual
        *   Diseña un método imprimirLinea() que muestre una línea de 30 guiones 
        *    (------------------------------).
        *    Utiliza este método varias veces en el main() para separar distintas secciones del texto 
         */

        String linea = "-------------------------------------------------------------------------------------------------------------";
        return linea;
    }

    static String saludoPersonal(){
        /*
        *   Ejercicio 4. Doble saludo
        *   Crea un método saludoPersonal() que muestre dos mensajes diferentes, uno de bienvenida y
        *   otro de despedida.
        *   Desde el main(), llama al método dos veces seguidas y observa el orden de ejecución
         */

        String hola = "Hola bienvenido ";
        String adios = "Hasta luego!";
        String saludo = hola + "\n" + adios;
        return  saludo;
        
    }

    static String presentacion(){
        /*
        *   Ejercicio 5. Presentación completa
        *   Diseña un método presentacion() que muestre por pantalla tres líneas:
        *   1. Un mensaje de saludo.
        *    2. Tu nombre o el del alumno.
        *    3. Un mensaje de cierre como “Fin del método”.
        *    Desde el main(), llama al método una sola vez.
         */
        String saludo = mostrarSaludo();
        String nombre = mostrarAutor();
        String cierre = "Fin del metodo";

        String metodo = saludo + "\n" + nombre  +"\n" + cierre;
        return metodo;
    }

    static String saludar(String nombre){
        /* 
        *    Ejercicio 6. Saludo con nombre
        *    Crea un método llamado saludar(String nombre) que reciba el nombre de una persona y
        *    muestre el mensaje:
        *    "Hola, [nombre]. ¡Bienvenido al curso de Java!"
        *    Desde el main(), llama al método varias veces con distintos nombres.
        */
        String saludo = mostrarSaludo();
        String mensaje = "Hola, " + nombre + " " +  saludo;
        return mensaje;
    }

    static int sumar(int a,int b){
        /*
         * Ejercicio 7. Suma de dos números
         * Diseña un método sumar(int a, int b) que reciba dos números enteros y muestre su suma.
         * Llama al método desde main() con diferentes combinaciones de valores y observa el resultado.
         */
        int suma = a+b;
        return suma;
    }

    static String presentarPersona(String nombre,int edad){
        /*
         * Ejercicio 8. Presentación personalizada
         * Crea un método presentarPersona(String nombre, int edad) que muestre en
         * consola algo como:
         * "Me llamo Ana y tengo 20 años."
         * Invoca el método desde el main() con tus propios datos.
         */

        String texto = "Me llamo " + nombre + " y tengo " + edad + " años.";
        return texto;
    }

    static void repetirMensaje(String mensaje,int veces){
        /*
         * Ejercicio 9. Repetición de mensajes
         * Crea un método repetirMensaje(String mensaje, int veces) que muestre el texto
         * indicado tantas veces como se indique en el segundo parámetro.
         * Ejemplo: repetirMensaje("Hola", 3) debe imprimir “Hola” tres veces.
         */

        for(int i = 1;i<=veces;i++){
            String saludo = saludar("gabriel caceres"); 
            System.out.println(  i + mensaje + saludo);
        }
        
    }

    static void convertirEurosADolares(double euros,double tipoCambio){
        /*
         * Ejercicio 10. Conversión de unidades
         * Crea un método convertirEurosADolares(double euros, double tipoCambio)
         * que reciba una cantidad en euros y el tipo de cambio actual.
         * El método debe mostrar el resultado de la conversión con el formato:
         * "10.0 euros equivalen a 10.8 dólares."
         * Llama al método con distintos valores para comprobar su funcionamiento
         */

        double cambio = euros * tipoCambio;
        System.out.println(euros + " euros con el cambio de moneda actual en: " + tipoCambio + " esta en: " + cambio + "$" );
        
    }

    static void cuadrado(int n){
        /*
        *   Ejercicio 11. Cuadrado de un número
        *   Crea un método cuadrado(int n) que devuelva el cuadrado del número recibido.
        *   Desde el main(), muestra por pantalla el resultado de llamar al método con distintos valores (por
        *   ejemplo, 3, 5 y 10)
         */
        System.out.println(Math.pow(n,2));
    }

    static double celsiusAFahrenheit(double celsius){
        /*
         * Ejercicio 12. Conversión de temperatura
         * Diseña un método celsiusAFahrenheit(double celsius) que devuelva el valor
         * equivalente en grados Fahrenheit.
         * Usa la fórmula:
         * F = C * 9 / 5 + 32
         * Muestra el resultado en consola con un mensaje explicativo.
         */

        double f = celsius * 9 / 5 + 32;
        return f;
    }

    static double promedio(double n1, double n2, double n3){
        /*
        *   Ejercicio 13. Promedio de tres notas
        *   Crea un método promedio(double n1, double n2, double n3) que devuelva el
        *   DAW – PROGRAMACIÓN: PRÁCTICA 2.1
        *   promedio de tres calificaciones.
        *   Muestra el resultado redondeado a dos decimales desde el main().        
         */

        double media = (n1+n2+n3)/3;
        return media;
    }

    static int mayor(int a,int b){
        /*
        *   Ejercicio 14. Número mayor
        *   Crea un método mayor(int a, int b) que devuelva el mayor de los dos números
        *   introducidos.
        *   Desde el main(), pide dos números al usuario, llama al método y muestra cuál es mayor.
         */
        if(a>b){
            return a;
        }else{
            return b;
        }
    }


    static String calcularLetraDNI(int dni){
        /*
        *   Ejercicio 15. Letra del DNI
        *   Crea un método calcularLetraDNI(int dni) que devuelva la letra
        *   correspondiente al número de DNI recibido.
        *   Usa el algoritmo oficial (módulo 23 con la cadena "TRWAGMYFPDXBNJZSQVHLCKE").
        *   Desde el main(), pide un número de DNI y muestra el resultado 
        *   completo (número + letra).
        */

        String letras = "TRWAGMYFPDXBNJZSQVHLCKE";
        int indice = dni % 23;
        char letra = letras.charAt(indice);
        String completo = dni + "" + letra;
        return completo;
    }

}
