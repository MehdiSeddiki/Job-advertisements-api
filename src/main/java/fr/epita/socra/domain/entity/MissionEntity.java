package fr.epita.socra.domain.entity;

import java.util.Date;

public record MissionEntity(
        String location,
        int duration,
        int price,
        float remote,
        Date beginning,
        String job,
        String context,
        String description,
        long clientId) {
}