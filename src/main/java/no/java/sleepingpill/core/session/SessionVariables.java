package no.java.sleepingpill.core.session;

public class SessionVariables {
    public static final String DATA_OBJECT = "data";
    public static final String SPEAKER_ARRAY = "speakers";
    public static final String POSTED_BY_MAIL = "postedBy";
    public static final String VALUE_KEY = "value";
    public static final String PRIVATE_FLAG = "privateData";
    public static final String SESSION_STATUS = "status";

    private SessionVariables() {
        throw new IllegalAccessError("No instance allowed");
    }
}
