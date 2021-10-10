package com.caglardurmaz.readingisgood.domain;

import com.caglardurmaz.readingisgood.model.UserSession;

import java.util.HashMap;
import java.util.Map;

public class SessionEngine {
    private static Map<String, UserSession> sessionStorage;
    private static SessionEngine instance;

    private SessionEngine() {
        sessionStorage = new HashMap<>();
    }

    public static synchronized SessionEngine getInstance() {
        if (instance == null) {
            instance = new SessionEngine();
        }
        return instance;
    }

    public Map<String, UserSession> getGameStorage() {
        return sessionStorage;
    }

    public void setSessionStorageStorage(UserSession userSession) {
        sessionStorage.put(userSession.getSessionId(), userSession);
    }

}
