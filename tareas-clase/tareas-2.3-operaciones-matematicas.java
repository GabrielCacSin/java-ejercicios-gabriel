class  ej16 {
    public static void main(String args[]) {
        int a = 10;
        int b = 5;
        System.out.println("La suma de:" + a + " + " + b + " = " + (a+b) );
        System.out.println("La resta de:" + a + " - " + b + " = " + (a-b) );
        System.out.println("La multiplicación de:" + a + " * " + b + " = " + (a*b) );
        System.out.println("La división de:" + a + " / " + b + " = " + (a/b) );
        System.out.println("el modulo de:" + a + " % " + b + " = " + (a%b) );
    }
    
}

class ej17{
    public static void main(String args[]) {
        int x = 10;
        System.out.println(x);
        x +=5;
        System.out.println(x);
        x *=5;
        System.out.println(x);
        x /=3;
        System.out.println(x);
        x--;
        System.out.println(x);
    }
}

class ej18{
    public static void main(String args[]) {
        int n = 5;
        ++n;
        n++;
        n--;
        --n;
        System.out.println(n);
    }
    /*
    ++n o --n → Prefijo: cambia el valor antes de usarlo.
    n++ o n-- → Posfijo: usa el valor antes de cambiarlo.
     */
}

class ej19{
    public static void main(String args[]) {
        int a = 3, b = 4, c = 2;

        int resultado = a++ + ++b * c--; 
        // Desglose paso a paso:
        // a++ → usa a (3) y luego incrementa a → a = 4 después
        // ++b → incrementa b antes de usarlo → b = 5
        // c-- → usa c (2) y luego lo decrementa → c = 1 después

        // Sustituyendo los valores usados:
        // resultado = 3 + (5 * 2) = 3 + 10 = 13

        System.out.println("Resultado = " + resultado);
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
    }
}

class ej20{
    public static void main(String args[]) {
        char letra = 'A';
        System.out.println(letra);
        letra++;
        System.out.println(letra);
        letra+=2;
        System.out.println(letra);
        letra = (char)(letra - 1);
        System.out.println(letra);
    }
}

class ej21{
    public static void main(String args[]) {
        int a = 5 , b = 6;
        System.out.println(a>b);
        System.out.println(a<b);
        System.out.println(a==b);
        System.out.println(a!=b);
    }
}

class ej22 {
    public static void main(String[] args) {
        int x = 15;
        boolean entre10y20 = (x >= 10) && (x <= 20);
        System.out.println("¿x está entre 10 y 20 (inclusive)? " + entre10y20);
    }
}

class ej23 {
    public static void main(String[] args) {
        boolean tieneDescuento = false;
        boolean esSocio = true;
        boolean puedeObtenerDescuento = tieneDescuento || esSocio;
        boolean noEsSocio = !esSocio;

        System.out.println("¿Puede obtener descuento? " + puedeObtenerDescuento);
        System.out.println("Resultado de !esSocio: " + noEsSocio);
    }
}

class ej24{
    public static void main(String[] args) {
        int edad = 30;
        boolean tieneCarnet = true;
        boolean puedeConducir = (edad >= 18) && tieneCarnet;

        System.out.println("¿Puede conducir? " + puedeConducir);
    }
}

class ej25 {
    public static void main(String[] args) {
        String usuario = "Admin";
        boolean igualConEquals = usuario.equals("admin");
        boolean igualSinImportarMayusculas = usuario.equalsIgnoreCase("admin");

        System.out.println("Comparación con equals(): " + igualConEquals);
        System.out.println("Comparación con equalsIgnoreCase(): " + igualSinImportarMayusculas);
    }
}
