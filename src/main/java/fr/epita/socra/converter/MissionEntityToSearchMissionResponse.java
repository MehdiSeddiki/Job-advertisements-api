package fr.epita.socra.converter;

import fr.epita.socra.domain.entity.MissionEntity;
import fr.epita.socra.presentation.mission.SearchMissionResponse;

public class MissionEntityToSearchMissionResponse  implements Converter<MissionEntity, SearchMissionResponse>{
    @Override
    public SearchMissionResponse convertNotNull(MissionEntity from) {
        return new SearchMissionResponse(
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
