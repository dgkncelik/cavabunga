package xyz.dgkn.cavabunga.enumerator;

import xyz.dgkn.cavabunga.entity.Authorization;
import xyz.dgkn.cavabunga.entity.authorization.ParticipantAuthorization;

public enum AuthorizationType {
    ParticipantAuthorization {
        public Authorization create(){
            return new ParticipantAuthorization();
        }
    };

    public Authorization create(){
        return null;
    }
}
