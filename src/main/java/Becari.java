import jakarta.persistence.Basic;
import jakarta.persistence.Entity;

@Entity
class Becari extends Persona {
    @Basic
    private double nota;

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }
}