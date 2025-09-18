package if2000_introduccionprogra;

import domain.Person;
import domain.SavingAccount;
import logic.Ejercicios_semana2_PracticaEnClase;
import logic.Ejercicios_semana2_lab1;
import logic.Quiz3;
import logic.Ejercicios_lab2;
import domain.Bank;
import domain.Log;
import domain.SinpeMovil;
import domain.SavingAccount;
import domain.Current;
import domain.Client;
import domain.Account;

/**
 *
 * @author Griss
 */
public class IF2000_IntroduccionProgra {
    
     /*public static void main(String[] args) {
         
        Person client1 = 
        new Person("Lucia", "Mora", "1-0356-5562", "88888888", 18);
         
         SavingAccount account1= 
        new SavingAccount("18-09-2025", 12, 5, "1000567801", 25000, client1);
         
        account1.deposit(3000);
        
        System.out.println(account1.toString());
        System.out.println("Withdraw of money");
        account1.withdraw(16000);
        System.out.println(account1.toString());
     }
}*/


    public static void main(String[] args) {

        // 1. Crear Bancos
        Bank bcr = new Bank("BCR");
        Bank bac = new Bank("BAC");

        // 2. Crear Clientes
        Client client1 = new Client("10101010", "Ana Perez", "8888-8888", "San José");
        Client client2 = new Client("20202020", "Luis Gomez", "9999-9999", "Alajuela");

        // 3. Crear Cuentas
        Account savings1 = new SavingAccount("001", 1000.0, client1, "2025-09-01", 12, 0.05);
        Account current1 = new Current("002", 2000.0, client2, 0.03);

        // 4. Agregar cuentas a los Bancos
        bcr.addAccount(savings1);
        bac.addAccount(current1);

        // 5. Realizar Depósito en cuenta de Ana
        savings1.deposit(500.0);
        Log log1 = new Log(1, "Deposit", savings1);
        System.out.println(log1);

        // 6. Realizar Retiro en cuenta de Ana
        savings1.withdraw(300.0);
        Log log2 = new Log(2, "Withdraw", savings1);
        System.out.println(log2);

        // 7. Probar Transferencia SINPE: Ana (BCR) → Luis (BAC)
        boolean result = SinpeMovil.transfer(bcr, savings1, bac, current1, 200.0);
        if (result) {
            Log log3 = new Log(3, "SINPE Transfer", current1);
            System.out.println(log3);
        }

        // 8. Mostrar saldos finales
        System.out.println("\n Final balances:");
        System.out.println("Ana (Savings - BCR): " + savings1.getBalance());
        System.out.println("Luis (Current - BAC): " + current1.getBalance());

        // 9. Mostrar todas las cuentas de cada banco
        System.out.println("\n--- Accounts by bank ---");
        bcr.showAccounts();
        bac.showAccounts();
    }
}

       //Quiz3 ej = new Quiz3();
       // ej.ejercicio();
    //}*/

     /* @param args the command line arguments
 /*public static void main(String[] args) {
        // TODO code application logic here
        
        
        //Data Types
        String name = "Lionel"; 
        int age = 40;
                
        System.out.println("Hello World");
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        
        //Python:
        //print('Hola Mundo')
        
        /*Tipos de dato numericos:
        int, long, short, float, double numeric, money, decimal
                
        Manejo de fechas:
        Date
                
        Cadena de caracteres:
        string, char
                
        Objetos:
        Object   
        
    }
    
}*/

    
    
    
/*public static void main(String[] args) {
        Ejercicios_semana2_PracticaEnClase ej;
        ej = new Ejercicios_semana2_PracticaEnClase();
        ej.quiz2_B_piramide(5);

    }
}*/

 
/*public static void main(String[] args) {
        Ejercicios_semana2_PracticaEnClase 
        ej = new Ejercicios_semana2_PracticaEnClase();
        ej.ejercicioA();
    }
}*/

/*public static void main(String[] args) {
        Ejercicios_semana2_PracticaEnClase 
        ej = new Ejercicios_semana2_PracticaEnClase();
        ej.ejercicioB();
    }
}*/

/*public static void main(String[] args) {
        Ejercicios_semana2_PracticaEnClase 
        ej = new Ejercicios_semana2_PracticaEnClase();
        ej.ejercicioC();
    }
}*/

/*public static void main(String[] args) {
        Ejercicios_semana2_PracticaEnClase 
        ej = new Ejercicios_semana2_PracticaEnClase();
        ej.ejercicioD();
    }
}*/

 /*public static void main(String[] args) {
        Ejercicios_semana2_PracticaEnClase 
        ej = new Ejercicios_semana2_PracticaEnClase();
        ej.ejercicioE();
    }
}*/
    
  /* public static void main(String[] args) {
        Ejercicios_semana2_PracticaEnClase 
        ej= new Ejercicios_semana2_PracticaEnClase();
        ej.ejercicioF();
    }
}*/
    /*public static void main(String[] args) {
        Ejercicios_semana2_lab1 
        ej = new Ejercicios_semana2_lab1();
        ej.ejercicio1();
    }
}*/
    /*public static void main(String[] args) {
        Ejercicios_semana2_lab1 
        ej = new Ejercicios_semana2_lab1();
        ej.ejercicio2();
    }
}*/
   /* public static void main(String[] args) {
        Ejercicios_semana2_lab1 
        ej = new Ejercicios_semana2_lab1();
        ej.ejercicio3();
    }
}*/
    /* public static void main(String[] args) {
        Ejercicios_semana2_lab1 
        ej = new Ejercicios_semana2_lab1();
        ej.ejercicio4();
    }
}*/
    /*public static void main(String[] args) {
        Ejercicios_semana2_lab1 
        ej = new Ejercicios_semana2_lab1();
        ej.ejercicio5();
    }
}*/
    /*public static void main(String[] args) {
        Ejercicios_semana2_lab1 
        ej = new Ejercicios_semana2_lab1();
        ej.ejercicio6();
    }
}*/
   /* public static void main(String[] args) {
        Ejercicios_semana2_lab1 
        ej = new Ejercicios_semana2_lab1();
        ej.ejercicio7();
    }
}*/
    /*public static void main(String[] args) {
        Ejercicios_semana2_lab1 
        ej = new Ejercicios_semana2_lab1();
        ej.ejercicio8();
    }
}*/
   /* public static void main(String[] args) {
        Ejercicios_semana2_lab1 
        ej = new Ejercicios_semana2_lab1();
        ej.ejercicio9();
    }
}*/
   /* public static void main(String[] args) {
        Ejercicios_semana2_lab1 
        ej = new Ejercicios_semana2_lab1();
        ej.ejercicio10();
    }
}*/
   /* public static void main(String[] args) {
        Ejercicios_semana2_lab1 
        ej = new Ejercicios_semana2_lab1();
        ej.ejercicio11();
    }
}*/
    /*public static void main(String[] args) {
        Ejercicios_semana2_lab1 
        ej = new Ejercicios_semana2_lab1();
        ej.ejercicio12();
    }
}*/
    
    /*  public static void main(String[] args) {
        Ejercicios_lab2 
        ej = new Ejercicios_lab2();
        ej.ejercicio13();
    }
}*/

 /*public static void main(String[] args) {
        Ejercicios_lab2 
        ej = new Ejercicios_lab2();
        ej.ejercicio14();
    }
 */

 /*public static void main(String[] args) {
        Ejercicios_lab2 
        ej = new Ejercicios_lab2();
        ej.ejercicio15();
    }
*/
/*public static void main(String[] args) {
        Ejercicios_lab2 
        ej = new Ejercicios_lab2();
        ej.ejercicio16();
    }
*/
/*public static void main(String[] args) {
        Ejercicios_lab2 
        ej = new Ejercicios_lab2();
        ej.ejercicio17();
    }
*/
  /*public static void main(String[] args) {
        Ejercicios_lab2 
        ej = new Ejercicios_lab2();
        ej.ejercicio18();
    }
*/
/*  public static void main(String[] args) {
        Ejercicios_lab2 
        ej = new Ejercicios_lab2();
        ej.ejercicio19();
    }
*/
    
 /* public static void main(String[] args) {
        Ejercicios_lab2 
        ej = new Ejercicios_lab2();
        ej.ejercicio20();
    }
*/
  /*public static void main(String[] args) {
        Ejercicios_lab2 
        ej = new Ejercicios_lab2();
        ej.ejercicio21();
    }
*/
  /*public static void main(String[] args) {
        Ejercicios_lab2 
        ej = new Ejercicios_lab2();
        ej.ejercicio22();
    }
*/
  /*public static void main(String[] args) {
        Ejercicios_lab2 
        ej = new Ejercicios_lab2();
        ej.ejercicio23();
    }
*/
  /*public static void main(String[] args) {
        Ejercicios_lab2 
        ej = new Ejercicios_lab2();
        ej.ejercicio24();
    }
*/
  /*public static void main(String[] args) {
        Ejercicios_lab2 
        ej = new Ejercicios_lab2();
        ej.ejercicio25();
    }
*/
  /*public static void main(String[] args) {
        Ejercicios_lab2 
        ej = new Ejercicios_lab2();
        ej.ejercicio26();
    }
*/
    /*public static void main(String[] args) {
        Ejercicios_lab2 
        ej = new Ejercicios_lab2();
        ej.ejercicio27();
    }
}*/
    

