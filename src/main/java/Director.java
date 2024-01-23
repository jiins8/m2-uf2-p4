import jakarta.persistence.Basic;
import jakarta.persistence.Entity;

@Entity
class Director extends Empleat {
    @Basic
    private double pressupostAnual;

    public double getPressupostAnual() {
        return pressupostAnual;
    }

    public void setPressupostAnual(double pressupostAnual) {
        this.pressupostAnual = pressupostAnual;
    }
}