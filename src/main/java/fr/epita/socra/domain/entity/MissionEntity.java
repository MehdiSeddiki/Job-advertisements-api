package fr.epita.socra.domain.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class MissionEntity {
    long id;
    String location;
    int duration;
    int price;
    float remote;
    Date beginning;
    String job;
    String context;
    String description;
    long clientId;
}