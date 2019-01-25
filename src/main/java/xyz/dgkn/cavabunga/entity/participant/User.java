package xyz.dgkn.cavabunga.entity.participant;

import lombok.Data;
import xyz.dgkn.cavabunga.entity.Authorization;
import xyz.dgkn.cavabunga.entity.Meta;
import xyz.dgkn.cavabunga.entity.Participant;
import java.util.List;


@Data
public class User implements Participant {
    private Participant parent;
    private List<Authorization> authorizations;
    private List<Meta> metas;


    public void validate(){}

    @Override
    public Participant getParent(){
        return null;
    }

    @Override
    public void setParent(Participant parent){

    }

    @Override
    public List<Authorization> getAuthorizations(){
        return null;
    }

    @Override
    public void addAuthorization(Authorization auth){

    }

    @Override
    public void removeAuthorization(Authorization auth){

    }

    @Override
    public List<Meta> getMetaData() {
        return null;
    }

    @Override
    public void addMeta(Meta meta){

    }

    @Override
    public void removeMeta(Meta meta){

    }
}
