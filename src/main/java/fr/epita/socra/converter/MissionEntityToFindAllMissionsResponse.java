package fr.epita.socra.converter;

import fr.epita.socra.presentation.mission.FindAllMissionsResponse;
import fr.epita.socra.data.model.Mission;
import javax.enterprise.context.ApplicationScoped;


@ApplicationScoped
public class MissionEntityToFindAllMissionsResponse implements Converter<Mission, FindAllMissionsResponse>{
    @Override
    public FindAllMissionsResponse convertNotNull(Mission from) {
        return null;
    }
}