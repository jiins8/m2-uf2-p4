import jakarta.persistence.*;

@Entity
@Table(name = "PERSONA")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
class Persona {
    @Id
    @Column(name = "ident")
    private int id;
    private String nom;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
}