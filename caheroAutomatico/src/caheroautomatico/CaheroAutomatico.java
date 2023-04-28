package caheroautomatico;

import models.Cliente;
import static models.Cliente.clientes;
import static models.Cliente.ingresarSaldo;

public class CaheroAutomatico {

    public static void main(String[] args) {
        
        clientes.add(new Cliente("Ignacio Lopez", "7777777", 0.0)); // 0
        clientes.add(new Cliente("Javier Lopez", "8888888", 0.0));  // 1
        System.out.println(clientes);
        
        ingresarSaldo(1, 100.00);
        System.out.println(clientes);
        ingresarSaldo(1, 70.00);
        System.out.println(clientes);
        
    }
    
}
