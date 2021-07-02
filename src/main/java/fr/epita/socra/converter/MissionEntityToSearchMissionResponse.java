package fr.epita.socra.converter;

import fr.epita.socra.presentation.mission.SearchMissionResponse;
import fr.epita.socra.data.model.Mission;

public class MissionEntityToSearchMissionResponse  implements Converter<Mission, SearchMissionResponse>{
    @Override
    public SearchMissionResponse convertNotNull(Mission from) {
        return null;
    }
}
