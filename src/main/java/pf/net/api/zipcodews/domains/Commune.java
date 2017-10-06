package pf.net.api.zipcodews.domains;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Commune {

    @Id
    @GeneratedValue
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String code;

    @ManyToOne
    @JoinColumn(name = "ile_id")
    private Ile ile;


}
