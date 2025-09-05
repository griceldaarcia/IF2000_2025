package logic;

/**
 *
 * @author Griss
 */
public class Quiz3 {
public Quiz3() {
    }
    public void ejercicio() {
        int n = 7; // tamaño del lado del cuadrado (debe ser impar para tener centro exacto)
        Ejercicio_cuadradoConCentro(n);
    }

    public void Ejercicio_cuadradoConCentro(int n) {
        int centro = (n / 2) + 1; // posición del centro (para n impar)

        for (int i = 1; i <= n; i++) {          
            for (int j = 1; j <= n; j++) {     
                if (i == 1 || i == n || j == 1 || j == n) {
                    System.out.print("* ");
                } else if (i == centro && j == centro) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}

    
  
