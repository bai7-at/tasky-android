package zendesk.core;

/* loaded from: classes5.dex */
class PushRegistrationRequest {
    private final String deviceType = "android";
    private String identifier;
    private String locale;
    private String sdkGuid;
    private String tokenType;

    PushRegistrationRequest() {
    }

    String getIdentifier() {
        return this.identifier;
    }

    String getLocale() {
        return this.locale;
    }

    String getSdkGuid() {
        return this.sdkGuid;
    }

    String getTokenType() {
        return this.tokenType;
    }

    void setIdentifier(String str) {
        this.identifier = str;
    }

    void setLocale(String str) {
        this.locale = str;
    }

    void setSdkGuid(String str) {
        this.sdkGuid = str;
    }

    void setTokenType(String str) {
        this.tokenType = str;
    }
}
