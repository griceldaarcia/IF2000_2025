package logic;

import java.util.Arrays;
import java.util.Scanner;
/**
 *
 * @author Griss
 */
public class Ejercicios_semana2_lab1 {
     public Ejercicios_semana2_lab1() {
    }
  
     public void ejercicio1() {
        Ejercicio_1_parImpar();
    }

    public void Ejercicio_1_parImpar() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un numero entero: ");
        int n = sc.nextInt();

        if (n % 2 == 0) {
            System.out.println(n + " es PAR.");
        } else {
            System.out.println(n + " es IMPAR.");
        }
    }

     
     public void ejercicio2() {
        Ejercicio_2_valorAbsoluto();
    }

    public void Ejercicio_2_valorAbsoluto() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un numero: ");
        int n = sc.nextInt();

        int absoluto = (n < 0) ? -n : n;

        System.out.println("El valor absoluto de " + n + " es: " + absoluto);
    }

 
    public void ejercicio3() {
        Ejercicio_3_serie();
    }

    public void Ejercicio_3_serie() {
        int suma = 0;

        System.out.println("Serie de multiplos de 3 hasta 99:");
        for (int i = 3; i <= 99; i += 3) {
            System.out.print(i + " ");
            suma += i;
        }

        System.out.println("\nSuma total: " + suma);
    }



    public void ejercicio4() {
        Ejercicio_4_ordenAscendente();
    }

    public void Ejercicio_4_ordenAscendente() {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[3];

        System.out.println("Ingrese 3 numeros:");
        for (int i = 0; i < 3; i++) {
            System.out.print("Numero " + (i + 1) + ": ");
            numeros[i] = sc.nextInt();
        }

        Arrays.sort(numeros);
        System.out.println("Numeros en orden ascendente: " + Arrays.toString(numeros));
    }

    
    public void ejercicio5() {
        Ejercicio_5_operaciones();
    }

    public void Ejercicio_5_operaciones() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el primer numero: ");
        int a = sc.nextInt();
        System.out.print("Ingrese el segundo numero: ");
        int b = sc.nextInt();

        int resultado;
        if (a == b) {
            resultado = a * b;
        } else if (a > b) {
            resultado = a - b;
        } else {
            resultado = a + b;
        }

        System.out.println("Resultado: " + resultado);
    }


    public void ejercicio6() {
        Ejercicio_6_notas();
    }

    public void Ejercicio_6_notas() {
        Scanner sc = new Scanner(System.in);
        boolean huboDiez = false;
        int nota;

        System.out.println("Ingrese notas (0-10). Ingrese -1 para terminar:");
        while (true) {
            nota = sc.nextInt();
            if (nota == -1) break;
            if (nota == 10) huboDiez = true;
        }

        if (huboDiez) {
            System.out.println("Si hubo al menos una nota con 10.");
        } else {
            System.out.println("No hubo ninguna nota con 10.");
        }
    }

    public void ejercicio7() {
        Ejercicio_7_pulsaciones();
    }

    public void Ejercicio_7_pulsaciones() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese su edad: ");
        int edad = sc.nextInt();
        System.out.print("Ingrese su sexo (M/F): ");
        char sexo = sc.next().toUpperCase().charAt(0);

        int pulsaciones;
        if (sexo == 'F') {
            pulsaciones = (220 - edad) / 10;
        } else {
            pulsaciones = (210 - edad) / 10;
        }

        System.out.println("Numero de pulsaciones por 10 segundos: " + pulsaciones);
    }


    public void ejercicio8() {
        Ejercicio_8_utilidad();
    }

    public void Ejercicio_8_utilidad() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese su salario mensual: ");
        double salario = sc.nextDouble();
        System.out.print("Ingrese sus annos en la empresa: ");
        int años = sc.nextInt();

        double utilidad;
        if (años < 1) utilidad = salario * 0.05;
        else if (años < 2) utilidad = salario * 0.07;
        else if (años < 5) utilidad = salario * 0.10;
        else if (años < 10) utilidad = salario * 0.15;
        else utilidad = salario * 0.20;

        System.out.println("Utilidad anual: " + utilidad);
    }

    
    public void ejercicio9() {
        Ejercicio_9_primo();
    }

    public void Ejercicio_9_primo() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un numero: ");
        int n = sc.nextInt();

        boolean esPrimo = n > 1;
        for (int i = 2; i <= Math.sqrt(n) && esPrimo; i++) {
            if (n % i == 0) esPrimo = false;
        }

        if (esPrimo) {
            System.out.println(n + " es primo.");
        } else {
            System.out.println(n + " no es primo.");
        }
    }

    public void ejercicio10() {
        Ejercicio_10_descuento();
    }

    public void Ejercicio_10_descuento() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de computadoras: ");
        int cantidad = sc.nextInt();

        double precioUnitario = 11000;
        double total = cantidad * precioUnitario;
        double descuento;

        if (cantidad < 5) descuento = total * 0.10;
        else if (cantidad < 10) descuento = total * 0.20;
        else descuento = total * 0.40;

        double totalPagar = total - descuento;

        System.out.println("Cantidad comprada: " + cantidad);
        System.out.println("Precio total sin descuento: " + total);
        System.out.println("Descuento aplicado: " + descuento);
        System.out.println("Total a pagar: " + totalPagar);
    }

    public void ejercicio11() {
        Ejercicio_11_listaPrimos();
    }

    public void Ejercicio_11_listaPrimos() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un numero N: ");
        int N = sc.nextInt();

        System.out.println("Numeros primos entre 2 y " + N + ":");
        for (int i = 2; i <= N; i++) {
            if (esPrimo(i)) {
                System.out.print(i + " ");
            }
        }
    }

    private boolean esPrimo(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

 
    public void ejercicio12() {
        Ejercicio_12_areaTriangulo();
    }
    
    public void Ejercicio_12_areaTriangulo() {
        Scanner sc = new Scanner(System.in);
//si va a probar con decimales, coloque (,) y no (.) ej: 5,5
        System.out.print("Ingrese la base del triangulo: ");
        double base = sc.nextDouble();
        System.out.print("Ingrese la altura del triangulo: ");
        
        double altura = sc.nextDouble(); 
        double area = (base * altura) / 2;

        System.out.println("Area del triangulo: " + area);
    }
}
     
     
     
     
     
     

