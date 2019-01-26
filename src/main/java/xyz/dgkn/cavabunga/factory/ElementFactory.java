package xyz.dgkn.cavabunga.factory;

import xyz.dgkn.cavabunga.entity.Element;
import xyz.dgkn.cavabunga.enumerator.ElementType;

public class ElementFactory {
    public Element createElement(ElementType elementType){
        return elementType.create();
    }
}
