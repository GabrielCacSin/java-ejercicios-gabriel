import java.util.Scanner;


class ej1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Dame un número entero entre 0 y 9999:");
        int num = sc.nextInt();

        int numInverso = 0;
        int original = num; // guardamos el original para mostrarlo después

        while (num > 0) {
            int ultimo = num % 10;            // tomamos el último dígito
            numInverso = numInverso * 10 + ultimo; // lo añadimos al inverso
            num /= 10;                        // quitamos el último dígito
        }
        System.out.println("El número " + original + " al revés es: " + numInverso);
        sc.close();
    }
}

class ej2{
    public static void main(String[] args) {
        /*
        2.	Leer una cantidad ‘N’ y luego introducir ‘N’ números enteros. Se pide imprimir la media aritmética de los números introducidos,
        y la diferencia del número máximo y el número mínimo (resta entre el número máximo y el número mínimo). 
        */

        Scanner sc = new Scanner(System.in);
        System.out.print("dime un numero entre el 1 al 10: ");
        int cant = sc.nextInt(); //cant de cantidad de veces qeu se va a repetir este proceso
        int acumulador=0,max=0,min=0,diff;  //prefiero definir todas las comunes en una sola linea parece mas limpio
        System.out.println("bien ahora me vas a dar " + cant + " numeros para realizar distintos calculos");
        for(int i=1; i<=cant ; i++){            //opté or el bucle for ya que se exactamente el numero de veces qeu voy a realizar la operacion de pedir un numeor y trabajar con ello
            System.out.println("el numero " + i + " cúal va a ser?: ");
            int num = sc.nextInt();
            acumulador+=num; // lo primero que hago despues de pedir el numero es acumularlo para calcular la media al finalizar este bucle
            if(i==1){ // como es la primera vez lo igualo para los dos casos 
                max=num;
                min=num;
            }else{
                if(num>max){ // apartir de la segunda ya se va comparando con el maximo y con el minimo
                    max=num;
                }
                if(num<min){
                    min=num;
                }
            }
        }
        float media = (float) (acumulador/cant); // por si puede llegar a haber algun decimal a la hora de hacer la media
        diff=max-min; // resta de ver la differencia entre el maximo y el mínimo
        System.out.println("RESULTADOS:");
        System.out.println("Media: " + media);
        System.out.println("Máximo: " + max);
        System.out.println("Mínimo: " + min);
        System.out.println("Diferencia (max - min): " + diff);
        sc.close();
    }
}

class ej3{
    public static void main(String[] args) {
        /*
        3.	Escribir un programa que pida números enteros hasta que se introduzca un valor menor o igual a cero.
        A continuación, debe mostrar la multiplicación total de dichos números.
        Se deben incluir todos los números que hemos ido introduciendo por el teclado. No se pueden utilizar Arrays. 
        */
    
    Scanner sc = new Scanner(System.in); //abro el escaner (si no se me olvida ex)
    System.out.println("Me vas a dar numeros enteros hasta que pongas un 0 o un numero negativo y yo los ire multiplicando");
    boolean sw = true; //inicio la condicion de salida de mi bucle while
    int acumulador=1; // lo inicio en 1 porque voy a multiplicar y si lo inicializo a 0 todo me daria 0 
    while (sw == true) {
        System.out.println("Dame un numero"); // en cada vuelta pido un numero
        int num = sc.nextInt();
        if(num>0)   // y comprubeo qeu cumpal la condicion de ser un numero positivo y 0 no vale
            acumulador*=num;    // voy multiplicando los numero hasta que me canse
        else{
            sw=false;           //si no lo cumple se sale del bucle esto se podria cambiar por un break pero me gusta más asá
        }
    }
    System.out.println("el resultado de multiplicar todos los numeros que me has dado es: " + acumulador);
    sc.close();
}
}

