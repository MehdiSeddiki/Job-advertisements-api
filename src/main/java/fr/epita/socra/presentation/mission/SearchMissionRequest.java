package fr.epita.socra.presentation.mission;

import lombok.*;

import javax.validation.constraints.NotEmpty;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@With
public class SearchMissionRequest {
    @NotEmpty
    private String search;
}
