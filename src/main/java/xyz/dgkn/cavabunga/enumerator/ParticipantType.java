package xyz.dgkn.cavabunga.enumerator;

import xyz.dgkn.cavabunga.entity.Participant;
import xyz.dgkn.cavabunga.entity.participant.Group;
import xyz.dgkn.cavabunga.entity.participant.Resource;
import xyz.dgkn.cavabunga.entity.participant.User;

public enum ParticipantType {
    User {
        public Participant create(){
            return new User();
        }
    },
    Group {
        public Participant create(){
            return new Group();
        }
    },
    Resource {
        public Participant create(){
            return new Resource();
        }
    };

    public Participant create(){
        return null;
    }
}
