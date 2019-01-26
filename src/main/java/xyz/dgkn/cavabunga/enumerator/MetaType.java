package xyz.dgkn.cavabunga.enumerator;

import xyz.dgkn.cavabunga.entity.Meta;
import xyz.dgkn.cavabunga.entity.meta.ElementMeta;
import xyz.dgkn.cavabunga.entity.meta.ParticipantMeta;

public enum MetaType {
    ElementMeta {
        public Meta create(){
            return new ElementMeta();
        }
    },
    ParticipantMeta {
        public Meta create(){
            return new ParticipantMeta();
        }
    };

    public Meta create(){
        return null;
    }
}
