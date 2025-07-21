package zendesk.core;

/* loaded from: classes5.dex */
public enum AuthenticationType {
    JWT("jwt"),
    ANONYMOUS("anonymous");

    private final String authenticationType;

    AuthenticationType(String str) {
        this.authenticationType = str;
    }

    static AuthenticationType getAuthType(String str) {
        AuthenticationType authenticationType = JWT;
        if (authenticationType.authenticationType.equals(str)) {
            return authenticationType;
        }
        AuthenticationType authenticationType2 = ANONYMOUS;
        if (authenticationType2.authenticationType.equals(str)) {
            return authenticationType2;
        }
        return null;
    }

    String getAuthenticationType() {
        return this.authenticationType;
    }
}
