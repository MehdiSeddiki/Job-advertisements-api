package fr.epita.socra.converter;

import fr.epita.socra.domain.entity.MissionEntity;
import fr.epita.socra.presentation.mission.CreateMissionRequest;

public class CreateMissionRequestToMissionEntity implements Converter<CreateMissionRequest, MissionEntity> {
    @Override
    public MissionEntity convertNotNull(CreateMissionRequest from) {
        return new MissionEntity(
                from.getLocation(),
                from.getDuration(),
                from.getPrice(),
                from.getRemote(),
                from.getBeginning(),
                from.getJob(),
                from.getContext(),
                from.getDescription(),
                from.getClientId()
        );
    }
}
