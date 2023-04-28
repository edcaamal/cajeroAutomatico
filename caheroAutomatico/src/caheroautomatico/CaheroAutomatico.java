package caheroautomatico;

import models.Cliente;

public class CaheroAutomatico {

    public static void main(String[] args) {
        // Clase Explisita
        Cliente chabelo = new Cliente();
        chabelo.setNombre("Javier Lopez");
        chabelo.setNumeroCuenta("8888888888");
        chabelo.setSaldo(0.0);
        System.out.println(chabelo);
        
        // Clase Implicita
        Cliente tarso = new Cliente("Ignacio Lopez", "7777777", 0.0);
        System.out.println(tarso);
    }
    
}
