import java.util.Scanner;

class ej1{
    public static void main(String args[]) {
        int a=5,b=3;
        int resultadoAND = a & b; // AND binario
        int resultadoOR = a | b;  // OR binario

        System.out.println("a = " + a + " (binario: 0101)");
        System.out.println("b = " + b + " (binario: 0011)");
        System.out.println("a & b = " + resultadoAND + " (binario: 0001)");
        System.out.println("a | b = " + resultadoOR + " (binario: 0111)");
    }
}

class ej2{
    public static void main(String args[]) {
        int x=10,y=12;
        int resultadoXOR = x ^ y; // XOR binario

        System.out.println("x = " + x + " (binario: 1010)");
        System.out.println("y = " + y + " (binario: 1100)");
        System.out.println("a & b = " + resultadoXOR + " (binario: 0110)");
    }
}

class ej3{
    public static void main(String args[]) {
        int n = 5;
        int contra = ~n;
        System.out.println("normal: " + n);
        System.out.println("negacion: " + contra);
    }
    // Explicación:
        // n = 5  → en binario: 00000000 00000000 00000000 00000101
        // ~n     → invierte los bits: 11111111 11111111 11111111 11111010
        // En Java los enteros se representan en complemento a dos,
        // por eso este valor corresponde a -6.
        // Regla práctica: ~n es igual a -(n + 1)
}

class Ejercicio4 {
    public static void main(String[] args) {
        int valor = 4;

        int resultado1 = valor << 1; // Desplaza 1 bit a la izquierda
        int resultado2 = valor << 2; // Desplaza 2 bits a la izquierda

        System.out.println("Valor original: " + valor);
        System.out.println("valor << 1 = " + resultado1);
        System.out.println("valor << 2 = " + resultado2);

        // Explicación:
        // valor = 4 → en binario: 00000000 00000000 00000000 00000100
        //
        // valor << 1 → desplaza todos los bits 1 posición a la izquierda:
        // 00000000 00000000 00000000 00001000 → equivale a 8
        //
        // valor << 2 → desplaza 2 posiciones a la izquierda:
        // 00000000 00000000 00000000 00010000 → equivale a 16
        //
        // Cada desplazamiento a la izquierda multiplica el número por 2.
        // Por tanto:
        // valor << 1 = valor * 2
        // valor << 2 = valor * 4
    }
}

class Ejercicio5 {
    public static void main(String[] args) {
        int numero = 32;

        int resultado1 = numero >> 1; // Desplaza 1 bit a la derecha
        int resultado2 = numero >> 2; // Desplaza 2 bits a la derecha

        System.out.println("Número original: " + numero);
        System.out.println("numero >> 1 = " + resultado1);
        System.out.println("numero >> 2 = " + resultado2);

        // Explicación:
        // numero = 32 → en binario: 00000000 00000000 00000000 00100000
        //
        // numero >> 1 → desplaza todos los bits una posición a la derecha:
        // 00000000 00000000 00000000 00010000 → equivale a 16
        //
        // numero >> 2 → desplaza 2 posiciones a la derecha:
        // 00000000 00000000 00000000 00001000 → equivale a 8
        //
        // Cada desplazamiento a la derecha divide el número entre 2
        // (descartando los decimales).
        // Por tanto:
        // numero >> 1 = numero / 2
        // numero >> 2 = numero / 4
    }
}

class Ejercicio6 {
    public static void main(String[] args) {
        int resultado = 3 + 4 * 2;

        System.out.println("Resultado: " + resultado);

        // Explicación:
        // En Java, la multiplicación (*) tiene mayor precedencia que la suma (+).
        // Por tanto, primero se calcula 4 * 2 = 8.
        // Luego se suma 3 + 8 = 11.
        //
        // Si quisiéramos que la suma se hiciera primero,
        // deberíamos usar paréntesis: (3 + 4) * 2 = 14.
    }
}

class Ejercicio7 {
    public static void main(String[] args) {
        int resultado1 = (3 + 4) * 2;
        int resultado2 = 3 + (4 * 2);

        System.out.println("(3 + 4) * 2 = " + resultado1);
        System.out.println("3 + (4 * 2) = " + resultado2);

        // Explicación:
        // En la primera expresión (3 + 4) * 2:
        // Los paréntesis obligan a sumar primero → 3 + 4 = 7
        // Luego se multiplica por 2 → 7 * 2 = 14

        // En la segunda expresión 3 + (4 * 2):
        // Los paréntesis obligan a multiplicar primero → 4 * 2 = 8
        // Luego se suma 3 + 8 = 11

        // Así, los paréntesis modifican el orden natural de precedencia
        // y cambian el resultado final.
    }
}

class Ejercicio8 {
    public static void main(String[] args) {
        int a = 5, b = 10, c = 2;

        int resultado1 = a + b / c;
        int resultado2 = (a + b) / c;

        System.out.println("a + b / c = " + resultado1);
        System.out.println("(a + b) / c = " + resultado2);

        // Explicación:
        // En la primera expresión: a + b / c
        // La división (/) tiene mayor precedencia que la suma (+),
        // por lo tanto se calcula primero b / c = 10 / 2 = 5,
        // luego se suma: a + 5 = 5 + 5 = 10.
        //
        // En la segunda expresión: (a + b) / c
        // Los paréntesis obligan a sumar primero:
        // (a + b) = 5 + 10 = 15,
        // luego se divide: 15 / 2 = 7 (recordemos que es división entera).
    }
}

class Ejercicio9 {
    public static void main(String[] args) {
        boolean x = true, y = false, z = true;

        boolean resultado1 = x || y && z;
        boolean resultado2 = (x || y) && z;

        System.out.println("x || y && z = " + resultado1);
        System.out.println("(x || y) && z = " + resultado2);

        // Explicación:
        // En Java, el operador && (AND) tiene mayor precedencia que || (OR).
        //
        // 1 En la primera expresión: x || y && z
        //    Se evalúa primero y && z:
        //       y && z = false && true → false
        //    Luego se evalúa x || (resultado):
        //       true || false → true
        //    Resultado final: true
        //
        // 2 En la segunda expresión: (x || y) && z
        //    Los paréntesis hacen que se evalúe primero x || y:
        //       true || false → true
        //    Luego se evalúa true && z:
        //       true && true → true
        //    Resultado final: true
        //
        // En este caso ambos dan true,
        // pero la diferencia está en el orden de evaluación.
        // Si los valores fueran distintos, el resultado podría cambiar.
    }
}

class Ejercicio10 {
    public static void main(String[] args) {
        int a = 4, b = 6, c = 2;

        int resultado = a + b * c - b / a;

        System.out.println("Resultado: " + resultado);

        // Explicación paso a paso:
        // Expresión: a + b * c - b / a
        //
        // Según la tabla de precedencia en Java:
        // 1️ Multiplicación (*) y división (/) tienen mayor precedencia que la suma (+) y la resta (-)
        // 2️ Si hay operadores con la misma precedencia, se evalúan de izquierda a derecha.
        //
        // Entonces:
        // b * c = 6 * 2 = 12
        // b / a = 6 / 4 = 1   (división entera, se descartan los decimales)
        //
        // Sustituyendo los valores:
        // a + b * c - b / a → 4 + 12 - 1
        // Se evalúan de izquierda a derecha:
        // 4 + 12 = 16
        // 16 - 1 = 15
        //
        // Resultado final = 15
    }
}

class Ejercicio11 {
    public static void main(String[] args) {
        int x = 5, y = 10, z = 15;

        // Evaluamos si x < y y y < z al mismo tiempo
        boolean condicion = (x < y) && (y < z);

        System.out.println("¿x es menor que y y y es menor que z? " + condicion);

        // Explicación:
        // x < y → 5 < 10 → true
        // y < z → 10 < 15 → true
        //
        // El operador lógico && (AND) devuelve true solo si ambas condiciones son verdaderas.
        // Por tanto: true && true → true
        //
        // Resultado final: true
    }
}

class Ejercicio12 {
    public static void main(String[] args) {
        boolean esAlumno = true;
        boolean tieneDescuento = false;

        // Puede acceder a la promoción si es alumno O tiene descuento
        boolean puedeAcceder = esAlumno || tieneDescuento;

        System.out.println("¿Puede acceder a la promoción? " + puedeAcceder);

        // Explicación:
        // esAlumno = true
        // tieneDescuento = false
        //
        // El operador lógico OR (||) devuelve true si al menos una condición es verdadera.
        // true || false → true
        //
        // Por tanto, aunque no tenga descuento, al ser alumno puede acceder a la promoción.
    }
}

class Ejercicio13 {
    public static void main(String[] args) {
        boolean activo = false;

        System.out.println("Valor original de 'activo': " + activo);

        // Aplicamos el operador de negación lógica
        boolean invertido = !activo;

        System.out.println("Valor después de aplicar !activo: " + invertido);

        // Explicación:
        // El operador ! invierte el valor lógico de la variable.
        // Si activo = false → !activo = true
        // Si activo = true  → !activo = false
        //
        // En este caso:
        // activo = false
        // invertido = true
    }
}

class Ejercicio14 {
    public static void main(String[] args) {
        boolean a = true, b = false, c = true;

        boolean resultado1 = a && b || c;
        boolean resultado2 = (a && b) || (a && c);

        System.out.println("a && b || c = " + resultado1);
        System.out.println("(a && b) || (a && c) = " + resultado2);

        // Explicación:
        //
        // En Java, el operador && (AND) tiene mayor precedencia que || (OR).

        //    Primero se evalúan los paréntesis:
        //       (a && b) = true && false → false
        //       (a && c) = true && true → true
        //    Luego: false || true → true
    }
}

class Ejercicio15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce tu edad: ");
        int edad = sc.nextInt();

        System.out.print("¿Tienes carnet? (true/false): ");
        boolean tieneCarnet = sc.nextBoolean();

        System.out.print("¿Has aprobado el examen? (true/false): ");
        boolean aprobadoExamen = sc.nextBoolean();

        boolean puedeObtenerLicencia = (edad >= 18) && tieneCarnet && aprobadoExamen;

        System.out.println("¿Puede obtener la licencia? " + puedeObtenerLicencia);

        // Cerramos el Scanner al final del programa
        sc.close();
    }
}

