package caheroautomatico;

import models.Cliente;
import static models.Cliente.clientes;

public class CaheroAutomatico {

    public static void main(String[] args) {
        
        clientes.add(new Cliente("Ignacio Lopez", "7777777", 0.0));
        clientes.add(new Cliente("Javier Lopez", "8888888", 0.0));
        
        System.out.println(clientes);
        
    }
    
}
