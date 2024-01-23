import jakarta.persistence.Basic;
import jakarta.persistence.Entity;

@Entity
class Empleat extends Persona {
    @Basic
    private double salari;

    public double getSalari() {
        return salari;
    }

    public void setSalari(double salari) {
        this.salari = salari;
    }
}
