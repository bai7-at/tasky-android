package zendesk.core;

import com.zendesk.logger.Logger;
import defpackage.r48;

/* loaded from: classes5.dex */
public final class JwtIdentity implements Identity {
    private static final String LOG_TAG = "JwtIdentity";
    private final String token;

    public JwtIdentity(String str) {
        if (r48.d(str)) {
            Logger.d(LOG_TAG, "A null or empty JWT was specified. This will not work. Please check your initialisation of JwtIdentity!", new Object[0]);
        }
        this.token = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || JwtIdentity.class != obj.getClass()) {
            return false;
        }
        JwtIdentity jwtIdentity = (JwtIdentity) obj;
        String str = this.token;
        return str == null ? jwtIdentity.token == null : str.equals(jwtIdentity.token);
    }

    public String getJwtUserIdentifier() {
        return this.token;
    }

    public int hashCode() {
        String str = this.token;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }
}
