package hijo;


public class Padre {
    
    int nota;
    String comportamiento;
    String asistencia;

    public Padre() {
    }

    public Padre(int nota, String comportamiento, String asistencia) {
        this.nota = nota;
        this.comportamiento = comportamiento;
        this.asistencia = asistencia;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
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