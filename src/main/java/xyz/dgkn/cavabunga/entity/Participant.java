package xyz.dgkn.cavabunga.entity;

import java.util.List;

public interface Participant {
    void validate();

    Participant getParent();
    void setParent(Participant parent);

    List<Authorization> getAuthorizations();
    void addAuthorization(Authorization auth);
    void removeAuthorization(Authorization authorization);

    List<Meta> getMetaData();
    void addMeta(Meta meta);
    void removeMeta(Meta meta);
}
