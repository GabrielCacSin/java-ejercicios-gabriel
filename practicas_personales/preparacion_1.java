import java.util.Scanner;
public class preparacion_1 {
    public static void main(String[] args) {
        sep();
        ejercicio10();
    }
//-----------------------------------------------------------------------------------------------------------------------------------------

    static void sep(){
        System.out.println("*************************************************************************************************************");
    }

//-----------------------------------------------------------------------------------------------------------------------------------------

    static void ejercicio1(){
        System.out.println("Hola, estoy empezando con Java y métodos");
    }

//-----------------------------------------------------------------------------------------------------------------------------------------

    static void ejercicio2(){
        sep();
        Scanner sc = new Scanner(System.in);
        System.out.println("-- Vamos a realizar distintas operaciones matematicas --");
        System.out.println("-- dame el primer número --");
        int a = sc.nextInt();
        System.out.println("-- dame el segundo número --");
        int b = sc.nextInt();
        sep();
        System.out.println("la suma entre " + a + " y " + b + " es de: " + (a+b));
        System.out.println("la resta entre " + a + " y " + b + " es de: " + (a-b));
        System.out.println("la musltiplicación entre " + a + " y " + b + " es de: " + (a*b));
        double division = a/b;
        System.out.println("la division entre " + a + " y " + b + " es de: " + division);
        sep();
        sc.close();
    }

//-----------------------------------------------------------------------------------------------------------------------------------------

    static void ejercicio3(){
        sep();
        Scanner sc = new Scanner(System.in);
        System.out.println("-- Vamos a realizar distintas operaciones matematicas --");
        System.out.println("-- dame el número con el que vamos a trabajar --");
        int num = sc.nextInt();
        sep();

        System.out.println("el cuadrado de " + num + " es de: " + Math.pow(num, 2));
        System.out.println("la raiz cuadrada de " + num + " es de: " + Math.sqrt(num));
        System.out.println("el calor absoluto de " + num + " es de: " + Math.abs(num));

        sep();

        sc.close();
    }

//-----------------------------------------------------------------------------------------------------------------------------------------

    static int doble(int a){
        return (a*a);
    }

    static void ejercicio4(){
        sep();
        Scanner sc = new Scanner(System.in);
        System.out.println("-- dame el número con el que vamos a duplicar --");
        int num = sc.nextInt();
        System.out.println("el doble de " + num + " es " + doble(num));
        sc.close();
    }

//-----------------------------------------------------------------------------------------------------------------------------------------

    static double areaCuadrado(double lado){
        return (lado*lado);
    }

    static double perimetroCuadrado(double lado){
        return (lado+lado+lado+lado);
    }

    static void ejercicio5(){
        sep();
        Scanner sc = new Scanner(System.in);
        System.out.println("-- dame la longitud con el que vamos a calcular el area y el perimitero de los cuadrados --");
        int num = sc.nextInt();
        System.out.println("El Area de el cuadrado de lado " + num + " es de:" + (areaCuadrado(num)));
        System.out.println("El Perimetro de el cuadrado de lado " + num + " es de:" + (perimetroCuadrado(num)));
        sc.close();
    }

//-----------------------------------------------------------------------------------------------------------------------------------------
    static int max3(int a, int b, int c){
        if(a>=b && a >= c){
            return a;
        }
        if(b>=a && b>=c){
            return b;
        }else{
            return c;
        }
    }

    static void ejercicio6(){
        sep();
        Scanner sc = new Scanner(System.in);
        System.out.println("-- Vamos a ver que número es el más grande entre los tres qeu me vas a dar --");
        System.out.println("-- Dame el primero --");
        int a = sc.nextInt();
        System.out.println("-- Dame el el segundo --");
        int b = sc.nextInt();
        System.out.println("-- Dame el tercero --");
        int c = sc.nextInt();
        sep();
        System.out.println("El número más grande es: " + max3(a, b, c));
        sc.close();
    }

//-----------------------------------------------------------------------------------------------------------------------------------------

    static double media3(double a, double b, double c){
        return (((a+b+c)/3));
    }

    static void ejercicio7(){
        sep();
        Scanner sc = new Scanner(System.in);
        System.out.println("-- Vamos a calcualr la media entre los tres numeros que me vas a dar --");
        System.out.println("-- Dame el primero --");
        double a = sc.nextInt();
        System.out.println("-- Dame el el segundo --");
        double b = sc.nextInt();
        System.out.println("-- Dame el tercero --");
        double c = sc.nextInt();
        sep();
        System.out.println("La media es: " + media3(a, b, c));
        sc.close();
    }

//-----------------------------------------------------------------------------------------------------------------------------------------

    static String nombreCompleto(String nombre,String apellido1,String apellido2){
        String Completo_mayus=(apellido1 + " " + apellido2 + " " + nombre);
        return Completo_mayus;
    }

    static void ejercicio8(){
        sep();
        Scanner sc = new Scanner(System.in);
        System.out.println("dame tu nombre");
        String n = sc.nextLine();
        System.out.println("dame tu primer apellido");
        String ape1 = sc.nextLine();
        System.out.println("dame tu segundo apellido");
        String ape2 = sc.nextLine();
        System.out.println(nombreCompleto(n, ape1, ape2).toUpperCase());
        sc.close();
    }

//-----------------------------------------------------------------------------------------------------------------------------------------

    static int longitudSinEspacios(String frase){

        int longitud = frase.trim().length();
        return longitud;
    }

    static void ejercicio9(){
        sep();
        Scanner sc =  new Scanner(System.in);
        System.out.println("dame una frase y de devuelvo su longitud sin espacios");
        String frase = sc.nextLine();
        sep();
        System.out.println("la longitud es de: " + longitudSinEspacios(frase));
        sc.close();
    }

//-----------------------------------------------------------------------------------------------------------------------------------------

    static boolean esVocal(char c){
        c=Character.toLowerCase(c); //* el caracter lo transformo a minusculas por comodidad del if siguiente
        if(c=='a' || c == 'e' || c == 'i' || c == 'o' || c== 'u'){
            return true;
        }else{
            return false;
        }
    }

    static void ejercicio10(){
        Scanner sc = new Scanner(System.in); //* inicializo el scaner en esta variable sc donde se guardará lo que me dan por pantalla
        boolean sw =false; //* sw que usare para comprovar que solo sea un caracter lo qeu me pasen
        System.out.println("dame un caracter y te dire si es vocal"); //*pedir el caracter 
        String caracter = sc.next();    
        
            while (sw==false){  //*mediante este switch controlo que si o si emde solo 1 caracter
                if(caracter.length()>1){
                    System.out.println("dame un solo caracter y te dire si es vocal");  //* lo vuelvo a pedir
                    caracter = sc.nextLine().trim().charAt(0);   //* lo vuelvo a recoger para contarlo o usar aqui el charAt aqui para 
                }else{
                    sw=true;
                }
            }

        char verfi_caracter=caracter.charAt(0); //* como empieza a contar desde 0 y como el tamaño es de 1 pues guardo lo unico que hay como un char para pasarlo como parametro a la funcion es vocal
        System.out.println(esVocal(verfi_caracter));
        sc.close(); //* cierro el Scanner
    }

//-----------------------------------------------------------------------------------------------------------------------------------------


}