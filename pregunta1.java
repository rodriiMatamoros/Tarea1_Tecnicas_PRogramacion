//¿Qué algoritmos usas en tu vida cotidiana?

//Utilizo algoritmos para resolver problemas matematicos, como por ejemplo, para resolver ecuaciones de segundo grado.

//Este es el codigo
class EcuacionSegundoGrado{
    public static void main(String[] args) {
        double a = 1;
        double b = 5;
        double c = 6;
        double x1 = (-b + Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a);
        double x2 = (-b - Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a);
        System.out.println("El valor de x1 es: " + x1);
        System.out.println("El valor de x2 es: " + x2);
    }
}



