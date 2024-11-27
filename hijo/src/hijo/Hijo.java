package hijo;


public class Hijo {

    public static void main(String[] args) {
      
    Padre p1 = new Padre(4,"malo","completa");
    Padre p2 = new Padre (9,"bueno","incompleta");
    
        System.out.println("La nota del alumno es: " + p1.getNota());
        System.out.println("El comportamiento del hijo en la escuela es: " + p1.getComportamiento());
        System.out.println("La asistencia del hijo en la escula esta: " + p1.getAsistencia());
        
        System.out.println("------------------");
        System.out.println("La nota del alumno es: " + p2.getNota());
        System.out.println("El comportamiento del hijo en la escuela es: " + p2.getComportamiento());
        System.out.println("La asistencia del hijo en la escula esta: " + p2.getAsistencia());
        
    
    
    }

    
}
