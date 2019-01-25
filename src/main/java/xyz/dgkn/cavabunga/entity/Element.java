package xyz.dgkn.cavabunga.entity;

import java.util.List;

public interface Element {
    void validate();

    Participant getOwner();
    void setOwner(Participant owner);

    Element getParent();
    void setParent(Element parent);

    List<Meta> getMetaData();
    void addMeta(Meta meta);
    void removeMeta(Meta meta);
}
