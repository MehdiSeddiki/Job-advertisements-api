package fr.epita.socra.converter;

import fr.epita.socra.domain.entity.MissionEntity;
import fr.epita.socra.presentation.mission.UpdateMissionResponse;

public class MissionEntityToUpdateMissionResponse implements Converter<MissionEntity, UpdateMissionResponse>{
    @Override
    public UpdateMissionResponse convertNotNull(MissionEntity from) {
        return new UpdateMissionResponse(
                from.location(),
                from.duration(),
                from.price(),
                from.remote(),
                from.beginning(),
                from.job(),
                from.context(),
                from.description()
        );
    }
}
