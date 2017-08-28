package pf.net.api.zipcodews.domains;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
public class Archipel {

    @Id
    @GeneratedValue
    private Long id;

    private String name;

    @OneToMany(mappedBy = "archipel")
    private List<Ile> iles;

}
