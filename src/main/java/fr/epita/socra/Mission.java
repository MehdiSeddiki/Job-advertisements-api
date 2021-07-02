package fr.epita.socra;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import io.smallrye.common.constraint.NotNull;
import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.*;
import java.util.Date;

@Entity
@Table(name = "missions")
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@With
public class Mission extends PanacheEntityBase {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @NotNull
    private String location;

    @NotNull
    private Date duration;

    private int price;

    @PositiveOrZero(message = "Remote should not be negative")
    @Max(value = 1, message = "Remote should not be greater than 1")
    private float remote;

    @NotNull
    private Date beginning;

    @NotEmpty
    private String job;

    @NotEmpty
    private String context;

    @NotEmpty
    private String description;

    @ManyToOne
    @Column(name = "client_id")
    @NotNull
    private Client client;
}
