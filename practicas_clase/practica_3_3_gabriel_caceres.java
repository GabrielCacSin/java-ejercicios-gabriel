public class practica_3_3_gabriel_caceres {
    
    public static void main(String[] args) {
        System.out.println(SumaInversos(4));
    }


//--------------------------------------------------------------------------------------------------------
    static int Potencia(int base, int exponente){
        if(exponente == 0){
            return 1;
        }
    return base * Potencia(base, exponente - 1);
    }
//--------------------------------------------------------------------------------------------------------
    static boolean Inversa(String s){
    return InvRec(s, 0);
    }

    static boolean InvRec(String s, int i){
        if(i == s.length() - 1){
            return true;
        }
        if(s.charAt(i) < s.charAt(i+1)){
            return false;
        }
    return InvRec(s, i+1);
    }
//--------------------------------------------------------------------------------------------------------
    static double SumaInversos(int n){
    System.out.print("1/" + n);
        if(n == 1){
            System.out.print(" = ");
            return 1.0;
        } else {
            System.out.print(" + ");
        }
    return (1.0 / n) + SumaInversos(n - 1);
    }
//--------------------------------------------------------------------------------------------------------


}
