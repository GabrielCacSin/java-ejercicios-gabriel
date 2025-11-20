import java.util.Scanner;
public class practica_3_1_gabriel_caceres{
    public static void main(String[] args) {
        ej3(); 
    }

    static float ej1(float a, float b){
        /*
        *Implementa un método que, dados dos números enteros, los divida devolviendo un float.    
        */
        float division = a/b;
        return division;
    }

    static void ej2(int num){
        /*
        * Impementa un método que dado un número, diga si este es impar.
        */
        if(num%2==0){
            System.out.println("Es par");
        }else{
            System.out.println("Es impar");
        }
    }

    static void ej3(){
        /*
        *Implementa un método para mostrar un menú de N opciones, con su número correspondiente, la última opción será para salir.
        */
        Scanner sc = new Scanner(System.in);
        int num = 0;
        while (num != 3) {
            System.out.println("--Elige una opcion de entre estas 3--");
            System.out.println("-- MENU --");
            System.out.println("-- 1. DIVISION --");
            System.out.println("-- 2. PAR O IMPAR --");
            System.out.println("-- 3. salir --");
            
            num = sc.nextInt();

            // Validar opción
            if (num < 1 || num > 3) {
                System.out.println("Opción no válida, debe ser un número del 1 al 3.");
                continue; // vuelve al principio del while
            }

            switch (num) {
                case 1:
                    System.out.println("Vamos a dividir, dime el primer numero:");
                    float numero1 = sc.nextFloat();
                    System.out.println("Dime el segundo numero:");
                    float numero2 = sc.nextFloat();
                    System.out.println(ej1(numero1, numero2));
                    break;

                case 2:
                    System.out.println("Dime tu numero rey:");
                    int numero = sc.nextInt();
                    ej2(numero);
                    break;

                case 3:
                    System.out.println("Saliendo del programa");
                    break;
            }
            System.out.println();
            System.out.println();
            System.out.println();
        }
        sc.close();
    }
}