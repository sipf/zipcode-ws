package pf.net.api.zipcodews.domains;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
public class Ile {

    @Id
    @GeneratedValue
    private Long id;

    private String name;

    @ManyToOne
    @JoinColumn(name = "archipel_id")
    private Archipel archipel;

    @OneToMany(mappedBy = "ile")
    private List<Commune> communes;

}
