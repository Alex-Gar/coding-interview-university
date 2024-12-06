package LogicaProgramacion.Cursos.AlgoritmosLogicaProgramacion;

public class OperacionesSinUtilizarOperadores {
    public static void main(String[] args) {

        // Resta sin utilizar operdaor
        // -- resta(8, 4);

        // Multiplicación sin utilizar el operador
        // multiplicacion(10, 10);
        // multiplicacionV2(10, 10);

        // Division sin utilizar el operador
        // division(15, 5.2f);

        // Potencia sin utilizar el operador
        // potencia(5, 5);

        // Potencia sin utilizar el operador
        // factorialNumero(8);
        // factorialNumerov2(8);

        // Numeros primos
        // numerosPrimos(8);

        // Numero Perfecto
        // numerosPerfectos(8);
        // numerosPerfectosV2(6);

        // Numeros Amigos
        numerosAmigos(226, 280);
    }

    /** Resta de dos numeros sin utilizar el operaodr de Resta (-) **/
    // Declaración de las variables con los valores
    public static float resta(float a, float b) {
        // Declaración de una variable de ayuda
        float contador = 0;

        // Variables para conocer que variable(valor) es mayor: Esto sirve para que el
        // ciclo funcione de ambos lados
        float mayor = a;
        float menor = b;

        // Condicion que permite reasignar los datos segun su valor de mayor a menor
        if (!(a > b)) {
            mayor = b;
            menor = a;
        }

        // Ciclo que se itera hasta que ambos datos sean iguales
        while (mayor > menor) {
            // Se suma un 1 si (menor es menor a mayor)
            menor++;
            // Se lleva un contador por cada 1 sumado al menor
            contador++;
            // System.out.println("menor: " + menor + " contador: " + contador);
        }
        // Cundo mayor y menor son iguales finaliza la condición y se imprime el
        // contador
        // System.out.println("Resta: " + a + " - " + b + " = " + contador);
        return contador;
    }

    /**
     * Multiplicación de dos numeros sin utilizar el operaodr de Multiplicación (*)
     **/
    public static void multiplicacion(int a, int b) {
        int contador = 0;
        for (int i = 0; i < a; i++) {
            contador += b;
        }
        System.out.println("Multiplicación: " + a + " * " + b + " = " + contador);
    }

    // Forma curso
    public static void multiplicacionV2(int a, int b) {
        int va = a;
        int contador = 0;
        while (a > 0) {
            a--;
            contador += b;
        }
        System.out.println("Multiplicación V2: " + va + " * " + b + " = " + contador);
    }

    public static void division(float a, float b) {
        float contador = 0;
        float residuo = a;
        // 15 / 5 = 3;
        while (residuo >= b) {
            // residuo = resta(residuo, b);
            residuo -= b;
            contador++;
        }
        System.out.println("Divición: " + a + " / " + b + " = " + contador + " Residuo = " + residuo);
    }

    public static void potencia(float a, float b) {
        // 5(5)
        // 5 * 5 * 5 * 5 * 5 = 1325;
        float bb = b;
        float contador = a;
        while (b > 1) {
            contador *= 5;
            b--;
            System.out.println(b + "count " + contador);
        }
        System.out.println("Potencia: " + a + "(" + bb + ")" + " = " + contador);
    }

    public static void factorialNumero(int a) {
        // 7! = 1 * 2 * 3 * 4 * 5 * 6 * 7 = 5.040
        // 2 6 24 120 720
        int contador = 1;
        int indice = 0;

        while (indice < a) {
            contador *= (indice + 1);
            // System.out.println( " resultado: " + contador);
        }
        System.out.println("El factorial es: " + contador);
    }

    public static void factorialNumerov2(int a) {
        int value = 1;
        for (int i = 1; i <= a; i++) {
            value *= i;
        }
        System.out.println(value);
    }

    public static void numerosPrimos(int limite) {
        boolean prime = true;
        for (int i = 2; i < limite / 2; i++) {
            int resultado = limite % i;
            System.out.println(resultado);
            if (limite % i == 0) {
                prime = false;
            }
        }
        if (prime) {
            System.out.println(limite + " Is prime");
        } else {
            System.out.println(limite + " Is not prime");
        }
    }

    // Iterador se utiliza dos iteradores aninados uno contando de 1 al valor y el
    // otro de forma inversa
    public static void numerosPerfectos(int valor) {
        int resultado = 0;
        int contador = 0;

        for (int i = 1; i < (valor + 1); i++) {
            for (int j = 1; valor > j; j++) {
                resultado = i * j;
                // Si en la multiplicacion el resultado es igual al valor se toma el numero por
                // el que se multiplioca y se suma
                if (resultado == valor) {
                    contador += j;
                    System.out.println(i + " * " + j + " Resultado " + resultado);
                }
            }
        }

        System.out
                .println(contador == valor ? "Numero perfcto = " + contador : "No es un numero perfcto = " + contador);
    }

    // Division: si el resultado es igual a 0 se suma el divisor
    public static void numerosPerfectosV2(int numero) {
        int value = 0;

        for (int i = 1; i < (numero/2); i++) {
            if (numero % i == 0) {
                value += i;
            }
        }

        System.out.println(value == numero ? "Numero perfcto = " + numero : " No es un numero perfecto = " + numero);
    }

    public static void numerosAmigos(int valor1, int valor2) {
        int contador = 0;
        int contador2 = 0;

        for (int i = 1; i < (valor1/2); i++) {
            if (valor1 % i == 0) {
                contador += i;
            }
        }

        for (int i = 1; i < (valor2/2); i++) {
            if (valor2 % i == 0) {
                contador2 += i;
            }
        }
        System.out.println(contador == valor2 && contador2 == valor1 ? "Numeros amigos: " + contador + " " + contador2
                : "No son numeros amigos " + contador + " " + contador2);
    }

}
