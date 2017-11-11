
package observador;

import java.util.GregorianCalendar;

public class Observador {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Producto prod  = new Producto();
        prod.setNombre("Patatas");
        prod.setDescripcion("Patatas fritas");
        prod.setPrecio(20);
        prod.setStock(0);
        
        Cliente cli = new Cliente();
        cli.setCodigo("CLI0001");
        cli.setNombre("Lin");
        cli.setApellidos("tipo");
        cli.setEmail("cliente@gmail.com");
        cli.setFechaNacimiento(new GregorianCalendar().getTime());
         Cliente cli2 = new Cliente();
        cli2.setCodigo("CLI0002");
        cli2.setNombre("Mariano");
        cli2.setApellidos("tipo");
        cli2.setEmail("cliente@gmail.com");
        cli2.setFechaNacimiento(new GregorianCalendar().getTime());
         Cliente cli3 = new Cliente();
        cli3.setCodigo("CLI0003");
        cli3.setNombre("Jose Luis");
        cli3.setApellidos("tipo");
        cli3.setEmail("cliente@gmail.com");
        cli3.setFechaNacimiento(new GregorianCalendar().getTime());
        
        
        //se añaden observadores a la clase observable
        prod.addObserver(cli);
        prod.addObserver(cli2);
        prod.addObserver(cli3);
        
        //un cambio en la clase observada hará "reaccionar" a la clase observada
        prod.setStock(57);
    }
    
}
