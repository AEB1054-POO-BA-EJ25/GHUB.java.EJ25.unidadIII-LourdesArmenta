package miPrincipal;
public class Principal {
    public static void main(String[] args) {
        Publicacion publicacion = new Publicacion();
        publicacion.setEditorial("McGrawnHill");
        publicacion.setFecha("01/01/1989");

        Libro libro = new Libro();
        Libro libro1 = new Libro("ISBN","Juan Collado");
        Libro libro2 = new Libro("AlfaOmega","12/05/2020","21122","Aurora Diaz");

        Revista revista = new Revista();
        revista.setEditorial("Porrua");
        revista.setFecha("8/11/2021");
        revista.setPeriodicidad("mensual");
        revista.setEjemplares(200);

        System.out.println(publicacion);

        System.out.println(libro);
        System.out.println(libro1.toString());
        System.out.println(libro2);

        System.out.println(revista);

        
    }
}