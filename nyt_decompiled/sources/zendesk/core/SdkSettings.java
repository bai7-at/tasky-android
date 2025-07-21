package zendesk.core;

import java.io.Serializable;
import java.util.Date;

/* loaded from: classes5.dex */
class SdkSettings implements Serializable {
    private String authentication;
    private Date updatedAt;

    SdkSettings() {
    }

    AuthenticationType getAuthentication() {
        return AuthenticationType.getAuthType(this.authentication);
    }

    Date getUpdatedAt() {
        if (this.updatedAt == null) {
            return null;
        }
        return new Date(this.updatedAt.getTime());
    }
}
