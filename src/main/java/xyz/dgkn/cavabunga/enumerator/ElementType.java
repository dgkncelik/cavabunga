package xyz.dgkn.cavabunga.enumerator;

import xyz.dgkn.cavabunga.entity.Element;
import xyz.dgkn.cavabunga.entity.element.*;

public enum ElementType {
    Alarm {
        public Element create(){
            return new Alarm();
        }
    },
    Calendar {
        public Element create(){
            return new Calendar();
        }
    },
    Contact {
        public Element create(){
            return new Contact();
        }
    },
    Daylight {
        public Element create(){
            return new Daylight();
        }
    },
    Event {
        public Element create(){
            return new Event();
        }
    },
    Freebusy {
        public Element create(){
            return new Freebusy();
        }
    },
    Journal {
        public Element create(){
            return new Journal();
        }
    },
    Standard {
        public Element create(){
            return new Standard();
        }
    },
    Timezone {
        public Element create(){
            return new Timezone();
        }
    };

    public Element create(){
        return null;
    }
}
