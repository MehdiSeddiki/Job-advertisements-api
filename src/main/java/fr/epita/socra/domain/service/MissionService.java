package fr.epita.socra.domain.service;

import fr.epita.socra.domain.entity.MissionEntity;
import fr.epita.socra.presentation.mission.*;

import java.util.*;
import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class MissionService {
    public List<MissionEntity> findAllMission() {
        return null;
    }
    public MissionEntity findOneMission(long missionId)
    {
        return null;
    }
    public List<MissionEntity> searchMission(String search)
    {
        return null;
    }
    public MissionEntity createMission(CreateMissionRequest mission)
    {
        return null;
    }
    public MissionEntity updateMission(UpdateMissionRequest mission)
    {
        return null;
    }
}
