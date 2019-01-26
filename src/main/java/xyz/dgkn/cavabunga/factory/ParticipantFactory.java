package xyz.dgkn.cavabunga.factory;

import xyz.dgkn.cavabunga.entity.Participant;
import xyz.dgkn.cavabunga.enumerator.ParticipantType;

public class ParticipantFactory {
    public Participant createParticipant(ParticipantType participantType){
        return participantType.create();
    }
}
