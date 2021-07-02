package fr.epita.socra.converter;

import fr.epita.socra.domain.entity.MissionEntity;
import fr.epita.socra.presentation.mission.UpdateMissionRequest;

public class UpdateMissionRequestToMissionEntity implements Converter<UpdateMissionRequest, MissionEntity> {
    @Override
    public MissionEntity convertNotNull(UpdateMissionRequest from) {
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
