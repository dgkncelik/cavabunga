package xyz.dgkn.cavabunga.entity.authorization;

import lombok.Data;
import xyz.dgkn.cavabunga.entity.Authorization;

@Data
public class ParticipantAuthorization implements Authorization {
    private String authKey;

    @Override
    public void setAuthKey(String key){
    }

    @Override
    public String getAuthKey(){
        return null;
    }
}
