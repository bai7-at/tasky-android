package zendesk.core;

import com.zendesk.logger.Logger;
import defpackage.r48;

/* loaded from: classes5.dex */
class ApiAnonymousIdentity implements Identity {
    private static final transient String LOG_TAG = "ApiAnonymousIdentity";
    private String email;
    private String name;
    private String sdkGuid;

    ApiAnonymousIdentity(AnonymousIdentity anonymousIdentity, String str) {
        if (r48.d(str)) {
            this.sdkGuid = "";
            Logger.i(LOG_TAG, "SdkGuid cannot be null or empty.", new Object[0]);
        } else {
            this.sdkGuid = str;
        }
        if (anonymousIdentity == null) {
            Logger.i(LOG_TAG, "Identity is null.", new Object[0]);
        } else {
            this.email = anonymousIdentity.getEmail();
            this.name = anonymousIdentity.getName();
        }
    }
}
