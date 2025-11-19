import java.util.Scanner;
public class ejer_java_gabriel_1 {
    public static void main(String[] args) {
        ej6_menu();
    }

    static String ej1_nombre(String nombre){
        String saludo = "Hola! como estas? " + nombre;
        return saludo;
    }

    static int ej2_cubo(int numero){
        return (numero * numero * numero);
    }

    static double ej3_multiplicacion(double num_1,double num_2){
        return(num_1*num_2);
    }

    static void ej4_tabla_multiplicar(int num){
        for(int i = 1; i <= 10 ; i++){
            System.out.println(i + " * " +  num  + " = " + (i*num));
        }
    }

    static String ej5_par_o_impar(int num){
        if(num%2==0){
            return "par";
        }else{
            return "impar";
        }
    }

    static void ej6_menu() {
        Scanner sc = new Scanner(System.in);
        int opcion = 0;

        // Bucle principal del menú
        while (opcion != 6) {

            // Mostrar menú
            System.out.println("----------MENU DE OPCIONES POR HACER-----------");
            System.out.println("1) saludo con tu nombre");
            System.out.println("2) calcular el cubo de un numero");
            System.out.println("3) multiplica 2 numeros entre si");
            System.out.println("4) tabla de multiplicar de un numero");
            System.out.println("5) par o impar, dame un numero y lo sabras");
            System.out.println("6) salir");
            System.out.print("Elige una opción (1-6): ");

            // Leer opción
            opcion = sc.nextInt();

            // Validar opción
            if (opcion < 1 || opcion > 6) {
                System.out.println("Opción no válida, debe ser un número del 1 al 6.");
                continue; // vuelve al principio del while
            }

            // Ejecutar según opción
            switch (opcion) {
                case 1:
                    System.out.println("Dime tu nombre rey:");
                    String nombre = sc.next();
                    System.out.println(ej1_nombre(nombre));
                    break;

                case 2:
                    System.out.println("Dime tu numero rey:");
                    int numero = sc.nextInt();
                    System.out.println(ej2_cubo(numero));
                    break;

                case 3:
                    System.out.println("Vamos a multiplicar, dime el primer numero:");
                    double numero1 = sc.nextDouble();
                    System.out.println("Dime el segundo numero:");
                    double numero2 = sc.nextDouble();
                    System.out.println(ej3_multiplicacion(numero1, numero2));
                    break;

                case 4:
                    System.out.println("Dime un numero y te enseño su tabla del 1 al 10:");
                    numero = sc.nextInt();
                    ej4_tabla_multiplicar(numero);
                    break;

                case 5:
                    System.out.println("Dime un numero y te digo si es par o impar:");
                    numero = sc.nextInt();
                    System.out.println(ej5_par_o_impar(numero));
                    break;

                case 6:
                    System.out.println("Saliendo del menú...");
                    break;
                }

            System.out.println(); // línea en blanco para separar vueltas
            }
        System.out.println("Fin del programa. Hasta luego");
        sc.close();
        }

}
