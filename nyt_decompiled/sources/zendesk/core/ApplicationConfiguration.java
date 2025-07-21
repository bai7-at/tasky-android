package zendesk.core;

/* loaded from: classes5.dex */
public class ApplicationConfiguration {
    private String applicationId;
    private String oauthClientId;
    private String zendeskUrl;

    public ApplicationConfiguration(String str, String str2, String str3) {
        this.applicationId = str;
        this.zendeskUrl = str2;
        this.oauthClientId = str3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ApplicationConfiguration applicationConfiguration = (ApplicationConfiguration) obj;
        String str = this.applicationId;
        if (str == null ? applicationConfiguration.applicationId != null : !str.equals(applicationConfiguration.applicationId)) {
            return false;
        }
        String str2 = this.zendeskUrl;
        if (str2 == null ? applicationConfiguration.zendeskUrl != null : !str2.equals(applicationConfiguration.zendeskUrl)) {
            return false;
        }
        String str3 = this.oauthClientId;
        return str3 != null ? str3.equals(applicationConfiguration.oauthClientId) : applicationConfiguration.oauthClientId == null;
    }

    public String getApplicationId() {
        return this.applicationId;
    }

    public String getOauthClientId() {
        return this.oauthClientId;
    }

    public String getZendeskUrl() {
        return this.zendeskUrl;
    }

    public int hashCode() {
        String str = this.applicationId;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.zendeskUrl;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.oauthClientId;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }
}
