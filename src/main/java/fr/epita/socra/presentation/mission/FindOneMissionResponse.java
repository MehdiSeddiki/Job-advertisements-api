package fr.epita.socra.presentation.mission;

import io.smallrye.common.constraint.NotNull;
import io.smallrye.common.constraint.Nullable;
import lombok.*;

import javax.validation.constraints.Max;
import javax.validation.constraints.NotEmpty;
import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@With
public class FindOneMissionResponse {
    @NotNull
    private String location;

    @NotNull
    private int duration;

    @Nullable
    private int price;

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
}
