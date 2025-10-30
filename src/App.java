public class App {
    public static void main(String[] args) throws Exception {
        int num = Integer.parseInt(System.console().readLine("Introduzca un número entero y le diré si es primo: "));
        boolean esprimo = true;

        for (int i = 2; i < num; i++) {
            if ((num % i) == 0){
                esprimo = false;
            }
        }
        if (esprimo == true) {
            System.out.println("El número introducido es primo.");
        } else {
            System.out.println("El número introducido no es primo.");
        }
    }
}
