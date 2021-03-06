package fr.epita.socra.data.model;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import io.smallrye.common.constraint.NotNull;
import io.smallrye.common.constraint.Nullable;
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
    @Column(nullable = false)
    private String location;

    @NotNull
    @Column(nullable = false)
    private int duration;

    @Nullable
    @Column(nullable = true)
    private int price;

    @Column(nullable = false)
    @PositiveOrZero(message = "Remote should not be negative")
    @Max(value = 1, message = "Remote should not be greater than 1")
    private float remote;

    @NotNull
    @Column(nullable = false)
    private Date beginning;

    @NotEmpty
    @Column(nullable = false)
    private String job;

    @NotEmpty
    @Column(nullable = false)
    private String context;

    @NotEmpty
    @Column(nullable = false)
    private String description;

    @ManyToOne
    @NotNull
    private Client client;
}
