package xyz.dgkn.cavabunga.factory;

import xyz.dgkn.cavabunga.entity.Meta;
import xyz.dgkn.cavabunga.enumerator.MetaType;

public class MetaFactory {
    public Meta createMeta(MetaType metaType){
        return metaType.create();
    }
}
