package fr.epita.socra.converter;

import fr.epita.socra.domain.entity.MissionEntity;
import fr.epita.socra.presentation.mission.CreateMissionResponse;

public class MissionEntityToCreateMissionResponse implements Converter<MissionEntity, CreateMissionResponse> {
    @Override
    public CreateMissionResponse convertNotNull(MissionEntity from) {
        return new CreateMissionResponse(
                from.location(),
                from.duration(),
                from.price(),
                from.remote(),
                from.beginning(),
                from.job(),
                from.context(),
                from.description(),
                from.clientId()
        );
    }
}
