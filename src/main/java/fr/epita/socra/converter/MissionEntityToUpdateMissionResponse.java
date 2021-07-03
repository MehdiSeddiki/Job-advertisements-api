package fr.epita.socra.converter;

import fr.epita.socra.presentation.mission.UpdateMissionResponse;
import fr.epita.socra.data.model.Mission;

public class MissionEntityToUpdateMissionResponse implements Converter<Mission, UpdateMissionResponse>{
    @Override
    public UpdateMissionResponse convertNotNull(Mission from) {
        return null;
    }
}
