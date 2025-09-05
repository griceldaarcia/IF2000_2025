package logic;

import java.util.Scanner;

/**
 * Ejercicios de 13-27
 * @author Griss
 */
public class Ejercicios_lab2 {
   public Ejercicios_lab2 (){
}
    public void ejercicio13() {
        Ejercicio_13_sumaPares();
    }

    public void Ejercicio_13_sumaPares() {
        int suma = 0;
        for (int i = 2; i <= 1000; i += 2) {
            suma += i;
        }
        System.out.println("La suma de los numeros pares de 2 a 1000 es: " + suma);
    }

    public void ejercicio14() {
        Ejercicio_14_celsiusFahrenheit();
    }

    public void Ejercicio_14_celsiusFahrenheit() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese la temperatura en grados Celsius: ");
        double c = sc.nextDouble();
        double f = (9.0 / 5.0) * c + 32;
        System.out.println("Equivalente en grados Fahrenheit: " + f);
    }

    public void ejercicio15() {
        Ejercicio_15_potencia();
    }

    public void Ejercicio_15_potencia() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un numero entero X: ");
        int x = sc.nextInt();
        System.out.print("Ingrese un numero entero Ny: ");
        int n = sc.nextInt();

        long resultado = 1;
        for (int i = 1; i <= n; i++) {
            resultado *= x;
        }

        System.out.println(x + " elevado a la " + n + " es: " + resultado);
    }

    public void ejercicio16() {
        Ejercicio_16_mes();
    }

    public void Ejercicio_16_mes() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un numero (1-12): ");
        int mes = sc.nextInt();

        String[] meses = {"Enero","Febrero","Marzo","Abril","Mayo","Junio",
                          "Julio","Agosto","Septiembre","Octubre","Noviembre","Diciembre"};

        if (mes >= 1 && mes <= 12) {
            System.out.println("Mes: " + meses[mes - 1]);
        } else {
            System.out.println("Numero invalido");
        }
    }


    public void ejercicio17() {
        Ejercicio_17_funcion();
    }

    public void Ejercicio_17_funcion() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el valor de x: ");
        int x = sc.nextInt();

        int resultado;
        if (x > 0) resultado = x + 5;
        else if (x < 0) resultado = x * x;
        else resultado = 1;

        System.out.println("F(x) = " + resultado);
    }


    public void ejercicio18() {
        Ejercicio_18_areaTriangulo();
    }

    public void Ejercicio_18_areaTriangulo() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el lado a: ");
        double a = sc.nextDouble();
        System.out.print("Ingrese el lado b: ");
        double b = sc.nextDouble();
        System.out.print("Ingrese el lado c: ");
        double c = sc.nextDouble();

        double p = (a + b + c) / 2.0;
        double area = Math.sqrt(p * (p - a) * (p - b) * (p - c));

        System.out.println("Area del triangulo: " + area);
    }

    public void ejercicio19() {
        Ejercicio_19_intercambio();
    }

    public void Ejercicio_19_intercambio() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese valor de A: ");
        int A = sc.nextInt();
        System.out.print("Ingrese valor de B: ");
        int B = sc.nextInt();

        int temp = A;
        A = B;
        B = temp;

        System.out.println("Despues del intercambio: A = " + A + ", B = " + B);
    }


    public void ejercicio20() {
        Ejercicio_20_recta();
    }

    public void Ejercicio_20_recta() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese X0: ");
        double x0 = sc.nextDouble();
        System.out.print("Ingrese Y0: ");
        double y0 = sc.nextDouble();
        System.out.print("Ingrese X1: ");
        double x1 = sc.nextDouble();
        System.out.print("Ingrese Y1: ");
        double y1 = sc.nextDouble();

        double m = (y0 - y1) / (x0 - x1);
        double b = y0 - m * x0;

        System.out.println("La ecuacion de la recta es: y = " + m + "x + " + b);
    }

    
    public void ejercicio21() {
        Ejercicio_21_sumaNaturales();
    }

    public void Ejercicio_21_sumaNaturales() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un numero natural K: ");
        int K = sc.nextInt();

        int suma = 0;
        for (int i = 1; i < K; i++) {
            suma += i;
        }

        System.out.println("La suma de los naturales menores a " + K + " es: " + suma);
    }


    public void ejercicio22() {
        Ejercicio_22_media();
    }

    public void Ejercicio_22_media() {
        Scanner sc = new Scanner(System.in);
        double suma = 0;
        int contador = 0;
        double num;

        System.out.println("Ingrese numeros positivos (0 para terminar):");
        while (true) {
            num = sc.nextDouble();
            if (num == 0) break;
            if (num > 0) {
                suma += num;
                contador++;
            }
        }

        if (contador > 0) {
            double media = suma / contador;
            System.out.println("La media es: " + media);
        } else {
            System.out.println("No se ingresaron numeros validos.");
        }
    }


    public void ejercicio23() {
        Ejercicio_23_numeros();
    }

    public void Ejercicio_23_numeros() {
        Scanner sc = new Scanner(System.in);
        int pares = 0, impares = 0, sumaPares = 0, sumaImpares = 0, sumaTotal = 0;

        System.out.println("Ingrese 10 numeros enteros:");
        for (int i = 0; i < 10; i++) {
            int num = sc.nextInt();
            sumaTotal += num;
            if (num % 2 == 0) {
                pares++;
                sumaPares += num;
            } else {
                impares++;
                sumaImpares += num;
            }
        }

        System.out.println("Cantidad de pares: " + pares);
        System.out.println("Cantidad de impares: " + impares);
        System.out.println("Suma total: " + sumaTotal);
        System.out.println("Suma pares: " + sumaPares);
        System.out.println("Suma impares: " + sumaImpares);
    }


    public void ejercicio24() {
        Ejercicio_24_sumas();
    }

    public void Ejercicio_24_sumas() {
        int sumaPares = 0, sumaImpares = 0;

        for (int i = 1; i <= 200; i++) {
            if (i % 2 == 0) sumaPares += i;
            else sumaImpares += i;
        }

        System.out.println("Suma de pares entre 1 y 200: " + sumaPares);
        System.out.println("Suma de impares entre 1 y 200: " + sumaImpares);
    }


    public void ejercicio25() {
        Ejercicio_25_sumaCuadrados();
    }

    public void Ejercicio_25_sumaCuadrados() {
        int suma = 0;
        for (int i = 1; i <= 100; i++) {
            suma += i * i;
        }
        System.out.println("La suma de los cuadrados de 1 a 100 es: " + suma);
    }


    public void ejercicio26() {
        Ejercicio_26_factorial();
    }

    public void Ejercicio_26_factorial() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un numero entero positivo: ");
        int n = sc.nextInt();

        long fact = 1;
        if (n == 0 || n == 1) {
            fact = 1;
        } else {
            for (int i = 2; i <= n; i++) {
                fact *= i;
            }
        }

        System.out.println(n + "! = " + fact);
    }

    public void ejercicio27() {
        Ejercicio_27_maximo();
    }

    public void Ejercicio_27_maximo() {
        Scanner sc = new Scanner(System.in);
        int max = Integer.MIN_VALUE;

        System.out.println("Ingrese 10 numeros:");
        for (int i = 0; i < 10; i++) {
            int num = sc.nextInt();
            if (num > max) max = num;
        }

        System.out.println("El valor maximo es: " + max);
    }
}













 
  
