package xyz.dgkn.cavabunga.entity.element;

import lombok.Data;
import xyz.dgkn.cavabunga.entity.Element;
import xyz.dgkn.cavabunga.entity.Meta;
import xyz.dgkn.cavabunga.entity.Participant;

import java.util.Date;
import java.util.List;
import java.util.UUID;

@Data
public class Calendar implements Element {
    private Participant owner;
    private Element parent;
    private List<Meta> metas;
    private UUID uuid;
    private Date createTime;
    private Date updateTime;

    @Override
    public void validate(){}

    @Override
    public Participant getOwner(){
        return null;
    }

    @Override
    public void setOwner(Participant owner){}

    @Override
    public Element getParent(){
        return null;
    }

    @Override
    public void setParent(Element parent){

    }

    @Override
    public List<Meta> getMetaData(){
        return null;
    }

    @Override
    public void addMeta(Meta meta){

    }

    @Override
    public void removeMeta(Meta meta){

    }

}
