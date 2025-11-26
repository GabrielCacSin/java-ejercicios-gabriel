import java.util.Arrays;

public class array_ejemplo1 {
    public static void main(String[] args) {
        System.out.println();
        System.out.println();

        String [][] ej1 = crearMatrizD(4);
        imprimirMAtriz(ej1);

        System.out.println();
        System.out.println();
        
        imprimirMAtriz(crearMatrizd(4));
    }

    static String[][] crearMatrizD(int n){
        String[][] matriz = new String[n][n]; //creamos una matriz cuadrada
        for(int i=0;i<matriz.length;i++){           
            for(int j=0;j<matriz[i].length;j++){
                if(i==j){
                    matriz[i][j]="X";
                }else{
                    matriz[i][j]="-";
                }
            }
        }
        return matriz;
    }

    static String[][] crearMatrizd(int n){
        String[][] matriz = new String[n][n]; //creamos una matriz cuadrada
        for(int i=0;i<matriz.length;i++){           
            for(int j=0;j<matriz[i].length;j++){
                if(j==matriz.length-1-i){
                    matriz[i][j]="X";
                }else{
                    matriz[i][j]="-";
                }
            }
        }
        return matriz;
    }

    static void imprimirMAtriz(String[][] m){
        for(String[] fila:m){
            System.out.println(Arrays.toString(fila));
        }
    }
}
