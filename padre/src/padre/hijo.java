package padre;


public class hijo {
    
    double notaParcial;
    String comportamiento;
    String asistencia;

    public hijo() {
    }
    
    
    public hijo(double notaParcial, String comportamiento, String asistencia) {
        this.notaParcial = notaParcial;
        this.comportamiento = comportamiento;
        this.asistencia = asistencia;
    }

    public double getNotaParcial() {
        return notaParcial;
    }

    public void setNotaParcial(double notaParcial) {
        this.notaParcial = notaParcial;
    }

    public String getComportamiento() {
        return comportamiento;
    }

    public void setComportamiento(String comportamiento) {
        this.comportamiento = comportamiento;
    }

    public String getAsistencia() {
        return asistencia;
    }

    public void setAsistencia(String asistencia) {
        this.asistencia = asistencia;
    }
    
    
    
    
    
}
