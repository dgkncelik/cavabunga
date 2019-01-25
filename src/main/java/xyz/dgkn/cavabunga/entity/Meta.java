package xyz.dgkn.cavabunga.entity;

public interface Meta {
    void validate();

    String getMetaKey();
    void setMetaKey(String key);

    String getMetaValue();
    void setMetaValue(String value);
}
