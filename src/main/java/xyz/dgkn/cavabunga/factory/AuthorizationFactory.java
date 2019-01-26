package xyz.dgkn.cavabunga.factory;

import xyz.dgkn.cavabunga.entity.Authorization;
import xyz.dgkn.cavabunga.enumerator.AuthorizationType;

public class AuthorizationFactory {
    public Authorization createAuthorization(AuthorizationType authorizationType){
        return authorizationType.create();
    }
}
