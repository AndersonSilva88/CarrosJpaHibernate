package domain;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "TB_ACESSORIOS")
public class Acessorios {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "acessorios_seq")
    @SequenceGenerator(name = "acessorios_seq", sequenceName = "sq_acessorios", initialValue = 1, allocationSize = 10)
    private Long id;
    @Column(name = "CDPLAYER", length = 10, nullable = false)
    private String cdPlayer;
    @Column(name = "STEP", length = 10, nullable = false)
    private String step;

    @ManyToMany(mappedBy = "acessorios")
    private List<Carro> carros;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCdPlayer() {
        return cdPlayer;
    }

    public void setCdPlayer(String cdPlayer) {
        this.cdPlayer = cdPlayer;
    }

    public String getStep() {
        return step;
    }

    public void setStep(String step) {
        this.step = step;
    }

    public List<Carro> getCarros() {
        return carros;
    }

    public void setCarros(List<Carro> carros) {
        this.carros = carros;
    }
}
