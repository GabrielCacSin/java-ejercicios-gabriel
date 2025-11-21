public class ejer_java_gabriel_2 {
    public static void main(String[] args) {
        //aqui se ejecutan las funciones, intentare comentar bien estos ej (no entinedo mucho)
        separador();
        System.out.println(ej7_recursividad(5));
        separador();
    }

//-----------------------------------------------------------------------------------------------------------------------------
    static void separador(){
        System.out.println("//-----------------------------------------------------------------------------------------------------------------------------");
    }

//-----------------------------------------------------------------------------------------------------------------------------
    
    static int ej1_recursividad(int num){
        if (num == 0) {
            return 0;
        }
        return 1 + ej1_recursividad(num / 10);
    }

//-----------------------------------------------------------------------------------------------------------------------------

    static void ej3_recursividad(int n) {
        if (n < 10) {
            System.out.print(n);
            return; 
        }   
        int ultimoDigito = n % 10;
        System.out.print(ultimoDigito);
        ej3_recursividad(n / 10);
    }

//-----------------------------------------------------------------------------------------------------------------------------



//-----------------------------------------------------------------------------------------------------------------------------
    static boolean ej6_recursividad(String palabra){
    // Si la palabra tiene 0 o 1 letra, ya está ordenada por definición.
        if (palabra.length() <= 1) {
            return true;
        }
    /*
    *   Comparamos la primera letra con la segunda. 
    *   significa que está desordenada. Devolvemos false inmediatamente.
    *
    */ 
        if (palabra.charAt(0) > palabra.charAt(1)) {
            return false;
        }
        return ej6_recursividad(palabra.substring(1));
    }

//-----------------------------------------------------------------------------------------------------------------------------
    
    static String ej7_recursividad(int N) {
        if (N <= 0) {
            return "N debe ser un número natural (mayor que cero).";
        }
        int sumaTotal = calcularSumaRecursiva(N);
        String cadenaFormato = construirCadenaRecursiva(N);
        return "(" + cadenaFormato + " = " + sumaTotal + ")";
    }

//-----------------------------------------------------------------------------------------------------------------------------

    static int calcularSumaRecursiva(int n) {
        if (n == 1) {
            return 1;
        }
        return n + calcularSumaRecursiva(n - 1);
    }

//-----------------------------------------------------------------------------------------------------------------------------

    static String construirCadenaRecursiva(int n) {
        if (n == 1) {
            return "1";
        }
        return construirCadenaRecursiva(n - 1) + " + " + n;
    }

//-----------------------------------------------------------------------------------------------------------------------------
}