import java.util.Scanner;

public class practica_3_2_gabriel_caceres {
    public static void main(String[] args) {
        Menu();
    }

    static void CuadradoRelleno(int lado){
        for(int i=0;i<lado;i++){
            for(int j=0;j<lado;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void CuadradoVacio(int lado){
        for(int i = 0; i < lado; i++){
            for(int j = 0; j < lado; j++){
                if (i == 0 || i == lado - 1 || j == 0 || j == lado - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    static void TrinaguloRectanguloRelleno(int altura){
        for (int i = 1; i <= altura; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void TrinaguloRectanguloVacio(int altura){
        for (int i = 1; i <= altura; i++) {
            for (int j = 1; j <= i; j++) {
                if (i == altura || j == 1 || j == i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
        System.out.println();
        }
    }

    static void Menu(){
        Scanner sc = new Scanner(System.in);
        int num = 0;
        int lado = 0;
        int altura = 0;
        while (num != 5) {
            System.out.println("--Elige una opcion de entre estas 5--");
            System.out.println("-- MENU --");
            System.out.println("-- 1. Cuadrado relleno --");
            System.out.println("-- 2. Cuadrado vacio --");
            System.out.println("-- 3. Trinagulo Rectangulo relleno --");
            System.out.println("-- 4. Trinagulo Rectangulo vacio --");
            System.out.println("-- 5. salir --");
            
            num = sc.nextInt();

            // Validar opción
            if (num < 1 || num > 5) {
                System.out.println("Opción no válida, debe ser un número del 1 al 3.");
                continue; // vuelve al principio del while
            }

            switch (num) {
                case 1:
                    System.out.println("Dime de que tamaño será el lado del cuadrado");
                    lado = sc.nextInt();
                    CuadradoRelleno(lado);
                    break;

                case 2:
                    System.out.println("Dime de que tamaño será el lado del cuadrado");
                    lado = sc.nextInt();
                    CuadradoVacio(lado);
                    break;

                case 3:
                    System.out.println("Dime de que tamaño será la altura del Trinagulo Rectangulo relleno");
                    altura = sc.nextInt();
                    TrinaguloRectanguloRelleno(altura);
                    break;
                
                case 4:
                    System.out.println("Dime de que tamaño será la altura del Trinagulo Rectangulo vacio");
                    altura = sc.nextInt();
                    TrinaguloRectanguloVacio(altura);
                    break;
                
                case 5:
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

