import java.util.Scanner;
public class preparacion_2 {
    /*
    *VAMOS A HACER LOS EJERCICOS DE LAS PRACTICAS. INTENTARE COMENTAR CADA EJERCICIO PARA ENTENDERLO
    - LA ESTRUCTURA A SEGUIR VA A SER LA SIGUEINTE UN MAIN Y 
    - TODO FUNCIONES APARTE SI QUIERO CORRER CODIGO LA LLAMO AL MAIN Y LISTO 
    */

//---------------------------------------------------------------------------------------------------------------------------------------------------

    public static void main(String[] args) {
        sep();
        ej3_P2_1();
    }

//---------------------------------------------------------------------------------------------------------------------------------------------------
//---------------------------------------------------------------------------------------------------------------------------------------------------
//---------------------------------------------------------------------------------------------------------------------------------------------------
//---------------------------------------------------------------------------------------------------------------------------------------------------
    static void sep(){
        System.out.println("");
        System.out.println("***************************************************************************************************************************************");
        System.out.println("");
    }

//*---------------------------------------------------------------------------------------------------------------------------------------------------

/*
*--EJERCICIO 1 PRACTICA 2.1--
Crear un programa en JAVA que dibuje un rectángulo formado por asteriscos(*).
Se deben pedir base y altura por teclado. Además, añade código adicional para que dibuje dicho rectángulo sin relleno.
*/

    static void ej1_P2_1(){
        Scanner sc = new Scanner(System.in); //como voy a pasar por teclado importo el sacaner (linea 1) y lo creo para poder usarlo mas tarde
        System.out.println("Vamos a dibujar un rectangulo pero necesito que me des la base y la altura");
        System.out.println("bien dame la base primero");
        int base = sc.nextInt();            //aqui pillo el valor de la base
        System.out.println("ahora la altura");
        int altura = sc.nextInt();          //aqui pillo el valor de la altura
        System.out.println("Vamos a dibujarlo con relleno primero");
        System.out.println("");

        //*RECTANGULO RELLENO

        for(int i = 0 ; i < altura ; i++){
            for(int j = 0 ; j < base ; j++){
                System.out.print("*");
            }
            System.out.println("");     //para hacer el salto de linea
        }

        System.out.println("");
        sep();
        System.out.println("Vamos a dibujarlo sin relleno");
        System.out.println("");

        //*RECTANGULO SIN RELLENO

        for(int i = 0 ; i< altura ; i++){
            for( int j = 0 ; j < base ; j++){
                if(i == 0  || i == altura-1){
                    System.out.print("*");
                }else{
                    if(j == 0 || j == base-1){
                        System.out.print("*");  //en caso de cumplir dibuja
                    }else{
                        System.out.print(" ");  //en caso de no cumplir no lo dibuja y deja un espacio en blanco
                    }
                }
            }
            System.out.println("");
        }
        sc.close();
    }

//*---------------------------------------------------------------------------------------------------------------------------------------------------

/*
*--EJERCICIO 2 PRACTICA 2.1--
Crea un programa en JAVA que dibuje un triángulo rectángulo.
Para ello solicita el símbolo con el que has dibujar el triángulo.
Además, se debe pedir la altura del triángulo por teclado.
*/

    static void ej2_P2_1(){
        sep();
        Scanner sc = new Scanner(System.in);
        System.out.println("--Vamos a dibujar un triangulo rectangulo pero para eso necesito que me des la altura y el simbolo con lo que lo vamos a dibujar");
        System.out.println("dame la altura de tu triangulo");
        int altura = sc.nextInt();  //aqui recogo la altura de mi tringulo
        System.out.println("Ahora dame el simbolo con lo que lo vamos a dibujar importante solo dame 1 simbolo");
        char simbolo = sc.next().trim().charAt(0);  //aqui me encargo de que se solo sea un simbolo. porque es una variable CHAR donde le quito los espacios con de antes con trim y aunque me pasen una cadena solo pillo el primero

        //*DIBUJAMOS EL TRINAGULO RECTANGULO
        sep();
        for(int i = 0; i < altura ; i++){
            for(int j = 0; j <= i ; j++){
                System.out.print(simbolo);
            }
            System.out.println("");
        }
        sc.close();
    }

//*---------------------------------------------------------------------------------------------------------------------------------------------------

/*
*--EJERCICIO 3 PRACTICA 2.1--
Crea un programa en JAVA que dibuje un triángulo equilátero formado por sumas(+).
Se debe pedir la altura del triángulo por teclado.
Además, añade código adicional para que dibuje dicho rectángulo sin relleno.
*/

    static void ej3_P2_1(){
        sep();
        Scanner sc = new Scanner(System.in);
        System.out.println("-vamos a crear un tringulo equilatero relleno pero para eso necesito la altura de tu trinagulo equilatero-");
        System.out.println("-dame la altura-");
        int altura = sc.nextInt();
        System.out.println("bien vamos a dibujarlo");
        sc.close();

        //trinauglo relleno

        /*
        * es clave saberse las formulas para que quede perfecto 
        * para los espacios en blanco y que quede centrado es altura - i
        * para dibujar los simbolos es 2*i-1
        * si seguimos estos pasos la haremos perfecta 
        * solo con que apliques la formula suficiente
        */

        for(int i = 1; i<=altura;i++){  //* importante empezar desde 1  este basicamente es el qeu va a escribir el tamaño del triangulo
            for(int e = 0 ; e < altura-i ; e++){    //* aqui es donde aplicamos la formula de altura -i este es para dibujar los espacios en blanco
                System.out.print(" ");
            }
            for(int s = 0; s < ( 2 * i - 1 ); s++){ //* aqui es donde aplicamos la formula de 2*i-1 este es para dibujar el simbolo
                System.out.print("+");
            }
            System.out.println(""); //* este println sirve para dar el salto de linea para el primer for
        }

        sep();
        System.out.println("ahora dibujaremos el tringualo sin relleno");
        sep();

        //triangulo sin relleno

        /*
        *ahora es casi lo mismo es aplicar las formulas pero con unos if para cumplir las condiciones
         */

        for(int i=1 ; i <= altura ; i++){
            for(int e = 0; e < altura-i ; e++){ //*esta parte va a ser siempre casi igual donde vamos a cambiar cosas es donde escribimos el simbolo
                System.out.print(" ");
            }
            if (i == 1) {   //*esto solo se aplica a la primera fila es decir la punta de nuestro triangulo
                // Punta
                System.out.println("+");    
            } else if (i == altura) {   //*esto es la base es decir la ultima fila cuando ya la variable i despues de ciclos alcanzo el valor total de la altura
                // Base completa
                for (int s = 0; s < (2 * i - 1); s++) { //*aplicamos la segunda formula (2 * i - 1)
                    System.out.print("+");      //*dibuje la base sin problemas ya qeu es el borde inferior de nuestro triangulo
                }
                System.out.println();
            } else {    //*ya solucionada las partes de la punta y de la base queda el intermedio
                //* Filas intermedias: + ... +
                System.out.print("+"); //*  primer borde

                for (int s = 0; s < (2 * i - 3); s++) { //* hueco interior con otra formula que es (2 * i - 3)
                    System.out.print(" ");
                }

            System.out.println("+"); //* segundo borde
            }
        }
    }   

}
