package fr.epita.socra.converter;

import fr.epita.socra.presentation.mission.FindOneMissionResponse;
import fr.epita.socra.data.model.Mission;

public class MissionEntityToFindOneMissionResponse implements Converter<Mission, FindOneMissionResponse> {

    @Override
    public FindOneMissionResponse convertNotNull(Mission from) {
        return null;
    }
}
